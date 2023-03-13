package Modul6.Zad1;

import Modul0_6.Modul6.Zad1.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

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