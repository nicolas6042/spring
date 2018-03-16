package com.domain.spiringfirst.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author mbaranowicz
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.domain.spiringfirst.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(2, 2);
        double sub = calculator.sub(2, 2);
        double mul = calculator.mul(2, 2);
        double div = calculator.div(2, 2);
        //Then
        Assert.assertEquals(4.0, add, 0.001);
        Assert.assertEquals(0.0, sub, 0.001);
        Assert.assertEquals(4.0, mul, 0.001);
        Assert.assertEquals(1.0, div, 0.001);
    }
}
