package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class OrderRepositoryService implements OrderRepository {
    @Override
    public boolean createOrder(User user, Product product, LocalDate orderDate) {
        return true;
    }
}
