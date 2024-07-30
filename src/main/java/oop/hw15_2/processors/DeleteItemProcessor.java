package oop.hw15_2.processors;

import oop.hw15_2.HttpRequest;
import oop.hw15_2.app.ItemsRepository;

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
        itemsRepository.delete(request.getId());
    }
}

