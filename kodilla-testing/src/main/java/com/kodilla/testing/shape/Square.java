package com.kodilla.testing.shape;

import static java.lang.StrictMath.pow;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField(Object object) {
        Square square = (Square) object;
        return pow(square.getSide(), 2);
    }

    public double getSide() {
        return side;
    }
}
