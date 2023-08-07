package com.kodilla.spring.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {

    private final String country;
    private final Continent countryLocation;
    private final BigDecimal PeopleQuantity;


    public Continent getCountryLocation() {
        return countryLocation;
    }


    public Country(String country, Continent countryLocation, BigDecimal peopleQuantity) {
        this.country = country;
        this.countryLocation = countryLocation;
        this.PeopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", PeopleQuantity=" + PeopleQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country)
                && Objects.equals(PeopleQuantity, country1.PeopleQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, PeopleQuantity, PeopleQuantity);
    }


}
