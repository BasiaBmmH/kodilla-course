package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FlightSearchSystem {
    private List<Flight> flights;

    public FlightSearchSystem() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> findFlightsFromCity(String departureCity) {
        return flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsToCity(String destinationCity) {
        return flights.stream()
                .filter(flight -> flight.getDestinationCity().equals(destinationCity))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsViaCity(String layoverCity, String destinationCity) {
        return flights.stream()
                .filter(flight -> flight.getLayoverCity() != null && flight.getLayoverCity().equals(layoverCity)
                        && flight.getDestinationCity().equals(destinationCity))
                .collect(Collectors.toList());
    }
}