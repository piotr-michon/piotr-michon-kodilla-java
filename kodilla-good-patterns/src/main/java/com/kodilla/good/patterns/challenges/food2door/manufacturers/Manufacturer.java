package com.kodilla.good.patterns.challenges.food2door.manufacturers;

import com.kodilla.good.patterns.challenges.food2door.orders.OrderDto;
import com.kodilla.good.patterns.challenges.food2door.orders.OrderRequest;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.util.List;

public interface Manufacturer {
    String getManufacturerName();
    List<Product> getAvailableProducts();
    OrderDto process(OrderRequest orderRequest);
}
