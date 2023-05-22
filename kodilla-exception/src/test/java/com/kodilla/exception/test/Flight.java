package com.kodilla.exception.test;

public class Flight {
    String departureAirport;
    String arrivalAirpor;

    public Flight(String departureAirport, String arrivalAirpor) {
        this.departureAirport = departureAirport;
        this.arrivalAirpor = arrivalAirpor;
    }


    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirpor() {
        return arrivalAirpor;
    }
}
