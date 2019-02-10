package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shaCol = new ShapeCollector();
        Shape square = new Square("Square", 4);
        //When
        shaCol.addFigure(square);
        //Then
        Assert.assertEquals(square, shaCol.getFigure(0));
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shaCol = new ShapeCollector();
        Shape square = new Square("Square", 4);
        Shape triangle = new Triangle("Triangle", 4);
        shaCol.addFigure(square);
        shaCol.addFigure(triangle);
        //When
        shaCol.removeFigure(square);
        //Then
        Assert.assertEquals(triangle, shaCol.getFigure(0));
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shaCol = new ShapeCollector();
        Shape square = new Square("Square", 4);
        shaCol.addFigure(square);
        //When
        shaCol.getFigure(0);
        //Then
        Assert.assertEquals(square, shaCol.getFigure(0));
    }
}