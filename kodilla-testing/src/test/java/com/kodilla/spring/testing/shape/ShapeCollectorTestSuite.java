package com.kodilla.spring.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test: get and add figures")
    class GetAndShowFigures {
        @DisplayName("test getFigure method at selected index")
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
            Assertions.assertInstanceOf(Circle.class, shape1);
            Assertions.assertEquals("circle triangle square ", shapeCollector.toString());
        }
    }

    @Nested
    @DisplayName("Test modify figures collection size")
    class TestAddRemoveFigure {
        @DisplayName("test addFigure to list")
        @Test
        public void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle(3.12);
            Shape shape2 = new Triangle(2.1, 3);
            Shape shape3 = new Square(4);
            int collectorSizeBeforeAdd = shapeCollector.getFigures().size();

            //when
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            //then
            Assertions.assertEquals(0, collectorSizeBeforeAdd);
            Assertions.assertEquals(3, shapeCollector.getFigures().size());
            Assertions.assertEquals(shape1.getShapeName(), shapeCollector.getFigure(0).getShapeName());
        }

        @DisplayName("test removeFigure")
        @Test
        public void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle(4.12);
            Shape shape2 = new Triangle(2, 1.2);
            Shape shape3 = new Square(8);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            int collectorSizeBeforeRemoving = shapeCollector.getFigures().size();

            //when
            shapeCollector.removeFigure(shape1);
            shapeCollector.removeFigure(shape2);
            shapeCollector.removeFigure(shape3);

            //then
            Assertions.assertEquals(3,collectorSizeBeforeRemoving);
            Assertions.assertEquals(0,shapeCollector.getFigures().size());
            Assertions.assertFalse(shapeCollector.getFigures().contains(shape1));
            Assertions.assertFalse(shapeCollector.getFigures().contains(shape2));
            Assertions.assertFalse(shapeCollector.getFigures().contains(shape3));
        }
    }


}
