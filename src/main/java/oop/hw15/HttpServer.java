package oop.hw15;

import oop.hw15.processors.*;
import oop.hw15.*;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
    private int port;
    private Dispatcher dispatcher;

    public HttpServer(int port) {
        this.port = port;
        this.dispatcher = new Dispatcher();
    }

    public void start() {
        int quantityThread = 10;

//        while(quantityThread == quantityThread){
            ExecutorService service = Executors.newFixedThreadPool(2);


                try (ServerSocket serverSocket = new ServerSocket(port)) {
                    System.out.println("Сервер запущен на порту: " + port);
                    while (true) {
                        service.execute(() -> {
                        try (Socket socket = serverSocket.accept()) {
                            System.out.println("Клиент подключился");
                            byte[] buffer = new byte[8192];
                            int n = socket.getInputStream().read(buffer);
                            String rawRequest = new String(buffer, 0, n);
                            HttpRequest request = new HttpRequest(rawRequest);
                            request.printInfo(true);
                            dispatcher.execute(request, socket.getOutputStream());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        });
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


//        }





    }


}
