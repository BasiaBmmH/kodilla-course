package com.kodilla.testing.shape;
public class Triangle implements Shape {
    private double side;
    private double height;


    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public void getField(Object object) {
        double field = ((Triangle) object.getSide() * (Triangle) object.getHeight()) / 2;
        System.out.println(field);

    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }
}
