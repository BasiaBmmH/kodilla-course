package com.kodilla.spring.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println();
        System.out.println("Test Case: Start");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: End");
    }

    @DisplayName("czy klasa zachowuje się poprawnie," +
            " gdy lista jest pusta")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = emptyList();

        //When
        List<Integer> result = OddNumbersExterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList(), result);
    }

    @DisplayName("czy klasa zachowuje się poprawnie" +
            "gdy lista zawiera liczby parzyste i nieparzyste")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        // TODO change to Arrays.asList annotation
        List<Integer> num2 = Arrays.asList(12,10,3,7, 21, 44);


        //When
        // TODO get results of tested method
        List<Integer> result = OddNumbersExterminator.exterminate(num2);

        //Then
        // TODO change to Assertion assertEquals check
        Assertions.assertEquals(List.of(12,10,44),result);
    }

    @DisplayName("przypadek z Arrays.asList()")
    @Test
    void testOddNumbersExterminatorArraysAsList() {
        //Given
        List<Integer> list = Arrays.asList(1, 3, 12, 21, 24, 55, 67, 89, 71, 22);


        //When
       List <Integer> result = OddNumbersExterminator.exterminate(list);

        //Then
        Assertions.assertEquals(List.of(12,24,22),result);
    }


}
