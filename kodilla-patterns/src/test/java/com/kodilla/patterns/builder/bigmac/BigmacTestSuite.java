package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame seeds")
                .burgers(2)
                .sauce("Standard")
                .ingredient("Salad")
                .ingredient("Bacon")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        bigmac.getBurgers();
        //Then
        Assert.assertEquals(2, bigmac.getBurgers());
    }
}
