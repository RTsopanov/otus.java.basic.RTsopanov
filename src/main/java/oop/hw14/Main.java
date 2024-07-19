package oop.hw14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 1, 1, 2};
        int[] arr2 = {1, 2, 1, 2, 2};
        int[] arr3 = {1, 1, 2, 2, 2};
        int[] arr4 = {1, 1, 1, 1, 1};
        int[] arr5 = {2, 2, 2, 2, 2};
        int[] arr6 = {2, 2, 2, 2, -1};
        int[] arr7 = {-1, 2, 2, 2, 2};


        System.out.println(Arrays.toString(array(arr1)));
        System.out.println(Arrays.toString(array(arr2)));
//        System.out.println(Arrays.toString(array(arr3)));
//        System.out.println(Arrays.toString(array(arr4)));
//
//        System.out.println(Arrays.toString(array(arr5)));
//        System.out.println(Arrays.toString(array(arr6)));
//        System.out.println(Arrays.toString(array(arr7)));


        System.out.println(chekingArray(arr1));
        System.out.println(chekingArray(arr2));
        System.out.println(chekingArray(arr3));
        System.out.println();

        System.out.println(chekingArray(arr5));
        System.out.println(chekingArray(arr4));
        System.out.println(chekingArray(arr6));
        System.out.println(chekingArray(arr7));
    }


    public static int[] array(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                index = i;
            }
        }
        if (index == -1) {
            throw new RuntimeException();
        }


        int sum = (arr.length - 1) - index;
        int[] newArr = new int[sum];
        if (sum != -1) {
            for (int i = index; i < arr.length; i++) {
                for (int j = 0; j < newArr.length; j++) {
                    newArr[j] = arr[i];
                }
            }
        }
        return newArr;
    }



    public static boolean chekingArray(int[] arr){
        int one = -1;
        int two = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 1 && arr[i] > 2){
                return false;
            }
            if(arr[i] == 1){
                one = i;
            }
           else if(arr[i] == 2){
                two = i;
            }

        }
        if(one == -1 || two == -1){
            return false;
        }
        return true;
    }


}

