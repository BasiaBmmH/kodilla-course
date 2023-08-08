package com.kodilla.good.patterns.flights;

class Flight {
    private String departureCity;
    private String layoverCity;
    private String destinationCity;

    public Flight(String departureCity, String layoverCity, String destinationCity) {
        this.departureCity = departureCity;
        this.layoverCity = layoverCity;
        this.destinationCity = destinationCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return departureCity.equals(flight.departureCity) && destinationCity.equals(flight.destinationCity);
    }

    @Override
    public int hashCode() {
        return departureCity.hashCode() + destinationCity.hashCode();
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getLayoverCity() {
        return layoverCity;
    }

    public void setLayoverCity(String layoverCity) {
        this.layoverCity = layoverCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }
}