package com.example.shapes;

public class Circle implements Shapes {
    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
