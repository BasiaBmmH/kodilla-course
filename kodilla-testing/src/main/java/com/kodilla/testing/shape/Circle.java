package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return "circle";
    }

    @Override
    public void getField(Object object) {


    }

    public double getRadius() {
        return radius;
    }
}
