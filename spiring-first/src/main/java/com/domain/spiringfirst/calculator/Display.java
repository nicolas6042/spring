package com.domain.spiringfirst.calculator;

import org.springframework.stereotype.Component;

/**
 * @author mbaranowicz
 */
@Component
public class Display {

    public void displayValue(Double val) {
        System.out.println("Result " +val);
    }
}
