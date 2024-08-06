package web_server;

public class Application {


    public static void main(String[] args) {
        new HttpServer(8889).start();

    }
}
