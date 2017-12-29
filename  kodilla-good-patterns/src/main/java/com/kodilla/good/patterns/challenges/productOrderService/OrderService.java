package com.kodilla.good.patterns.challenges.productOrderService;

public class OrderService implements OrdService {
    public boolean order(final User user,final ShopList shopList, final ShippingMethod shippingMethod){
        System.out.println(user.getFirstname()+";"+user.getLastname()+";"+user.getAdress()+";"+shopList.getShopList()+";"+shippingMethod.getShippintMethod());
    return true;
    }
}
