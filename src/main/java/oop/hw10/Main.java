package oop.hw10;

import java.util.Arrays;

import static oop.hw10.MyClass.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        double[] array = new double[100_000_000];
        double num = 1.0;
        for (int i = 0; i < array.length; i++) {
            array[i] += num;
            num++;
        }


        long startTime = System.currentTimeMillis();
        myThread(array);
        long endTime = System.currentTimeMillis();
        System.out.print("\nВремя выполнения №1: ");
        System.out.println(endTime - startTime);


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 25_000_000; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });


        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 25_000_000; i < 50_000_000; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 50_000_000; i < 75_000_000; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t4 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 75_000_000; i < 100_000_000; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });



        long startTimeTwo = System.currentTimeMillis();

        t1.start();

        t2.start();

        t3.start();

        t4.start();

        long endTimeTwo = System.currentTimeMillis();


        System.out.print("\nВремя выполнения №2: ");
        System.out.println(endTimeTwo - startTimeTwo);


    }
}

