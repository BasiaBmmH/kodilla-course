package com.kodilla.testing.shape;

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

    public Shape getFigure(int iNumber) {
        return this.figures.get(iNumber);
    }

    public String showFigures() {
        String showFigures = "";
        for (int i = 0; i < this.figures.size(); i++) {
            showFigures = showFigures + this.figures.get(i).getShapeName() + " ";
        }
        return showFigures;
    }
}
