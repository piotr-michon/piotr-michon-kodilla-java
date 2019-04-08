package com.kodilla.good.patterns.challenges.food2door.orders;


public class OrderProcessor {
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getManufacturer(), orderRequest.getProduct());

        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getManufacturer(), orderRequest.getProduct());
            System.out.println("Your order has been successfully processed!");
            return new OrderDto(orderRequest.getManufacturer(), true);
        } else {
            System.out.println("We are sorry! Your order could not be successfully processed!");
            return new OrderDto(orderRequest.getManufacturer(), false);
        }
    }
}
