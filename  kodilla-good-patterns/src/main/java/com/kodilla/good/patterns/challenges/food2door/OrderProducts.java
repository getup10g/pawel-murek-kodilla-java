package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;

public class OrderProducts {
    Manufacturer manufacturer;
    private ArrayList<Product> orderList = new ArrayList<>();

    public OrderProducts(Manufacturer manufacturer){
        this.manufacturer=manufacturer;
    }

    public void previewOfManufacture(){
        int i=1;
        manufacturer.importAvailability();
        for (Product product : manufacturer.checkAvailability()) {
            System.out.println(i+": "+product);
            ++i;
        }
    }

    public void addToOrderList(int number) {
        number--;
        orderList.add(manufacturer.returnProduct(number));
    }

    public void printOrderList() {
        int i=1;
        for (Product product : orderList) {
            System.out.println(i+": "+product);
            ++i;
        }

    }

    public void makeOrder(){
        boolean status = manufacturer.process(orderList);
        if(status){
            System.out.println("Order is Successful");
        } else{
            System.out.println("Order not completed");
        }
    }
}
