package com.domain.stream.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mbaranowicz
 */
public class ArrayOperationsTestSuite {

    @Test
    public void testGetAvg(){
        //Given
        int[] numbers = {1,2,3,4,5};

        //When
        double avg = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(3, avg, 0.001);
    }
}
