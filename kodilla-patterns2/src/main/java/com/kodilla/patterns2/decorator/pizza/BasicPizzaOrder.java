package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(12.00);
    }

    @Override
    public ArrayList<String> getComponents() {
        return new ArrayList<String>(
                Arrays.asList("Pizza", "Cheese"));
    }
}
