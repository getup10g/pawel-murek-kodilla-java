package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.ArrayList;

public class ShopList {
    private ArrayList<String> shopList = new ArrayList<>();

    public ArrayList<String> getShopList() {
        return shopList;
    }

    public void addProductToOrder(String product){
        shopList.add(product);
    }
}
