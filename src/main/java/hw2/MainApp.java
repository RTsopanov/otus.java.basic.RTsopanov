package hw2;


import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {


// 1
        printStr(3, "Привет");

//2
        int[] arr1 = {7, 2, 13, 24, 5};
        int[] arr2 = {154, 5, 7, 10, 7, 2, 13, 24, 5};
        int[] arr3 = {5, 1, 0, 6, 0, 4, 9};
        int[] arr4 = {1, 1, 1, 1, 1, 5};
        sumMetoda(arr3);

// 3
        numUrlMassiv(3, arr2);

// 4
        numPlusMassiv(2, arr1);


// 5
        sumMasMax(arr3);
    }


    // 1    ПОЧЕМУ тип данных int и String нельзя написать в одном println?
    // java ругается -  System.out.println(num,str);

    /*  ЗАДАНИЕ - Реализуйте метод, принимащий в качестве аргументов целое число и строку,
     и печатающий в консоль строку указанное количество раз   */
    public static void printStr(int num, String str) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }


    // 2
    /*  ЗАДАНИЕ - Реализуйте метод, принимащий в качестве аргумента целочисленный массив,
     суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль  */
    public static void sumMetoda(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }


    // 3
    /*  ЗАДАНИЕ - Реализуйте метод, принимащий в качестве аргументов цело число и ссылку на целочисленный
     массив, метод должен заполнить каждую ячейку массива указанным числом  */
    public static void numUrlMassiv(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
        }
        System.out.println(Arrays.toString(array));
    }

    // 4
    /* ЗАДАНИЕ - Реализуйте метод, принимащий в качестве аргументов цело число и ссылку на целочисленный
     массив, увеличивающий каждый элемент массива на указанное число */
    public static void numPlusMassiv(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += num;
        }
        System.out.println(Arrays.toString(array));
    }


    // 5
    /*  ЗАДАНИЕ - Реализуйте метод, принимащий в качестве аргумента целочисленный массив,
    и печатающий в консоль информацию о том, что сумма элементов какой из половин массива больше */
    public static void sumMasMax(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sumLeft += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sumRight += array[i];
        }
        if (sumLeft > sumRight) {
            System.out.println("Сумма левой половины массива больше суммы правой половины: " + sumLeft + " > " + sumRight);
        } else if (sumLeft < sumRight) {
            System.out.println("Сумма правой половины массива больше суммы левой половины: " + sumLeft + " < " + sumRight);
        } else {
            System.out.println("Сумма правой половины массива равна сумме левой половины: " + sumLeft + " = " + sumRight);
        }
    }
}