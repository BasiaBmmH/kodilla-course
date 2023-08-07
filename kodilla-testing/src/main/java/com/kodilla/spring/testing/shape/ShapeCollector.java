package com.kodilla.spring.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


    private final List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        this.figures.remove(shape);
    }

    @Override
    public String toString() {
        StringBuilder showFigures = new StringBuilder();
        for (int i = 0; i < this.figures.size(); i++) {
            showFigures.append(this.figures.get(i).getShapeName()).append(" ");
        }
        return showFigures.toString();
    }

    public Shape getFigure(int iNumber) {
        return this.figures.get(iNumber);
    }

    public List<Shape> getFigures() {
        return figures;
    }
}
