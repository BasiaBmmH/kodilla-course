package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //given
        int[] arr = {7, 1, 7, 1};
        int[] arr1 = {1, 1, -1, 1, 1, 1, 1, -1, 1, 1, 1, -1, 1, 1, 1, 1, 1, 1, -1, 1};
        int[] arr2 = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, -7};

        //when
        double average = getAverage(arr);
        double average1 = getAverage(arr1);
        double average2 = getAverage(arr2);

        //then
        //DONE  elementy ujemne
        Assertions.assertEquals(4, average);
        Assertions.assertEquals(0.6, average1);
        Assertions.assertEquals(6.3, average2, 0.1);


    }

}
