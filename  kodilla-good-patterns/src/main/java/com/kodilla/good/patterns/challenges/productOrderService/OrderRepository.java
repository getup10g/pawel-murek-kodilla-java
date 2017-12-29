package com.kodilla.good.patterns.challenges.productOrderService;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderRepository {

    public void createOrder(final User user,final ShopList shopList, final ShippingMethod shippingMethod) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("order1.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer.println(user.getFirstname()+";"+user.getLastname()+";"+user.getAdress());
        writer.println(shopList.getShopList());
        writer.println(shippingMethod.getShippintMethod());
        writer.close();
    }


}
