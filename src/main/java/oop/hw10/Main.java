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
                myThreadOne(array);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                myThreadTwo(array);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                myThreadThree(array);
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                myThreadFour(array);
            }
        });



        long startTimeTwo = System.currentTimeMillis();
        t1.start();
//        t1.join();

        t2.start();
//        t2.join();

        t3.start();
//        t3.join();

        t4.start();
//        t4.join();


        long endTimeTwo = System.currentTimeMillis();
        System.out.print("\nВремя выполнения №2: ");
        System.out.println(endTimeTwo - startTimeTwo);



    }
}

