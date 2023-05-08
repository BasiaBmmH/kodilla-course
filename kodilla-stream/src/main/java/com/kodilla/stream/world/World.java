package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {

    private Set<Continent> continents = new HashSet<>();

    public Set<Continent> getContinents() {
        return continents;
    }

    public void setContinents(Set<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity(){
        List<BigDecimal> peopleQuantities = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .toList();
        return peopleQuantities.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
