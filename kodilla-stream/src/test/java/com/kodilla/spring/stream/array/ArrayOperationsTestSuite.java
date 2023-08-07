package com.kodilla.spring.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //given
        int[] arr = {7, 1, 7, 1, 2, 3, 4, 5, 67, 8, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //when
        double average = ArrayOperations.getAverage(arr);

        //then
        Assertions.assertEquals(13, average);
    }

    @Test
    void testGetNullAverage() {
        //given
        int[] arr1 = {};

        //when
        double average1 = ArrayOperations.getAverage(arr1);

        //then
        Assertions.assertEquals(0.0, average1);

    }

    @Test
    void testGetAverageWithMinusElements() {
        //given
        int[] arr2 = {-7, -7, -7, 7, -7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, -7};

        //when
        double average2 = ArrayOperations.getAverage(arr2);

        //then
        Assertions.assertEquals(3.81, average2, 0.01);

    }

}
