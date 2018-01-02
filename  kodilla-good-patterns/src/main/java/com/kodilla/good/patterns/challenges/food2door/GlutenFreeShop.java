package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;

public class GlutenFreeShop {
    private ArrayList<Product> availableProducts = new ArrayList<>();

    public void importAvailability(){
        Product sandwich = new Food("Sandwich",8,200,1);
        Product cola = new Drink("Cola 0",4,500,1);
        availableProducts.add(sandwich);
        availableProducts.add(cola);
    }
    public ArrayList<Product> checkAvailability(){
        return availableProducts;
    }
    public Product returnProduct(int number){
        return availableProducts.get(number);
    }

    public boolean process(ArrayList<Product> orderList){
        for (Product product:orderList){
            if(true!=availableProducts.contains(product)){
                System.out.println("Sorry, we can't deliver your order");
                return false;
            }
        }
        return true;
    }
}
