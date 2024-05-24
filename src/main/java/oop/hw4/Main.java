package oop.hw4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[][] arr1 = {{'1', '2', '3', '4'}, {'5', '6', '7', '8'}, {'1', '2', '3', '4'}, {'5', '6', '7'}};
        char[][] arr2 = {{'1', '2', '3', '4'}, {'5', '6', '7', '8'}, {'1', '2', '3', '4'}, {'5', 'R', '7', '8'}};
        char[][] arr3 = {{'1', '2', '3', '4'}, {'5', '6', '7', '8'}, {'1', '2', '3', '4'}, {'5', '6', '7', '8'}};

        try {
//            array(arr1);
            array(arr2);
//            array(arr3);
        } catch (AppArraySizeException | AppArrayDataException e) {
            e.printStackTrace();
        }
    }


    public static void array(char[][] arr) {
        int a;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4) {
                    throw new AppArraySizeException();
                }
                if (arr[i].length != 4) {
                    throw new AppArraySizeException();
                }
                try {
                    a = Integer.parseInt(String.valueOf(arr[i][j]));
                    sum += a;
                } catch (NumberFormatException e) {
                    System.out.println("Строка: " + i + "\nСтолбец: " + j + "\nЗначение: " + arr[i][j]);
//                    e.printStackTrace();
                    throw new AppArrayDataException();

                }
            }
        }
        System.out.println("Сумма элементов массива " + sum);
        System.out.println("Массив соответствует размеру 4*4");
    }
}







