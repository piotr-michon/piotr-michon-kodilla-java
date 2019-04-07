package com.kodilla.good.patterns.challenges.allegro;

public class Product {
    private String productName;
    private int productID;
    private double productPrice;

    public Product(String productName, int productID, double productPrice) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
