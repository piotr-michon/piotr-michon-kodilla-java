package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Basic pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(19), theCost);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Basic pizza with tomato sauce and cheese + extra cheese", description);
    }

    @Test
    public void testPizzaOrderWithAllIngredientsGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new MushroomDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(32), theCost);
    }

    @Test
    public void testPizzaOrderWithAllIngredientsGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new MushroomDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Basic pizza with tomato sauce and cheese + extra cheese + ham + salami + mushroom", description);
    }
}
