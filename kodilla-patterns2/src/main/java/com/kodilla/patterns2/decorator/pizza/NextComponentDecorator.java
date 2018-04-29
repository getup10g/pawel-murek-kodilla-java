package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NextComponentDecorator extends AbstractPizzaOrderDecorator {
    String componentName;
    BigDecimal componentPrice;
    protected NextComponentDecorator(PizzaOrder pizzaOrder, String componentName, BigDecimal componentPrice) {
        super(pizzaOrder);
        this.componentName=componentName;
        this.componentPrice=componentPrice;
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(componentPrice);
    }
    @Override
    public ArrayList<String> getComponents(){
        ArrayList<String> pizza = super.getComponents();
        pizza.add(componentName);
        return pizza;
        //return pizza.add("Tomato");
    }
}

