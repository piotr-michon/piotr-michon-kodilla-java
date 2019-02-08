package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case - begin");
    }
    @After
    public void after() {
        System.out.println("Test case - end\n");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumExt = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Testing method on empty list");
        ArrayList<Integer> result = new ArrayList<>();
        Assert.assertEquals(oddNumExt.exterminate(numbers), result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumExt = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("Testing method on normal list");
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(2);
        result.add(4);
        result.add(6);
        result.add(8);
        Assert.assertEquals(oddNumExt.exterminate(numbers), result);
    }
}
