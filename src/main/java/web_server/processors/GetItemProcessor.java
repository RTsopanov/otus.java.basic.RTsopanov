package web_server.processors;

import com.google.gson.Gson;
import web_server.HttpRequest;
import web_server.app.ItemDB;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class GetItemProcessor implements RequestProcessor{
    private ItemDB itemDB;

    public GetItemProcessor(ItemDB itemDB) {
        this.itemDB = itemDB;
    }

    @Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
        Gson gson = new Gson();
        itemDB.showItem(request.getId());
        String itemsJson = gson.toJson(itemDB.getResul());
        String response = "" +
                "HTTP/1.1 200 OK\r\n" +
                "Content-Type: application/json\r\n" +
                "\r\n" +
                itemsJson;
        out.write(response.getBytes(StandardCharsets.UTF_8));
    }
}
