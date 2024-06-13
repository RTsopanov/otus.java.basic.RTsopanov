package oop.hw9.client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        int num1 = 0;
        int num2 = 0;
        String sim = "null";
        Scanner scanner = new Scanner(System.in);
        String userOperation;

        try(Socket socket = new Socket("localhost",9999)){
        PingClient pingClient = new PingClient(socket);

            String result = pingClient.read();
            System.out.println(result);

            System.out.println("Введите первое число: ");
            num1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            num2 = scanner.nextInt();
            System.out.println("Укажите операцию для чисел");
            sim = scanner.next();

            userOperation = num1 + " " + sim + " " + num2;
            pingClient.send(userOperation);

             result = pingClient.read();
            System.out.println(result);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
