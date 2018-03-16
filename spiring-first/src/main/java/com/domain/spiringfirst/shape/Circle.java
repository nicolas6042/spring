package com.domain.spiringfirst.shape;

import org.springframework.stereotype.Component;

/**
 * @author mbaranowicz
 */
@Component
public class Circle implements Shape {
    @Override
    public String getShapeName() {
        return "Circle";
    }
}
