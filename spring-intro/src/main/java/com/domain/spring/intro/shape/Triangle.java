package com.domain.spring.intro.shape;

/**
 * @author mbaranowicz
 */
public class Triangle implements Shape{

    @Override
    public String draw() {
        System.out.println("Triangle");
        return "Triangle";
    }
}
