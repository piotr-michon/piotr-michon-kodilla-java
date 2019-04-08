package com.kodilla.good.patterns.challenges.food2door.manufacturers;

import com.kodilla.good.patterns.challenges.food2door.orders.*;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Manufacturer {
    private static final String MANUFACTURER_NAME = "HealthyShop";
    private List<Product> products = new ArrayList<>();

    @Override
    public String getManufacturerName() {
        return MANUFACTURER_NAME;
    }

    @Override
    public List<Product> getAvailableProducts() {
        products.add(new Product("Cheese", 3.99, 150));
        products.add(new Product("Water", 0.99, 200));
        return products;
    }

    @Override
    public OrderDto process(final OrderRequest orderRequest) {
        if (orderRequest.getManufacturer().getManufacturerName() == MANUFACTURER_NAME) {
            OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new OrderRepositoryService());
            return orderProcessor.process(orderRequest);
        }
        return new OrderDto(orderRequest.getManufacturer(), false);
    }
}
