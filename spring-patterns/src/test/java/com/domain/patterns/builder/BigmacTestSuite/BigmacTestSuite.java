package com.domain.patterns.builder.BigmacTestSuite;

import com.domain.patterns.builder.bigmac.Bigmac;
import com.domain.patterns.builder.bigmac.Ingredients;
import com.domain.patterns.builder.bigmac.Roll;
import com.domain.patterns.builder.bigmac.Sauce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mbaranowicz
 */
public class BigmacTestSuite {

    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(Roll.standard)
                .burgers(2)
                .sauce(Sauce.standard)
                .ingredient(Ingredients.bacon)
                .ingredient(Ingredients.cucumber)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2,howManyIngredients);
    }
}
