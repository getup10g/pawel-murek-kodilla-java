package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AmericanskaPizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    protected AmericanskaPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(3));
    }
    @Override
    public ArrayList<String> getComponents(){
        ArrayList<String> pizza = super.getComponents();
        pizza.add("Mushrooms");
        return pizza;
    }
}
