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
        //Given
        OddNumbersExterminator oddNumExt = new OddNumbersExterminator();
        ArrayList<Integer> expected = new ArrayList<>();
        //When
        ArrayList<Integer> result = oddNumExt.exterminate(new ArrayList<>());
        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumExt = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        //When
        ArrayList<Integer> result = oddNumExt.exterminate(numbers);
        //Then
        Assert.assertEquals(expected, result);
    }
}
