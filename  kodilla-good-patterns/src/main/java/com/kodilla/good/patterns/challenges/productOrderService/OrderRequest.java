package com.kodilla.good.patterns.challenges.productOrderService;

public class OrderRequest {
    public User user;
    public ShopList shopList;
    public ShippingMethod shippingMethod;

    public OrderRequest(User user, ShopList shopList, ShippingMethod shippingMethod) {
        this.user = user;
        this.shopList = shopList;
        this.shippingMethod = shippingMethod;
    }

    public User getUser() {
        return user;
    }

    public ShopList getShopList() {
        return shopList;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

}
