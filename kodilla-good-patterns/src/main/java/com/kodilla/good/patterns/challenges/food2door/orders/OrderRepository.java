package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

public interface OrderRepository {
    boolean createOrder(Manufacturer manufacturer, Product product);
}
