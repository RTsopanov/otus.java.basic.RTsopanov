package oop.hw13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    private final Object mon = new Object();
    private static Main main = new Main();
    private static StringBuilder  abc = new StringBuilder();

    public static void main(String[] args) throws InterruptedException {


        ExecutorService serv = Executors.newFixedThreadPool(3);
        serv.execute(() -> main.printA());
        serv.execute(() -> main.printB());
        serv.execute(() -> main.printC());
        serv.shutdown();

        if (!serv.awaitTermination(1, TimeUnit.SECONDS)) {
            serv.shutdownNow();
        }
        System.out.println(abc);
    }


    public void printA() {
        synchronized (mon) {
            for (int i = 0; i < 4; i++) {
                if (abc.length() == 0) {
                    abc.append("A");
                }

                while (abc.charAt(abc.length() - 1) != 'C') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                abc.append("A");
                mon.notifyAll();
            }
        }
    }


    public void printB() {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                while (abc.charAt(abc.length() - 1) != 'A') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {

                    }
                }
                abc.append("B");
                mon.notifyAll();
            }
        }
    }


    public void printC() {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                while (abc.charAt(abc.length() - 1) != 'B') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                abc.append("C");
                mon.notifyAll();
            }
        }
    }


}
