package oop.hw9.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        String operation = "+, -, *, /";
        ServerSocket servSoket = new ServerSocket(9999);
        while(true) {
            Socket client = servSoket.accept();
            PingServer pingServer = new PingServer(client);
            System.out.println("Клиент подключился");


            pingServer.sendServer(operation);
            System.out.println("данные передал " + operation);


            String result = pingServer.read();

            pingServer.sendServer(pingServer.operationNum(result));
            System.out.println("данные отпрпавил");

        }
    }

}
