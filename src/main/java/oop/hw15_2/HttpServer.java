package oop.hw15_2;

import oop.hw15_2.processors.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
    private int port;
    private Dispatcher dispatcher;
    private static final Logger logger = LogManager.getLogger(HttpServer.class.getName());

    public HttpServer(int port) {
        this.port = port;
        this.dispatcher = new Dispatcher();
    }

    public void start() {
        ExecutorService service = Executors.newFixedThreadPool(2);
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            logger.info("Сервер запущен на порту: " + port);

            while (true) {
                try (Socket socket = serverSocket.accept()) {

                    if (socket.isClosed()) {
                        service.execute(() -> {
                            byte[] buffer = new byte[8192];
                            int n = 0;
                            try {
                                n = socket.getInputStream().read(buffer);
                            } catch (IOException e) {
                                logger.error(e);
                            }
                            String rawRequest = new String(buffer, 0, n);
                            if (n < 1) {
                                return;
                            }
                            HttpRequest request = new HttpRequest(rawRequest);
                            request.printInfo();
                            try {
                                dispatcher.execute(request, socket.getOutputStream());
                            } catch (IOException e) {
                                logger.error(e);

                            }
                        });
                    }

                    byte[] buffer = new byte[8192];
                    int n = socket.getInputStream().read(buffer);
                    if (n < 1) {
                        continue;
                    }
                    String rawRequest = new String(buffer, 0, n);
                    HttpRequest request = new HttpRequest(rawRequest);
                    request.printInfo();
                    dispatcher.execute(request, socket.getOutputStream());
                }
            }
        } catch (IOException e) {
            logger.error(e);
        }
    }
}
