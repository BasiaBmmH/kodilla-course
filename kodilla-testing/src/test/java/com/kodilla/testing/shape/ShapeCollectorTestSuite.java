package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    /**
     * Napisz testy sprawdzające metody klasy ShapeCollector.
     * W swoich testach wykorzystaj klasy wewnętrzne i adnotacje
     *
     * @Nested
     */

    @DisplayName("test getFigureAtIndex")
    @Test
    public void testGetFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(20));
        shapeCollector.addFigure(new Circle(40));
        shapeCollector.addFigure(new Triangle(2.2,1.3));

        //when
        Shape figureAtZeroIndex = shapeCollector.getFigure(0);
        Shape figureAtFirstIndex = shapeCollector.getFigure(1);
        Shape figureAtSecondIndex = shapeCollector.getFigure(2);
        shapeCollector.showFigures();
        //then
        Assertions.assertEquals("square", figureAtZeroIndex.getShapeName());
        Assertions.assertEquals("circle", figureAtFirstIndex.getShapeName());
        Assertions.assertEquals("triangle", figureAtSecondIndex.getShapeName());
    }

    @DisplayName("test testAddFigureToList")
    @Test
    public void testAddFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle(3.12);
        Shape shape2 = new Triangle(2.1, 3);
        Shape shape3 = new Square(4);


        //when
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);


        //then wypisze nazwy dodanych figur
        Assertions.assertEquals("circle", shape1.getShapeName());
        Assertions.assertEquals("triangle", shape2.getShapeName());
        Assertions.assertEquals("square", shape3.getShapeName());
    }

    @DisplayName("test removeFigure")
    @Test
    public void testRemoveFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle(4.12);
        Shape shape2 = new Triangle(2, 1.2);
        Shape shape3 = new Square(8);

        //when
        shapeCollector.removeFigure(shape1);
        shapeCollector.removeFigure(shape2);
        shapeCollector.removeFigure(shape3);

        //then
        Assertions.assertEquals(null, shape1.getShapeName());



    }


}
