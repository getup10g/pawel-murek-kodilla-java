package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(12),calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetComponents() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        List<String> componentList = theOrder.getComponents();
        //Then
        assertEquals(Arrays.asList("Pizza", "Cheese"),componentList);
    }
    @Test
    public void testDaGrassoPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DaGrassoPizzaOrderDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(16),calculatedCost);
    }
    @Test
    public void testDaGrassoPizzaOrderGetComponents() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DaGrassoPizzaOrderDecorator(theOrder);
        //When
        List<String> componentList = theOrder.getComponents();
        //Then
        assertEquals(Arrays.asList("Pizza", "Cheese", "Tomato"),componentList);
    }
    @Test
    public void testAmericanskaPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AmericanskaPizzaOrderDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15),calculatedCost);
    }
    @Test
    public void testAmericanskaPizzaOrderGetComponents() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AmericanskaPizzaOrderDecorator(theOrder);
        //When
        List<String> componentList = theOrder.getComponents();
        //Then
        assertEquals(Arrays.asList("Pizza", "Cheese", "Mushrooms"),componentList);
    }
    @Test
    public void testDaGrassoPizzaNextComponentGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DaGrassoPizzaOrderDecorator(theOrder);
        theOrder = new NextComponentDecorator(theOrder,"Chicken", new BigDecimal(8));
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24),calculatedCost);
    }
    @Test
    public void testDaGrassoPizzaNextComponentGetComponents() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DaGrassoPizzaOrderDecorator(theOrder);
        theOrder = new NextComponentDecorator(theOrder,"Chicken", new BigDecimal(8));
        //When
        List<String> componentList = theOrder.getComponents();
        //Then
        assertEquals(Arrays.asList("Pizza", "Cheese", "Tomato","Chicken"),componentList);
    }


    @Test
    public void testAmericanskaPizzaNextComponentGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AmericanskaPizzaOrderDecorator(theOrder);
        theOrder = new NextComponentDecorator(theOrder,"Cheese", new BigDecimal(5));
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20),calculatedCost);
    }
    @Test
    public void testAmericanskaPizzaNextComponentGetComponents() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AmericanskaPizzaOrderDecorator(theOrder);
        theOrder = new NextComponentDecorator(theOrder,"Cheese", new BigDecimal(5));
        //When
        List<String> componentList = theOrder.getComponents();
        //Then
        assertEquals(Arrays.asList("Pizza", "Cheese", "Mushrooms","Cheese"),componentList);
    }
}
