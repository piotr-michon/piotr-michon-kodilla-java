package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;
import com.kodilla.good.patterns.challenges.food2door.orders.*;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        Manufacturer extraFoodShop = new ExtraFoodShop();
        extraFoodShop.process(orderRequest);

        Manufacturer glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.process(orderRequest);

        Manufacturer healthyShop = new HealthyShop();
        healthyShop.process(orderRequest);
    }
}
