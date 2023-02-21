package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
        List<Integer> num = new LinkedList<>();

        //When
        OddNumbersExterminator.exterminate(num);

        //Then
        System.out.println("Expected: []");
        System.out.println(" Reality: " + OddNumbersExterminator.exterminate(num));
    }

    @DisplayName("czy klasa zachowuje się poprawnie" +
            "gdy lista zawiera liczby parzyste i nieparzyste")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> num2 = new LinkedList<>();
        num2.add(12);
        num2.add(10);
        num2.add(3);
        num2.add(13);
        num2.add(21);
        num2.add(20);

        //When
        OddNumbersExterminator.exterminate(num2);

        //Then
        System.out.println("Expected: [12, 10, 20]");
        System.out.println(" Reality: " + OddNumbersExterminator.exterminate(num2));
    }

    @DisplayName("przypadek z Arrays.asList()")
    @Test
    void testOddNumbersExterminatorArraysAsList() {
        //Given
        Integer num [] = new Integer[] {1,3,12,21,24,55,67,89,71,22};
        List<Integer> list = Arrays.asList(num);


        //When
        OddNumbersExterminator.exterminate(list);

        //Then
        System.out.println("Expected: [12, 24, 22]");
        System.out.println(" Reality: " + OddNumbersExterminator.exterminate(list));
    }


}
