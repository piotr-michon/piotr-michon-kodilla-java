package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.orders.OrderRequest;
import com.kodilla.good.patterns.challenges.food2door.orders.OrderRequestRetriever;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        Food2Door food2Door = new Food2Door();
        food2Door.finalProcess(orderRequest);
    }
}
