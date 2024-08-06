package web_server.processors;

import com.google.gson.Gson;
import web_server.HttpRequest;
import web_server.app.ItemDB;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class PutItemProcessor implements RequestProcessor {
    ItemDB itemDB;

    public PutItemProcessor(ItemDB itemDB) {
        this.itemDB = itemDB;
    }

    @Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
//        Gson gson = new Gson();
        itemDB.editItem(request);
//        String itemsJson = gson.toJson(itemDB.getResul());
        String response = "" +
                "HTTP/1.1 200 OK\r\n" +
                "Content-Type: text/html\r\n" +
                "\r\n" +
                "<html><body><h1>Item edited</h1></body></html>";
        out.write(response.getBytes(StandardCharsets.UTF_8));
    }
}
