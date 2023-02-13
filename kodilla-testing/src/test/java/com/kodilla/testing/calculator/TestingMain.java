package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int resultAdd = calc.add(7, 3);
        int resultSubtract = calc.subtract(10, 7);

        if(resultAdd == 10 && resultSubtract == 3){
            System.out.println("Test: OK");
        }else {
            System.out.println("Test: NOT-OK");
        }

    }
}
