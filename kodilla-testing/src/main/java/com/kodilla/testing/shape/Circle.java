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
    public double getField(Object object) {
        if (object instanceof Circle) {
            Circle circle = (Circle) object;
            double shapeField = pow((3.14 * circle.getRadius()), 2);
            System.out.println("[CIRCLE] getField" + shapeField);
            return shapeField;
        } else {
            System.out.println("[CIRCLE] error field is not a circle");
            return 0;
        }
    }

    public double getRadius() {
        return radius;
    }
}
