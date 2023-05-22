package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private static final HashMap<String, Boolean> ACCESSIBLE_AIRPORTS = new HashMap<>(
            Map.of(
                    "GDN", true,
                    "TRD", true,
                    "WAW", true,
                    "DXB", true,
                    "STN", false,
                    "OSL", true,
                    "KEF", false
            )
    );

    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight1 = new Flight("GDN", "TRD");
        Flight flight2 = new Flight("TRD", "GDN");
        Flight flight3 = new Flight("WAW", "TRD");
        Flight flight4 = new Flight("DXB", "WAW");
        Flight flight5 = new Flight("STN", "TRD");
        Flight flight6 = new Flight("STN", "TRD");
        Flight flight7 = new Flight("STN", "OSL");
        Flight flight8 = new Flight("KEF", "STN");


        tryToFindFlight(flight1);
        tryToFindFlight(flight2);
        tryToFindFlight(flight3);
        tryToFindFlight(flight4);
        tryToFindFlight(flight5);
        tryToFindFlight(flight6);
        tryToFindFlight(flight7);
        tryToFindFlight(flight8);

    }

    static void tryToFindFlight(Flight flight) {
        try {
            findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Znajdz inny lot: " + e.getMessage());
        }
    }

// GDN(Gdańsk), TRD(Trondheim), WAW(Warszawa), DXB(Dubai),
// STN(Stamford), OSL(Oslo), KEF(Keflavík)

//    static boolean validateFlightIsCorrect(Flight flight) throws RouteNotFoundException {
//
//    }

    static boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (isDisabledAirport(flight.getDepartureAirport()) && isDisabledAirport(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(String.format("Both airports are closed (%s, %s)", flight.getDepartureAirport(), flight.getArrivalAirport()));
        } else if (isDisabledAirport(flight.getDepartureAirport())) {
            throw new RouteNotFoundException(String.format("Departure airport is closed (%s)", flight.getDepartureAirport()));
        } else if (isDisabledAirport(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(String.format("Arrival airport is closed (%s)", flight.getArrivalAirport()));
        } else {
            return Boolean.TRUE;
        }

    }

    private static boolean isDisabledAirport(String airport) {
        return !ACCESSIBLE_AIRPORTS.get(airport);
    }

}
