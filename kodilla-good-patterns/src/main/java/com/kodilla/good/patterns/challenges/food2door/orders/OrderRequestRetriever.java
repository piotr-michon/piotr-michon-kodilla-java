package com.kodilla.good.patterns.challenges.food2door.orders;


import com.kodilla.good.patterns.challenges.food2door.manufacturers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;
import com.kodilla.good.patterns.challenges.food2door.products.Product;


public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Manufacturer extraFoodShop = new ExtraFoodShop();
        Product product = extraFoodShop.getAvailableProducts().get(0);

        return new OrderRequest(extraFoodShop, product);
    }
}
