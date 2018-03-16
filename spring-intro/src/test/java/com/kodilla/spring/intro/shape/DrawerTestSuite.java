package com.kodilla.spring.intro.shape;

import com.domain.spring.intro.shape.Circle;
import com.domain.spring.intro.shape.Drawer;
import com.domain.spring.intro.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mbaranowicz
 */
public class DrawerTestSuite {


    @Test
    public void testDoDrawingWithCircle(){
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("Circle",result);
    }

    @Test
    public void testDoDrawingWithTriangle(){
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("Triangle",result);
    }
}
