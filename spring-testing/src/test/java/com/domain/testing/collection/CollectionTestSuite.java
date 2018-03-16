package com.domain.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> n = new ArrayList<>();
        System.out.println("Testing empty List");
        //Then
        Assert.assertTrue(exterminator.exterminate(n).size() == 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            n.add(i);
        }

        System.out.println("Testing Normal List");
        List<Integer> result = Arrays.asList(0,2,4,6,8);
        //Then
        Assert.assertEquals(result,exterminator.exterminate(n));
    }
}
