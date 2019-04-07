package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public interface OrderService {
    boolean order(User user, Product product, LocalDate orderDate);
}
