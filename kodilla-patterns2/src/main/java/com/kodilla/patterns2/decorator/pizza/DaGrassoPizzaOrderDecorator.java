package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DaGrassoPizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    protected DaGrassoPizzaOrderDecorator(PizzaOrder pizzaOrder) {
            super(pizzaOrder);
    }


    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(4));
    }
    @Override
    public ArrayList<String> getComponents(){
        ArrayList<String> pizza = super.getComponents();
        pizza.add("Tomato");
        return pizza;
    }
}

