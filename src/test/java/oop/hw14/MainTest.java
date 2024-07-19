package oop.hw14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MainTest {
    Main main;


    static int[] arr1 = {1, 2, 1, 1, 2};
    static int[] arr11 = {2};
    static int[] arr2 = {2, 2};
    static int[] arr3 = {2, 2, 2};
    static int[] arr4 = {1, 1, 1, 1, 1};
    static int[] arr5 = {2, 2, 2, 2, 2};
    static int[] arr6 = {2, 2, 2, 2, -1};
    static int[] arr7 = {-1, 2, 2, 2, 2};
    private static Stream<Arguments> array;


    @BeforeEach
    public void prepare() {
        main = new Main();
    }

    public static Stream<Arguments> getArray() {
        List<Arguments> arr = new ArrayList<>();
        arr.add(Arguments.of(new int[]{1, 2, 1, 1, 2}));
        arr.add(Arguments.of(new int[]{1, 2, 1, 2, 2}));
        arr.add(Arguments.of(new int[]{1, 1, 2, 2, 2}));
        arr.add(Arguments.of(new int[]{1, 1, 1, 1, 1}));
        arr.add(Arguments.of(new int[]{2, 2, 2, 2, 2}));
        arr.add(Arguments.of(new int[]{2, 2, 2, 2, -1}));
        arr.add(Arguments.of(new int[]{-1, 2, 2, 2, 2}));
        return arr.stream();
    }


    @ParameterizedTest
    @MethodSource("getArray")
    void array(int[] arr) {
        Assertions.assertEquals(new int[]{2}, main.array(arr));
        Assertions.assertEquals(arr2, main.array(arr));

    }

    @Test
    void array() {
        Assertions.assertEquals(new int[]{2}, main.array(arr1));
        Assertions.assertEquals(arr11, Main.array(arr1));
    }


//    @ParameterizedTest
//    @MethodSource("getArray")
//    void chekingArray(int[] arr) {
//        Assertions.assertTrue(chekingArray(arr));
//    }

    @Test
    void chekingArray() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertTrue(main.chekingArray(new int[]{1, 2, 1, 1, 2}));
                },
                () -> {
                    Assertions.assertFalse(main.chekingArray(new int[]{-1, 2, 2, 2, 2}));
                },
                () -> {
                    Assertions.assertTrue(main.chekingArray(new int[]{1, 2, 1, 2, 2}));
                }
        );
    }


}