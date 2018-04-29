package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
   private final PizzaOrder pizzaOrder;
    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder=pizzaOrder;
    }
    @Override
    public BigDecimal getCost(){
        return pizzaOrder.getCost();
    }
    @Override
    public ArrayList<String> getComponents(){
        return pizzaOrder.getComponents();
    }
}
