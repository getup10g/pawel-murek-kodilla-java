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
        Country poland = new Country();
        Country german = new Country();
        Country france = new Country();
        Country spain = new Country();

        Continent europe = new Continent();
        World world = new World();


        //When
        europe.addCountry(poland);
        europe.addCountry(german);
        europe.addCountry(france);
        europe.addCountry(spain);
        world.addContinent(europe);
        //Then
        BigDecimal expectedPeople = new BigDecimal("156000000");
        Assert.assertEquals(expectedPeople, world.getPeopleQuantity());
    }
}
