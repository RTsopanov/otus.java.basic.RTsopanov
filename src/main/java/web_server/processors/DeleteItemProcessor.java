package web_server.processors;

import web_server.HttpRequest;
import web_server.app.ItemsRepository;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class DeleteItemProcessor implements RequestProcessor {
    private ItemsRepository itemsRepository;


    public DeleteItemProcessor( ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }



@Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
        itemsRepository.delete(request.getId());

        String response = "" +
                "HTTP/1.1 200 OK\r\n" +
                "Content-Type: text/html\r\n" +
                "\r\n" +
                "<html><body><h1>Item deleted</h1></body></html>";
        out.write(response.getBytes(StandardCharsets.UTF_8));
    }
}

