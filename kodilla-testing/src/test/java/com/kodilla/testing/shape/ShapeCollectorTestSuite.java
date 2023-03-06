package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test: get and add figures")
    class GetAndShowFigures {
        @DisplayName("test getFigureAtIndex")
        @Test
        public void testGetFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square(20));
            shapeCollector.addFigure(new Circle(40));
            shapeCollector.addFigure(new Triangle(2.2, 1.3));

            //when
            Shape figureAtZeroIndex = shapeCollector.getFigure(0);
            Shape figureAtFirstIndex = shapeCollector.getFigure(1);
            Shape figureAtSecondIndex = shapeCollector.getFigure(2);

            //then
            Assertions.assertEquals("square", figureAtZeroIndex.getShapeName());
            Assertions.assertEquals("circle", figureAtFirstIndex.getShapeName());
            Assertions.assertEquals("triangle", figureAtSecondIndex.getShapeName());
        }


        @DisplayName("test showFigures")
        @Test
        public void testShowFigures() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle(4.12);
            Shape shape2 = new Triangle(2, 1.2);
            Shape shape3 = new Square(8);

            //when
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            //then
            Assertions.assertEquals("circle triangle square ", shapeCollector.showFigures());
        }
    }

    @Nested
    @DisplayName("Test: Add and removefigures")
    class TestAddRemoveFigure {
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
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            shapeCollector.removeFigure(shape1);
            shapeCollector.removeFigure(shape2);
            shapeCollector.removeFigure(shape3);

            //then
            Assertions.assertEquals(false, shapeCollector.getFigures().contains(shape1));
            Assertions.assertEquals(false, shapeCollector.getFigures().contains(shape2));
            Assertions.assertEquals(false, shapeCollector.getFigures().contains(shape3));
        }
    }


}
