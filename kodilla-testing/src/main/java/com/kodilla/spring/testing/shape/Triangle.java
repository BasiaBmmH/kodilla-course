package com.kodilla.spring.testing.shape;

public class Triangle implements Shape {
    private double side;
    private double height;


    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField(Object objectt) {
        Triangle object = (Triangle) objectt;
        return (object.getSide() * object.getHeight()) / 2;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }
}
