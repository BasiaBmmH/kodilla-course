package com.kodilla.testing.shape;

public class Square implements Shape {

    private double height;
    private double side;


    public Square(double height, double side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public void getField(Object object) {
        double field = (Square) object.getHeght()*object.getSide();
        System.out.println(field);

    }

    public double getHeight() {
        return height;
    }

    public double getSide() {
        return side;
    }
}
