package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public interface OrderRepository {
    boolean createOrder(User user, Product product, LocalDate orderDate);
}
