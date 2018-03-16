package com.domain.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddShape(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(3,shapeCollector.getSize());
    }

    @Test
    public void testRemoveShape(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        boolean result1 = shapeCollector.removeFigure(square);
        boolean result2 = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertEquals(0,shapeCollector.getSize());

    }
    @Test
    public void testRemoveShapeNotExist(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        //When
        boolean result = shapeCollector.removeFigure(square);
        boolean result1 = shapeCollector.removeFigure(circle);
        boolean result2 = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertFalse(result);
        Assert.assertFalse(result1);
        Assert.assertFalse(result2);
    }

    @Test
    public void testGetShape(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //When
        Shape retrievedShape = shapeCollector.getFigure(0);
        Shape retrievedShape1 = shapeCollector.getFigure(1);
        Shape retrievedShape2 = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals(retrievedShape,square);
        Assert.assertEquals(retrievedShape1,triangle);
        Assert.assertEquals(retrievedShape2,circle);
    }
}
