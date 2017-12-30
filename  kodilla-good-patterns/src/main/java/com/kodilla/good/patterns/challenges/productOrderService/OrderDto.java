package com.kodilla.good.patterns.challenges.productOrderService;

public class OrderDto {
    private Customer user;
    private boolean isOrdered;

    public OrderDto(final User user,final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
