package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    //tu też były zmiany
    public RouteNotFoundException(String msg) {
        super(msg);
    }

    public RouteNotFoundException() {
        super("Rute not found, try to search for different flights");
    }
}

