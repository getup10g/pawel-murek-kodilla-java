package com.kodilla.good.patterns.challenges.food2door;

public class Food2Door {
    public static void main(String args[]){
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        OrderProducts orderExtraFoodShop = new OrderProducts(extraFoodShop);
        orderExtraFoodShop.previewOfManufacture();

        orderExtraFoodShop.addToOrderList(1);
        orderExtraFoodShop.addToOrderList(2);
        orderExtraFoodShop.printOrderList();
        orderExtraFoodShop.makeOrder();
    }
}
