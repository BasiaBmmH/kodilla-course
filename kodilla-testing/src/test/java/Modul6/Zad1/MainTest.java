package Modul6.Zad1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testFindVowelsTDD() {
        //given
        String name = "Adam";
        String expectedResult = "aa";

        //when
        String resultName = Main.findVowelsTDD(name);

        //then
        assertEquals(expectedResult, resultName);

    }

    @Test
    void testFindVowelsForWordWithoutThem() {
        //given
        String name = "wxt";
        String expectedResult = "";

        //when
        String resultName = Main.findVowelsTDD(name);

        //then
        assertEquals(expectedResult, resultName);

    }
}