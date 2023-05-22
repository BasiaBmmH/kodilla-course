package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight1 = new Flight("GDN", "TRD");
        Flight flight2 = new Flight("TRD", "GDN");
        Flight flight3 = new Flight("WAW", "TRD");
        Flight flight4 = new Flight("DXB", "WAW");
        Flight flight5 = new Flight("STN", "TRD");
        Flight flight6 = new Flight("STN", "TRD");
        Flight flight7 = new Flight("STN", "OSL");
        Flight flight8 = new Flight("KEF", "STN");

        try {
            findFlight(flight1);
            findFlight(flight2);
            findFlight(flight3);
            findFlight(flight4);
            findFlight(flight5);
            findFlight(flight6);
            findFlight(flight7);
            findFlight(flight8);

        } catch (RouteNotFoundException e) {
            System.out.println("Znajdz inny lot");
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
    }

    static void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> accessibleAirports = new HashMap<>();
        accessibleAirports.put("GDN", true);
        accessibleAirports.put("TRD", true);
        accessibleAirports.put("WAW", true);
        accessibleAirports.put("DXB", true);
        accessibleAirports.put("STN", false);
        accessibleAirports.put("OSL", true);
        accessibleAirports.put("KEF", false);

        if (!accessibleAirports.get(flight.getDepartureAirport()) || !accessibleAirports.get(flight.getArrivalAirpor())) {
            {
                if (!accessibleAirports.get(flight.getDepartureAirport()) && !accessibleAirports.get(flight.getArrivalAirpor())) {
                    System.out.println(flight.getDepartureAirport() + " and " + flight.getArrivalAirpor() + " are closed");
                } else if (!accessibleAirports.get(flight.getDepartureAirport())) {
                    System.out.println(flight.getDepartureAirport() + " is closed");

                } else {
                    System.out.println(flight.getArrivalAirpor() + " is closed");
                }
            }
        }

    }

}
