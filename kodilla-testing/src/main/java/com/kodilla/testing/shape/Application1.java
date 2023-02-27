package com.kodilla.testing.shape;

public class Application1 {

    public static void main(String args[]) {
        Shape circle = new Circle();
        ShapeDrawer shapeDrawer = new ShapeDrawer(circle);

        shapeDrawer.process();

    }
}
