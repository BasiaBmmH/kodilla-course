package Modul0_6.Modul4.Zad6_kalkulator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Wpisz operacje mat, odstepy rob spacjami np.:");
        System.out.println("  2  +   4");

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        String calcWithoutExtraSpaces = userInput.replaceAll("( )+", " ");
        String[] values = calcWithoutExtraSpaces.split(" ");

        try {
            int value = Integer.parseInt(values[0]);
            String operator = values[1];
            int value2 = Integer.parseInt(values[2]);
            switch (operator) {
                case "+" -> addition(value, value2);
                case "-" -> subtracting(value, value2);
                case "/" -> division(value, value2);
                case "*" -> multiplying(value, value2);
            }

        } catch (Exception e) {
            System.out.printf("Invalid values %s", userInput);
        }

    }

    private static void addition(int value, int value2) {
        System.out.println(value + value2);
    }

    private static void subtracting(int value, int value2) {
        System.out.println(value - value2);
    }

    private static void division(int value, int value2) {
        System.out.println((double) (value / value2));
    }

    private static void multiplying(int value, int value2) {
        System.out.println(value * value2);
    }


}

