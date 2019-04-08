package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;
import com.kodilla.good.patterns.challenges.food2door.products.Product;


public class OrderRequest {
    private Manufacturer manufacturer;
    private Product product;

    public OrderRequest(Manufacturer manufacturer, Product product) {
        this.manufacturer = manufacturer;
        this.product = product;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Product getProduct() {
        return product;
    }
}
