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

            ExecutorService service = Executors.newFixedThreadPool(2);


                try (ServerSocket serverSocket = new ServerSocket(port)) {
                    System.out.println("Сервер запущен на порту: " + port);


                    while (true) {
                        try (Socket socket = serverSocket.accept()) {

                            if(socket.isClosed()) {
                                service.execute(() -> {
                                    byte[] buffer = new byte[8192];
                                    int n = 0;
                                    try {
                                        n = socket.getInputStream().read(buffer);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    String rawRequest = new String(buffer, 0, n);
                                    if(n < 1){
                                        return;
                                    }
                                    HttpRequest request = new HttpRequest(rawRequest);
                                    request.printInfo(true);
                                    try {
                                        dispatcher.execute(request, socket.getOutputStream());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                });
                            }


                            byte[] buffer = new byte[8192];
                            int n = socket.getInputStream().read(buffer);
                            String rawRequest = new String(buffer, 0, n);
                            if(n < 1){
                                continue;
                            }
                            HttpRequest request = new HttpRequest(rawRequest);
                            request.printInfo(true);
                            dispatcher.execute(request, socket.getOutputStream());
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

    }


}
