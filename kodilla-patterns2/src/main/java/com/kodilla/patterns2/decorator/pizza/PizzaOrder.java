package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public interface PizzaOrder {
    ArrayList<String> getComponents();
    BigDecimal getCost();
}
