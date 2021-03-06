package com.kodilla.good.patterns.challenges.food2door;

public class Drink implements Product{
    private String name;
    private double price;
    private double capacity;
    private int quantity;

    public Drink(String name, double price, double capacity, int quantity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", capacity=" + capacity +
                ", quantity=" + quantity +
                '}';
    }
}
