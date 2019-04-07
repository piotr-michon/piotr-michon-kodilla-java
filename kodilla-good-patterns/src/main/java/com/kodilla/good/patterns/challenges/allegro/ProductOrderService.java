package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User user, Product product, LocalDate orderDate) {
        return true;
    }
}
