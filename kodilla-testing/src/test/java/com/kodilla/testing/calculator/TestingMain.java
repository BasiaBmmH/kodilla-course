package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {

        int resultAdd = Calculator.add(7, 3);
        int resultSubtract = Calculator.subtract(10, 7);

        if (resultAdd == 10 && resultSubtract == 3) {
            System.out.println("Test: OK");
        } else {
            System.out.println("Test: NOT-OK");
        }

    }
}
