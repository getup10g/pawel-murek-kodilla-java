package com.kodilla.good.patterns.challenges.productOrderService;

public interface OrdService {
    boolean order(User user, ShopList shopList, ShippingMethod shippingMethod);
}
