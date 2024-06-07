package oop.hw9.server;
import java.io.*;
import java.net.Socket;
import java.util.Arrays;

public class PingServer {
    private final DataInputStream IN;
    private final DataOutputStream OUT;


    public PingServer(Socket client) throws IOException {
    this.IN = new DataInputStream(new BufferedInputStream(client.getInputStream()));
    this.OUT = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));

    }


    public void sendServer (String str) throws IOException {
//        OUT.write(str.getBytes());
        OUT.writeUTF(str);
        OUT.flush();
    }

    public String read() throws IOException {
        return IN.readUTF();
    }

    public  String operationNum(String str){
        int sum = 0;
        int num1 = 0;
        int num2 = 0;
        char simvol = '0';
        String res = "1";


        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            num1 = Character.getNumericValue(arr[0]);
            num2 = Character.getNumericValue(arr[2]);
            simvol = arr[1];
        }


        for (int i = 0; i < arr.length; i++) {
            if(simvol == '+'){
                sum = num1 + num2;
                res = num1 + " " + simvol + " " + num2 + " " + " = " + sum;
            }
            else if(simvol == '-'){
                sum = num1 - num2;
                res = num1 + " " + simvol + " " + num2 + " " + " = " + sum;
            }
            else if(simvol == '*'){
                sum = num1 * num2;
                res = num1 + " " + simvol + " " + num2 + " " + " = " + sum;
            }
            else if(simvol == '/'){
                if(num2 == 0){
                    res = "Делить на ноль нельзя!";
                }
                sum = num1 / num2;
                res = num1 + " " + simvol + " " + num2 + " " + " = " + sum;

            }
            else {
                res = "Введите корректные данные";
            }

            return res;



        }


        return res;
    }
}
