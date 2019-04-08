package com.kodilla.good.patterns.challenges.food2door.manufacturers;

import com.kodilla.good.patterns.challenges.food2door.orders.*;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Manufacturer {
    private static final String MANUFACTURER_NAME = "GlutenFreeShop";
    private List<Product> products = new ArrayList<>();

    @Override
    public String getManufacturerName() {
        return MANUFACTURER_NAME;
    }

    @Override
    public List<Product> getAvailableProducts() {
        products.add(new Product("Milk", 2.99, 100));
        products.add(new Product("Noodles", 1.99, 300));
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
