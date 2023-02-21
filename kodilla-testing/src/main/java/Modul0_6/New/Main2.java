package Modul0_6.New;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        String calcWithoutExtraSpaces = userInput.replaceAll("( )+", " ");
        String[] values = calcWithoutExtraSpaces.split(" ");

        // TODO weryfikacja poprawności formatu wartości i długości tablicy values
        // TODO weryfikacja operatora i odpowiednia obsługa dla 4 operacji + - / *
        try {
            int value = Integer.parseInt(values[0]);
            String operator = values[1];
            int value2 = Integer.parseInt(values[2]);
            switch (operator) {
                case "+" -> addition(value, value2);
                case "-" -> subtracting(value, value2);
                case "/" -> division(value, value2);
                case "*" -> multiplying(value, value2);
                case "potegowanie" -> exponentiation(value, value2);
                case "czyNarcystyczna" -> isNarcissistic(value);
                case "czyPierwsza" -> isPrime(value);
                case "czyDoskonala" -> isPerfect(value);
                case "odwroc" -> reverse(value);
            }

        } catch (Exception e) {
            System.out.printf("Invalid values %s", userInput);
        }


    }

    private static void multiplying(int value, int value2) {
        System.out.println(value * value2);
    }

    private static void division(int value, int value2) {
        System.out.println((double) (value / value2));
    }

    private static void subtracting(int value, int value2) {
        System.out.println(value - value2);
    }

    private static void addition(int value, int value2) {
        System.out.println(value + value2);
    }

    private static void reverse(int value) {
        //   String[] odwrocone = new String[userInput.length()];
//        for (int i = userInput.length() - 1; i < 0; i--) {
//            for (int j = 0; j < odwrocone.length; j++) {
//                odwrocone[j] = userInput[i];
//            }
//        }
//        return ( for (String s : odwrocone) {
//            System.out.print(s);
//        });

    }

    private static void isPerfect(int value) {
        int dzielniki = 0;
        for (int i = 0; i < value; i++) {
            if (value % i == 0) {
                dzielniki = dzielniki + i;
            } else {
                dzielniki = dzielniki;
            }
        }
        if (dzielniki == value) {
            System.out.println(value + " jest ;iczba doskonala");
        } else {
            System.out.println(value + "nie jest liczba doskonala");
        }

    }

    private static void isPrime(int value) {
        int czyPiersza = 0;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                czyPiersza = 0;
            } else {
                czyPiersza++;
            }
        }
        if (czyPiersza == 0) {
            System.out.println(value + " jest liczba pierwsza");
        } else {
            System.out.println(value + " NIE jest liczba pierwsza");
        }
    }

    private static void isNarcissistic(int value) {
        int liczba, rem, c;
//            int arm = 0;
//            for (int i = 0; i < userInput.length(); i++) {
//                liczba = userInput[i];
//                c = liczba;
//                while (liczba > 0) {
//                    rem = liczba % 10;
//                    arm = (rem * rem * rem) + arm;
//                    liczba = liczba / 10;
//                }
//                if (c == arm) {
//                    System.out.println((userInput[i] + " JEST liczba narcystyczna"));
//                } else {
//                    System.out.println((userInput[i] + " nie jest liczba narcystyczna"));
//                }
//            }
    }

    private static void exponentiation(int value, int value2) {
        int wrt = value;
        int wynik = 0;
        for (int i = 0; i < value2; i++) {
            wynik = wrt * value;
            wrt = wynik;
        }
        System.out.println(wynik);
    }


}
