package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("John", "Doe", "john.doe@gmail.com");
        Product product = new Product("Shoes", 01, 299.99);
        LocalDate orderDate = LocalDate.now();

        return new OrderRequest(user, product, orderDate);
    }
}
