package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;
import com.kodilla.good.patterns.challenges.food2door.orders.OrderRequest;

public class Food2Door {
    private Manufacturer manufacturer;

    public void finalProcess(OrderRequest orderRequest) {
        if (orderRequest.getManufacturer().getManufacturerName() == "ExtraFoodShop") {
            manufacturer = new ExtraFoodShop();
        } else if (orderRequest.getManufacturer().getManufacturerName() == "GlutenFreeShop") {
            manufacturer = new GlutenFreeShop();
        } else {
            manufacturer = new HealthyShop();
        }
        manufacturer.process(orderRequest);
    }
}
