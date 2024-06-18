package oop.hw10;

import java.util.Arrays;

public class MyClass {





    public static void myThread(double[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }



    public static void myThreadOne(double[] array){
        for (int i = 0; i < 25000; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }


    public static void myThreadTwo (double[] array){
        for (int i = 25000; i < 50000; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }


    public static void myThreadThree (double[] array){
        for (int i = 50000; i < 75000; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void myThreadFour (double[] array){
        for (int i = 75000; i < 100000; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
