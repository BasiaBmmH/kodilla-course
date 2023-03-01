package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    /** Napisz testy sprawdzające metody klasy ShapeCollector.
     W swoich testach wykorzystaj klasy wewnętrzne i adnotacje
    @Nested oraz @DisplayName.
    */

    @DisplayName("test getFigureAtIndex")
    @Test
    public void testGetFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(20));
        shapeCollector.addFigure(new Circle(40));

        //when
        Shape figureAtZeroIndex = shapeCollector.getFigure(0);
        Shape figureAtFirstIndex = shapeCollector.getFigure(1);
        shapeCollector.showFigures();
        //then
        Assertions.assertEquals("square", figureAtZeroIndex.getShapeName());
        Assertions.assertEquals("circle", figureAtFirstIndex.getShapeName());
    }

    @DisplayName("test testAddFigureToList")
    @Test
    public void testAddFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Circle (3.12);
        Shape shape2 = new Triangle (2.1,3);
        Shape shape3 = new Square (4);


        //when
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);


        //then
        Assertions.assertEquals(    ,   );
        Assertions.assertEquals(    ,   );
    }



}
