package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countryListEU = new ArrayList<>();
        countryListEU.add(new Country("Spain", new BigDecimal("987654321")));
        countryListEU.add(new Country("Germany", new BigDecimal("876543219")));
        countryListEU.add(new Country("Poland", new BigDecimal("765432198")));

        List<Country> countryListAS = new ArrayList<>();
        countryListAS.add(new Country("China", new BigDecimal("654321987")));
        countryListAS.add(new Country("Japan", new BigDecimal("543219876")));
        countryListAS.add(new Country("India", new BigDecimal("432198765")));

        List<Country> countryListSA = new ArrayList<>();
        countryListSA.add(new Country("Argentina", new BigDecimal("321987654")));
        countryListSA.add(new Country("Brazil", new BigDecimal("219876543")));
        countryListSA.add(new Country("Chile", new BigDecimal("198765432")));

        List<Continent> continentList = new ArrayList<>();
        continentList.add(new Continent("Europe", countryListEU));
        continentList.add(new Continent("Asia", countryListAS));
        continentList.add(new Continent("South America", countryListSA));

        World world = new World(continentList);
        //When
        world.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal("4999999995"), world.getPeopleQuantity());
    }
}