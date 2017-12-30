package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public interface Manufacturer {
    void importAvailability();
    ArrayList<Product> checkAvailability();
    Product returnProduct(int number);
    boolean process(ArrayList<Product> orderList);
}
