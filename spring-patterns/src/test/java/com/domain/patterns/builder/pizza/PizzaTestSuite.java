package com.domain.patterns.builder.pizza;

import com.domain.patterns.builder.Pizza;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mbaranowicz
 */
public class PizzaTestSuite {

    @Test
    public void testPizzaNew(){
        //Given
        Pizza pizza =new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
    }
}
