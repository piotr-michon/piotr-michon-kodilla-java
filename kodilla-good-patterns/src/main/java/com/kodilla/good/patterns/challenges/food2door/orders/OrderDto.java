package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;

public class OrderDto {
    private Manufacturer manufacturer;
    private boolean isOrdered;

    public OrderDto(Manufacturer manufacturer, boolean isOrdered) {
        this.manufacturer = manufacturer;
        this.isOrdered = isOrdered;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
