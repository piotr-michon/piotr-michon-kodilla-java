package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }
    public void removeFigure(Shape shape){
        if(shapeList.contains(shape)) {
            shapeList.remove(shape);
        }
    }
    public Shape getFigure(int n) {
        return shapeList.get(n);
    }
    public void showFigures(){
        System.out.println(shapeList);
    }
}