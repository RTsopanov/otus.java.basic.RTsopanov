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
    private ItemsRepository itemsRepository;
    private ItemDB itemDB;

    public GetAllItemsProcessor(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public GetAllItemsProcessor(ItemDB itemDB) {
        this.itemDB = itemDB;
    }

    @Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
//        List<Item> items = itemsRepository.getItems();
        Gson gson = new Gson();
        itemDB.showAllItems();
        String itemsJson = gson.toJson(itemDB);
        String response = "" +
                "HTTP/1.1 200 OK\r\n" +
                "Content-Type: text/html\r\n" +
                "\r\n" +
                "<html><body><h1>OK</h1></body></html>";
        out.write(response.getBytes(StandardCharsets.UTF_8));
    }
}
