package oop.hw14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static Main main;

    @BeforeAll
    public static void prepare() {
        main = new Main();
    }

   static int[] arr1 = {1, 2, 1, 1, 2};
   static int[] arr11 = {2};

    static int[] arr2 = {1, 2, 1, 2, 2};
    static int[] arr22 = {2, 2};

    static int[] arr3 = {1, 1, 2, 2, 2};
    static int[] arr33 = {2, 2, 2};



    static int[] arr4 = {1, 1, 1, 1, 1};
    static int[] arr5 = {2, 2, 2, 2, 2};
    static int[] arr6 = {2, 2, 2, 2, -1};
    static int[] arr7 = {-1, 2, 2, 2, 2};


    public static Stream<Arguments> getArray(){
        List<Arguments> arr = new ArrayList<>();
        arr.add(Arguments.of(arr1));
        arr.add(Arguments.of(arr2));
        arr.add(Arguments.of(arr3));
        arr.add(Arguments.of(arr4));
        arr.add(Arguments.of(arr5));
        return arr.stream();
    }

    @ParameterizedTest
    @MethodSource("getArray")
    void array(int arr) {
        Assertions.assertEquals(arr11, main.array(arr1));
//        Assertions.assertEquals();
//        Assertions.assertEquals();
    }






    @Test
    void chekingArray() {
    }
}