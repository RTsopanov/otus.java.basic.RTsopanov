package oop.hw14;

import org.junit.jupiter.api.AfterEach;
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


    @BeforeEach
    public void prepare() {
        main = new Main();
        System.out.println("Start test");
    }

    @AfterEach
    public void after() {
        System.out.println("End test");
    }



    @Test
    public void array(){
        Assertions.assertArrayEquals(new int[]{2}, main.array(new int[]{1, 2 ,1, 1, 2}));
        Assertions.assertArrayEquals(new int[]{2, 2, 2}, main.array(new int[]{2, 1, 2, 2, 2}));
    }


    public static Stream<Arguments> getArray() {
        List<Arguments> arr = new ArrayList<>();
        arr.add(Arguments.of(new int[]{2}, new int[]{1, 2, 1, 1, 2}));
        arr.add(Arguments.of(new int[]{2, 2}, new int[]{1, 2, 1, 2, 2}));
        arr.add(Arguments.of(new int[]{2, 2, 2}, new int[]{1, 1, 2, 2, 2}));
        arr.add(Arguments.of(new int[]{}, new int[]{1, 1, 1, 1, 1}));
        return arr.stream();
    }
    @ParameterizedTest
    @MethodSource("getArray")
    void array(int[] res, int[] arr) {
        Assertions.assertArrayEquals(res, main.array(arr));
    }


    public static Stream<Arguments> getArrayTwo() {
        List<Arguments> arr = new ArrayList<>();
        arr.add(Arguments.of(new int[]{2, 2, 2, 2, 2}));
        arr.add(Arguments.of(new int[]{2, 2, 2, 2, -1}));
        arr.add(Arguments.of(new int[]{-1, 2, 2, 2, 2}));
        return arr.stream();
    }

    @ParameterizedTest
    @MethodSource("getArrayTwo")
    void array(int[] arr) {
        Assertions.assertThrowsExactly(RuntimeException.class, () -> main.array(arr));

    }









    @Test
    public void chekingArray(){
        Assertions.assertEquals(true,main.chekingArray(new int[]{1, 1, 2, 2, 2}));
        Assertions.assertEquals(true,main.chekingArray(new int[]{1, 1, 2, 1, 2}));
    }


    public static Stream<Arguments> getArrayThree() {
        List<Arguments> arr = new ArrayList<>();
        arr.add(Arguments.of(new int[]{1, 2, 1, 1, 2}));
        arr.add(Arguments.of(new int[]{1, 2, 1, 2, 2}));
        arr.add(Arguments.of (new int[]{1, 1, 2, 2, 2}));
        return arr.stream();
    }

    @ParameterizedTest
    @MethodSource("getArrayThree")
    void chekingArray(int[] arr) {
        Assertions.assertTrue(main.chekingArray(arr));
    }


    public static Stream<Arguments> getArrayFour() {
        List<Arguments> arr = new ArrayList<>();
        arr.add(Arguments.of(new int[]{2, 2, 2, 2, 2}));
        arr.add(Arguments.of(new int[]{2, 2, 2, 2, -1}));
        arr.add(Arguments.of(new int[]{-1, 2, 2, 2, 2}));
        arr.add(Arguments.of( new int[]{1, 1, 1, 1, 1}));
        return arr.stream();
    }

    @ParameterizedTest
    @MethodSource("getArrayFour")
    void chekingArr(int[] arr) {
        Assertions.assertFalse(main.chekingArray(arr));
    }




}