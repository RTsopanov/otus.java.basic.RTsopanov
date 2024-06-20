package oop.hw10;

import java.util.Arrays;

public class MyClass {


    public static void myThread(double[] array) {
        for (int i = 0; i < 100_000_000; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

}
