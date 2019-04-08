package com.kodilla.good.patterns.challenges.food2door.manufacturers;

import com.kodilla.good.patterns.challenges.food2door.orders.*;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Manufacturer {
    private static final String MANUFACTURER_NAME = "ExtraFoodShop";
    private List<Product> products = new ArrayList<>();

    @Override
    public String getManufacturerName() {
        return MANUFACTURER_NAME;
    }

    @Override
    public List<Product> getAvailableProducts() {
        products.add(new Product("Bread", 1.99, 50));
        products.add(new Product("Meat", 5.99, 100));
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
