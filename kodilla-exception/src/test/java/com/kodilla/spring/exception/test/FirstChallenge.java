package com.kodilla.spring.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws OwnArithmeticException {
        if (b == 0) {
            throw new OwnArithmeticException();
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
        } catch (OwnArithmeticException e) {
            System.out.println("OwnArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("you can't divide by zero");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Zawsze zostanie wywołane");
        }

        System.out.println(power(2, 4));

    }
    //w oddzielnym module
// TODO łapanie wyjątku podstawa mniejsza od zera
    // TODO napisanie 3 testów do metody
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