package oop.hw13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    Object mon = new Object();
    static Main main = new Main();
    static String abc;

    public static void main(String[] args) throws InterruptedException {


        ExecutorService serv = Executors.newFixedThreadPool(3);
        serv.execute(() -> main.printA());
        serv.execute(() -> main.printB());
        serv.execute(() -> main.printC());
        serv.shutdown();

        serv.awaitTermination(10, TimeUnit.MILLISECONDS);
        System.out.println(abc);
    }


    public void printA() {
        synchronized (mon) {
            for (int i = 0; i < 5; i++) {
                if (abc == null) {
                    abc = "A";
                }

                while (abc.charAt(abc.length() - 1) != 'C') {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                abc += "A";
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
                        throw new RuntimeException(e);
                    }
                }
                abc += "B";
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
                        throw new RuntimeException(e);
                    }
                }
                abc += 'C';
                mon.notifyAll();
            }
        }
    }


}
