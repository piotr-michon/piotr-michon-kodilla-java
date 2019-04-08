package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(Manufacturer manufacturer, Product product) {
        return true;
    }
}
