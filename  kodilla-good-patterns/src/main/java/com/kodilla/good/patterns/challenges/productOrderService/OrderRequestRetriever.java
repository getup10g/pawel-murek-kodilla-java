package com.kodilla.good.patterns.challenges.productOrderService;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Paul","Bradford","Nottignham","00001");
        ShopList shopList = new ShopList();
        shopList.addProductToOrder("Pralka");
        shopList.addProductToOrder("Telewizor");
        ShippingMethod shippingMethod = new ShippingMethod("DPD");
        return new OrderRequest(user,shopList,shippingMethod);

    }

}
