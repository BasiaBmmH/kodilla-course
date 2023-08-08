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

    public List<String> findCitiesFromCity(String departureCity) {
        return flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .map(Flight::getDestinationCity)
                .collect(Collectors.toList());
    }

    public List<String> findCitiesToCity(String destinationCity) {
        return flights.stream()
                .filter(flight -> flight.getDestinationCity().equals(destinationCity))
                .map(Flight::getDepartureCity)
                .collect(Collectors.toList());
    }

    public List<String> findCitiesViaCity(String layoverCity, String destinationCity) {
        return flights.stream()
                .filter(flight -> flight.getLayoverCity() != null && flight.getLayoverCity().equals(layoverCity)
                        && flight.getDestinationCity().equals(destinationCity))
                .map(Flight::getDepartureCity)
                .collect(Collectors.toList());
    }
}