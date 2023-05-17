package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            double result = Double.parseDouble(secondChallenge.probablyIWillThrowException(2, 1.5));
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Zawsze zostanie wywołane");
        }

    }


    @Test
    void xSmallerThanOne() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when|then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.999, 0));

    }

    @Test
    void yEqualsOneAndTheHalf() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when|then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.3, 1.5));

    }

    @Test
    void xEqualsTwo() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when|then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.8));

    }

    @Test
    public void xAndYArntInTheField() {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            double result = Double.parseDouble(secondChallenge.probablyIWillThrowException(1.9, 1.9));
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Should not have thrown any exception");
        }
    }
}

