package com.domain.spring.intro.shape;

/**
 * @author mbaranowicz
 */
public class Circle implements Shape{

    @Override
    public String draw() {
        System.out.println("Circle");
        return "Circle";
    }
}
