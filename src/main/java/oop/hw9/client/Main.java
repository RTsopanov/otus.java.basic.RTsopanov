package oop.hw9.client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        String userOperation;

        try(Socket socket = new Socket("localhost",9999)){
        PingClient pingClient = new PingClient(socket);

            String result = pingClient.read();
            System.out.println(result);

            System.out.println("Введите данные: ");
            userOperation = scanner.nextLine();
            pingClient.send(userOperation);

             result = pingClient.read();
            System.out.println(result);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
