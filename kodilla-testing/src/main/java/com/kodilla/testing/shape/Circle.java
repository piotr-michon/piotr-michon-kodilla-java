package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private double field;

    public Circle(String shapeName, double field) {
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