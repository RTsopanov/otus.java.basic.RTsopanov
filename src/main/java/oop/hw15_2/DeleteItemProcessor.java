package oop.hw15_2;

import com.google.gson.Gson;
import oop.hw15_2.app.Item;
import oop.hw15_2.app.ItemsRepository;
import oop.hw15_2.processors.RequestProcessor;

import java.io.IOException;
import java.io.OutputStream;

import static java.lang.Integer.parseInt;

public class DeleteItemProcessor implements RequestProcessor {
    private ItemsRepository itemsRepository;


    public DeleteItemProcessor( ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }



@Override
    public void execute(HttpRequest request, OutputStream out) throws IOException {
        Long id = Long.valueOf(parseInt(request.getBody()));
        itemsRepository.delete(id);
    }
}

