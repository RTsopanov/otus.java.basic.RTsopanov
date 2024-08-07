package web_server.processors;

import com.google.gson.Gson;
import web_server.HttpRequest;
import web_server.app.Item;
import web_server.app.ItemDB;
import web_server.app.ItemsRepository;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GetAllItemsProcessor implements RequestProcessor {
    private ItemDB itemDB;


    public GetAllItemsProcessor(ItemDB itemDB) {
        this.itemDB = itemDB;
    }

    @Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
        Gson gson = new Gson();
        itemDB.showAllItems();
        String itemsJson = gson.toJson(itemDB.getResult());
        String response = "" +
                "HTTP/1.1 200 OK\r\n" +
                "Content-Type: application/json\r\n" +
                "\r\n" +
                itemsJson;
        out.write(response.getBytes(StandardCharsets.UTF_8));
    }
}
