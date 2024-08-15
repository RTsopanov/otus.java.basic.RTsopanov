package web_server;


import java.beans.JavaBean;
import java.util.jar.JarEntry;


public class Application {

    public static void main(String[] args) {

        System.getProperties().put("port 1", "8185");
        System.getProperties().put("port 2", "8186");

        System.out.println(System.getProperty("user.name"));
        new HttpServer(Integer.parseInt(System.getProperty("port 2"))).start();



// TODO вариант №2 с использованием System.getProperty
//        System.getProperties().put("port 3", 8187);
//        new HttpServer((Integer) System.getProperties().getOrDefault("port 3", 8888)).start();

    }
}
