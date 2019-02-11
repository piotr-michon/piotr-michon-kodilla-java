package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
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
    public void testCalculateAdvStatistics() {
        //Case: totalNoOfPosts = 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            usersList.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        int totalNoOfPosts = 0;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 100;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, staCal.avgNoOfPostsPerUser, 0);
        Assert.assertEquals(10, staCal.avgNoOfCommentsPerUser, 0);
        Assert.assertEquals(0, staCal.avgNoOfCommentsPerPost,0);
    }
    @Test
    public void testCalculateAdvStatistics1() {
        //Case: totalNoOfPosts = 1000 && Case: totalNoOfComments < totalNoOfPosts
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            usersList.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 100;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, staCal.avgNoOfPostsPerUser, 0);
        Assert.assertEquals(10, staCal.avgNoOfCommentsPerUser, 0);
        Assert.assertEquals(0, staCal.avgNoOfCommentsPerPost,0);
    }
    @Test
    public void testCalculateAdvStatistics2() {
        //Case: totalNoOfComments = 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            usersList.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 0;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, staCal.avgNoOfPostsPerUser, 0);
        Assert.assertEquals(0, staCal.avgNoOfCommentsPerUser, 0);
        Assert.assertEquals(0, staCal.avgNoOfCommentsPerPost,0);
    }
    @Test
    public void testCalculateAdvStatistics3() {
        //Case: totalNoOfComments > totalNoOfPosts
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            usersList.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 10000;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, staCal.avgNoOfPostsPerUser, 0);
        Assert.assertEquals(1000, staCal.avgNoOfCommentsPerUser, 0);
        Assert.assertEquals(10, staCal.avgNoOfCommentsPerPost,0);
    }
    @Test
    public void testCalculateAdvStatistics4() {
        //Case: totalNoOfUsers = 0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 10000;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, staCal.avgNoOfPostsPerUser, 0);
        Assert.assertEquals(0, staCal.avgNoOfCommentsPerUser, 0);
        Assert.assertEquals(10, staCal.avgNoOfCommentsPerPost,0);
    }
    @Test
    public void testCalculateAdvStatistics5() {
        //Case: totalNoOfUsers = 100
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersList.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 10000;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, staCal.avgNoOfPostsPerUser, 0);
        Assert.assertEquals(100, staCal.avgNoOfCommentsPerUser, 0);
        Assert.assertEquals(10, staCal.avgNoOfCommentsPerPost,0);
    }
}