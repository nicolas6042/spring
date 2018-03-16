package com.domain.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mbaranowicz
 */
public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent asia = new Continent("ASIA");
        Continent africa = new Continent("AFRICA");


        //When
        asia.addCountry(new Country("ASIA1",new BigDecimal("1000000")));
        asia.addCountry(new Country("ASIA2",new BigDecimal("2000000")));
        asia.addCountry(new Country("ASIA3",new BigDecimal("3000000")));

        africa.addCountry(new Country("AFRICA1", new BigDecimal("7000000")));
        africa.addCountry(new Country("AFRICA2", new BigDecimal("8000000")));

        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(3,asia.getCountries().size());

      //  Assert.assertEquals(new BigDecimal("21000000"),totalPeople);

    }
}
