package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Object> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.figures.add(shape);
    }

// TODO dwa testy
    public void removeFigure(Shape shape) {
        this.figures.remove(shape);
    }
    // TODO jeszcze jeden test
    public Shape getFigure(int iNumber) {
        return this.figures.get(iNumber);
    }

// TODO dwa testy
    public void showFigures() {
        System.out.println(this.figures);
    }

}
