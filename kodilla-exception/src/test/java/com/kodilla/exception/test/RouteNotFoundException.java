package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException() {
        super("Rute not found, try to search for different flights");
    }
}

