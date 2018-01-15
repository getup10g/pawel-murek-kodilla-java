package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.Bigmac.BigmacBuilder.ISLANDS;
import static com.kodilla.patterns.builder.bigmac.Bigmac.BigmacBuilder.SESAMESEEDS;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(SESAMESEEDS)
                .burgers(2)
                .sauce(ISLANDS)
                .ingredient("prawns")
                .ingredient("mushrooms")
                .ingredient("cucumber")
                .ingredient("onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}