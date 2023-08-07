package com.kodilla.spring.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //given
        World world = new World();
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();

        Country country1 = new Country("Sverker", continent1, new BigDecimal("5367580"));
        Country country2 = new Country("Grima", continent1, new BigDecimal("387800"));
        Country country3 = new Country("Bergmal", continent1, new BigDecimal("10327789"));
        Country country4 = new Country("Mavilim", continent2, new BigDecimal("82835090"));
        Country country5 = new Country("Ofermod", continent2, new BigDecimal("10432481"));
        Country country6 = new Country("Amandu", continent2, new BigDecimal("47654296"));
        Country country7 = new Country("YunDao", continent3, new BigDecimal("1411778724"));
        Country country8 = new Country("Tenere", continent3, new BigDecimal("125396901"));
        Country country9 = new Country("Kaldak", continent3, new BigDecimal("513120"));

        //when

        continent1.setCountries(Set.of(country1, country2, country3));
        continent2.setCountries(Set.of(country4, country5, country6));
        continent3.setCountries(Set.of(country7, country8, country9));
        world.setContinents(Set.of(continent1, continent2, continent3));

        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //then
        BigDecimal expectedQuantity = BigDecimal.valueOf(5367580
                + 387800
                + 10327789
                + 82835090
                + 10432481
                + 47654296
                + 1411778724
                + 125396901
                + 513120);
        assertEquals(expectedQuantity, peopleQuantity);


    }

}
