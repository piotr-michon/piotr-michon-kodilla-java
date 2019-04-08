package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

public class OrderRepositoryService implements OrderRepository {
    @Override
    public boolean createOrder(Manufacturer manufacturer, Product product) {
        return true;
    }
}
