package oop.hw7;

import java.util.Arrays;

public class Sort {


    public static void bubbleSort(int[] array) {
        int num;
        boolean res;
        do {
            res = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    num = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = num;
                    res = true;
                }
            }
        } while (res);
    }


    public static void quickSort(int[] arr, int low, int high) {


        int middle = low + (high - low) / 2;
        int border = arr[middle];


        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < border) i++;
            while (arr[j] > border) j--;
            if (i <= j) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }


        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }


}
