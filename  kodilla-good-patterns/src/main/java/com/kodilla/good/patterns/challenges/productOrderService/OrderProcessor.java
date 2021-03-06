package com.kodilla.good.patterns.challenges.productOrderService;

public class OrderProcessor {

        private InfService informationService;
        private OrdService orderService;
        private OrderRepository orderRepository;

        public OrderProcessor(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
            this.informationService = informationService;
            this.orderService = orderService;
            this.orderRepository = orderRepository;
        }

        public OrderDto process(final OrderRequest orderRequest) {
            boolean isOrder = orderService.order(orderRequest.getUser(), orderRequest.getShopList(),
                    orderRequest.getShippingMethod());

            if(isOrder) {
                informationService.inform(orderRequest.getUser());
                orderRepository.createOrder(orderRequest.getUser(), orderRequest.getShopList(), orderRequest.getShippingMethod());
                return new OrderDto(orderRequest.getUser(), true);
            } else {
                return new OrderDto(orderRequest.getUser(), false);
            }
        }
}



