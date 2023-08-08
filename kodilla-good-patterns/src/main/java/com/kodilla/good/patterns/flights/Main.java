package com.kodilla.good.patterns.flights;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightSearchSystem flightSearchSystem = new FlightSearchSystem();

        flightSearchSystem.addFlight(new Flight("GDANSK", "KRAKOW", "WROCLAW"));
        flightSearchSystem.addFlight(new Flight("GDANSK", null, "WARSZAWA"));
        flightSearchSystem.addFlight(new Flight("WARSZAWA", null, "KRAKOW"));
        flightSearchSystem.addFlight(new Flight("OSLO", "TRONDHEIM", "TROMSO"));
        flightSearchSystem.addFlight(new Flight("GDANSK", "TRONDHEIM", "TROMSO"));

        List<String> citiesFromGdansk = flightSearchSystem.findCitiesFromCity("GDANSK");
        System.out.println("Flights from GDANSK: " + citiesFromGdansk);

        List<String> citiesToKrakow = flightSearchSystem.findCitiesToCity("KRAKOW");
        System.out.println("Flights to KRAKOW: " + citiesToKrakow);

        List<String> citiesViaKrakowToWroclaw = flightSearchSystem.findCitiesViaCity("KRAKOW", "WROCLAW");
        System.out.println("Flights via KRAKOW to WROCLAW: " + citiesViaKrakowToWroclaw);

        List<String> citiesViaTrondheimToTromso = flightSearchSystem.findCitiesViaCity("TRONDHEIM","TROMSO");
        System.out.println("Flights via TRONDHEIM to TROMSO: " + citiesViaTrondheimToTromso);
    }
}