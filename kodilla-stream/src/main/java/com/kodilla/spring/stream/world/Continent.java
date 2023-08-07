package com.kodilla.spring.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {

    private Set<Country> countries = new HashSet<>();

    public Set<Country> getCountries() {
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent givenContinent = (Continent) o;
        return Objects.equals(this, givenContinent) && Objects.equals(countries, givenContinent.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash( countries);
    }

    @Override
    public String toString() {
        return "Continent{" +
                ", countries=" + countries +
                '}';
    }
}
