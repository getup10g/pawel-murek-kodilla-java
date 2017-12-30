package com.kodilla.good.patterns.challenges.productOrderService;

public interface OrdService {
    boolean order(Customer user, ShopList shopList, ShippingMethod shippingMethod);
}
