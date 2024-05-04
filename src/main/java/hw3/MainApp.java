package hw3;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[][] arr = {{2, -5}, {5, 9}, {-11, 4}, {7, 0}};
        int[][] arr2 = {{2, 5, 1, 4, 9}, {7, 9, 5, 9, 8}, {1, 4, 11, 5, 2}, {7, 7, 2, 5, 4}, {7, 9, 5, 9, 1}};
        char[][] arr3 = {{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        int[][] arr4 = {{2, -5}, {5, 9}};


// 1 - Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
//      метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
        System.out.println("Задание № 1");
        sumOfPositiveElements(arr);
        System.out.println();

// 2 - Реализовать метод, который принимает в качестве аргумента int size
// и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
        System.out.println("Задание № 2");
        squarePrint(5);
        System.out.println();

// 3 - Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
//       и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
        System.out.println("Задание № 3");
        diagonalNull(arr2);
        System.out.println();


// 4 - Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
        System.out.println("Задание № 4");
        findMax(arr2);
        System.out.println();

// 5 - Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
//       если второй строки не существует, то в качестве результата необходимо вернуть -1
        System.out.println("Задание № 5");
        sumTwoLine(arr4);
//
    }


    // 1
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
    }


    // 2
    public static void squarePrint(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //3
    //        ПОДСКАЖИТЕ, ПОЖАЛУЙСТА, ЕСТЬ СПОСОБ ЗАДАНИЕ №3 РЕШИТЬ БОЛЕЕ КОРОТКИМ(правильным) СПОСОБОМ ???
    //        пробовал через   Math.sqrt(x*x + y*y), но безуспешно
    public static void diagonalNull(int[][] array) {

        for (int i = 0; i < array.length; i++) {

                array[i][i] = 0;
                array[0][4] = 0;
                array[1][3] = 0;
                array[0][0] = 0;
                array[3][1] = 0;
                array[4][0] = 0;

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    // 4
    public static int findMax(int[][] array) {

        int maxNumberArray = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxNumberArray) {
                    maxNumberArray = array[i][j];
                }
            }

        }
        System.out.println(maxNumberArray);
        return maxNumberArray;
    }


    // 5
    public static int sumTwoLine(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length >= 3) {
                result += array[2][i];
            } else {result = -1;}
        }
        System.out.println(result);
        return result;
    }
}
