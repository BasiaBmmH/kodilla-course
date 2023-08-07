package com.kodilla.spring.exception.test;

public class OwnArithmeticException extends ArithmeticException{
    public OwnArithmeticException() {
        super("OWN");
    }
}
