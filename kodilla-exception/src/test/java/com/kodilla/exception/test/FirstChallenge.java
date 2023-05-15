package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("you can't divide by zero");
        }

        System.out.println(power(2, 4));

    }

    public static int power(int podstawa, int wykladnik) {
        int wynik = 1;

        if (podstawa == 0) {
            wynik = 0;

        } else if (wykladnik == 0) {
            wynik = 1;

        }
        if (wykladnik == 1) {
            wynik = podstawa;

        } else {
            while (wykladnik > 0) {
                wynik *= podstawa;
                wykladnik--;
            }
        }
        return wynik;
    }
}

//done Potęgowanie zera (podstawa) z dowolną liczbą (wykładnik)
//done Potęgowanie dowolnej liczby (podstawa) z zerem (wykładnik)
//done Potęgowanie dowolnej liczby (podstawa) z jedynką (wykładnik)
