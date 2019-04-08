package com.kodilla.good.patterns.challenges.food2door.products;

public class Product {
    private String productType;
    private double productPricePerUnit;
    private int productQuantity;

    public Product(String productType, double productPricePerUnit, int productQuantity) {
        this.productType = productType;
        this.productPricePerUnit = productPricePerUnit;
        this.productQuantity = productQuantity;
    }

    public String getProductType() {
        return productType;
    }

    public double getProductPricePerUnit() {
        return productPricePerUnit;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
