package com.domain.spiringfirst.shape;

import org.springframework.stereotype.Component;

/**
 * @author mbaranowicz
 */
@Component
public class Triangle implements Shape{
    @Override
    public String getShapeName() {
        return "Triangle";
    }
}
