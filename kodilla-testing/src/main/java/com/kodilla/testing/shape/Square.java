package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private double field;

    public Square(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }
    public String getShapeName() {
        return shapeName;
    }
    public double getField() {
        return field;
    }
}