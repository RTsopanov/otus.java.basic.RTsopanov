package web_server.processors;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import web_server.BadRequestException;
import web_server.HttpRequest;
import web_server.app.Item;
import web_server.app.ItemDB;
import web_server.app.ItemsRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class CreateNewItemProcessor implements RequestProcessor {
    private ItemsRepository itemsRepository;
    private ItemDB itemDB;


    private static final Logger logger = LogManager.getLogger(CreateNewItemProcessor.class.getName());


    public CreateNewItemProcessor(ItemDB itemDB) {
        this.itemDB = itemDB;
    }


    @Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
        try {
            itemDB.add(request);
            String response = "" +
                    "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/html\r\n" +
                    "\r\n" +
                    "<html><body><h1>Item created</h1></body></html>";
            out.write(response.getBytes(StandardCharsets.UTF_8));
        } catch (JsonParseException e) {
            e.printStackTrace();
            logger.error("Некорректный формат входящего JSON объекта");
            throw new BadRequestException("Некорректный формат входящего JSON объекта");
        }
    }
}
