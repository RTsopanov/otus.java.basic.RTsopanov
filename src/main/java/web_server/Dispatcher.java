package web_server;


import com.google.gson.Gson;
import web_server.app.FileRead;
import web_server.app.ItemsRepository;
import web_server.app.ItemDB;
import web_server.processors.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Dispatcher {
    private Map<String, RequestProcessor> processors;
    private RequestProcessor defaultNotFoundRequestProcessor;
    private RequestProcessor defaultInternalServerErrorProcessor;
    private static final Logger logger = LogManager.getLogger(Dispatcher.class.getName());

    //TODO
    private ItemsRepository itemsRepository;
    private ItemDB itemDB;
    private FileRead file;

    public Dispatcher() {
        this.itemsRepository = new ItemsRepository();
        this.itemDB = new ItemDB();
        this.file = new FileRead();

        this.processors = new HashMap<>();
        this.processors.put("GET /", new HelloWorldRequestProcessor());
        this.processors.put("GET /another", new AnotherHelloWorldRequestProcessor());
        this.processors.put("GET /calculator", new CalculatorRequestProcessor());


        this.processors.put("GET /items", new GetAllItemsProcessor(itemDB));
        this.processors.put("GET /items?id", new GetItemProcessor(itemDB));
        this.processors.put("POST /items", new CreateNewItemProcessor(itemDB));
        this.processors.put("DELETE /items", new DeleteItemProcessor(itemDB));
        this.processors.put("PUT /items", new PutItemProcessor(itemDB));
        this.processors.put("GET .txt", new readFileProcessor(file));


//        this.processors.put("POST /items", new CreateNewItemProcessor(itemsRepository));
//        this.processors.put("DELETE /items", new DeleteItemProcessor(itemsRepository));
//        this.processors.put("GET /items", new GetAllItemsProcessor(itemsRepository));


        this.defaultNotFoundRequestProcessor = new DefaultNotFoundRequestProcessor();
        this.defaultInternalServerErrorProcessor = new DefaultInternalServerErrorRequestProcessor();
    }

    public void execute(HttpRequest request, OutputStream out) throws IOException {
        try {
            if (!processors.containsKey(request.getRoutingKey())) {
                defaultNotFoundRequestProcessor.execute(request, out);
                return;
            }
            processors.get(request.getRoutingKey()).execute(request, out);
        } catch (BadRequestException e) {
            logger.error(e);
            DefaultErrorDto defaultErrorDto = new DefaultErrorDto("CLIENT_DEFAULT_ERROR", e.getMessage());
            String jsonError = new Gson().toJson(defaultErrorDto);
            String response = "" +
                    "HTTP/1.1 400 Bad Request\r\n" +
                    "Content-Type: application/json\r\n" +
                    "\r\n" +
                    jsonError;
            out.write(response.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            logger.error(e);
            defaultInternalServerErrorProcessor.execute(request, out);
        }
    }
}
