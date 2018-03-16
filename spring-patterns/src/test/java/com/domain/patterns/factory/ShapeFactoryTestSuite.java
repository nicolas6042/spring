package com.domain.patterns.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mbaranowicz
 */
public class ShapeFactoryTestSuite {

    @Test
    public void testFactoryCircle(){
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape circle = shapeFactory.makeShape(ShapeFactory.CIRCLE);
        //Then
        assertEquals(Math.PI * Math.pow(4.50,2.0),circle.getField(),0);
        assertEquals("The rounded circle",circle.getName());
    }

    @Test
    public void testFactorySquare(){
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape square = shapeFactory.makeShape(ShapeFactory.SQUARE);
        //Then
        assertEquals(28.0,square.getCircumference(),0);
        assertEquals("The angular square", square.getName());
    }

    @Test
    public void testFactoryRectangle(){
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape rectangle = shapeFactory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        assertEquals(37.50,rectangle.getField(),0);
        assertEquals("The long rectangle",rectangle.getName());
    }
}
