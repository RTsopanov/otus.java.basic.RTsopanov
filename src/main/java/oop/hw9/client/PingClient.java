package oop.hw9.client;

import java.io.*;
import java.net.Socket;


public class PingClient {
    private final DataInputStream IN;
    private final DataOutputStream OUT;


    public PingClient(Socket socket) throws IOException {
        this.IN = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        this.OUT = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void send(String mesage) throws IOException {
        OUT.writeUTF(mesage);
        OUT.flush();
    }


    public String read() throws IOException {
        return IN.readUTF();
    }
}
