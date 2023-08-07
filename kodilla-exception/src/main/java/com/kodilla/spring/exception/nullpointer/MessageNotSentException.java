package com.kodilla.spring.exception.nullpointer;

public class MessageNotSentException extends Exception {

    public MessageNotSentException(final String message) {
        super(message);
    }
}