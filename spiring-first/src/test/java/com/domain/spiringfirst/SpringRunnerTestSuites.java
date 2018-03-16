package com.domain.spiringfirst;

import com.domain.spiringfirst.shape.Shape;
import com.domain.spiringfirst.shape.Square;
import com.domain.spiringfirst.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuites {

	@Test
	public void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.domain.spiringfirst.shape");

		Shape shape = (Shape) context.getBean("circle");
		//When
		String name = shape.getShapeName();

		//Then

		Assert.assertEquals("Circle", name);
	}

	@Test
	public void testTriangleLoadedIntoContainer(){
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.domain.spiringfirst.shape");

		Shape shape =(Shape) context.getBean("triangle");
		//When
		String naem = shape.getShapeName();
		//Then
		Assert.assertEquals("Triangle",naem);
	}

	@Test
	public void testSquareLoadedIntoContainer(){
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.domain.spiringfirst.shape");

		Shape shape =(Shape) context.getBean("createSquare");
		//When
		String name = shape.getShapeName();
		//Then
		Assert.assertEquals("Square",name);
	}

	@Test
	public void testShapeLoadedIntoContainer(){
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.domain.spiringfirst.shape");
		Shape shape = (Shape) context.getBean("chooseShape");
		//When
		String name = shape.getShapeName();
		//Then
		System.out.println("Choosen shape says: " + name);
	}
}
