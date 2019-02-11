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

    private static List<String> usersListCreator(int usersQuantity) {
        List<String> tenUsersList = new ArrayList<>();
        for (int i = 1; i <= usersQuantity; i++) {
            tenUsersList.add("User " + i);
        }
        return tenUsersList;
    }

    @Test
    public void testCalculateAdvStatisticsWhenTotalNoOfPostsEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(usersListCreator(10));
        int totalNoOfPosts = 0;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 100;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, staCal.getAvgNoOfPostsPerUser(), 0);
        Assert.assertEquals(10, staCal.getAvgNoOfCommentsPerUser(), 0);
        Assert.assertEquals(0, staCal.getAvgNoOfCommentsPerPost(),0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenTotalNoOfPostsEqualsOneThousandAndIsMoreThanTotalNoOfComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(usersListCreator(10));
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 100;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, staCal.getAvgNoOfPostsPerUser(), 0);
        Assert.assertEquals(10, staCal.getAvgNoOfCommentsPerUser(), 0);
        Assert.assertEquals(0, staCal.getAvgNoOfCommentsPerPost(),0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenTotalNoOfCommentsEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(usersListCreator(10));
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 0;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, staCal.getAvgNoOfPostsPerUser(), 0);
        Assert.assertEquals(0, staCal.getAvgNoOfCommentsPerUser(), 0);
        Assert.assertEquals(0, staCal.getAvgNoOfCommentsPerPost(),0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenTotalNoOfCommentsIsMoreThanTotalNoOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(usersListCreator(10));
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 10000;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, staCal.getAvgNoOfPostsPerUser(), 0);
        Assert.assertEquals(1000, staCal.getAvgNoOfCommentsPerUser(), 0);
        Assert.assertEquals(10, staCal.getAvgNoOfCommentsPerPost(),0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenTotalNoOfUsersEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> emptyUsersList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(emptyUsersList);
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 10000;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, staCal.getAvgNoOfPostsPerUser(), 0);
        Assert.assertEquals(0, staCal.getAvgNoOfCommentsPerUser(), 0);
        Assert.assertEquals(10, staCal.getAvgNoOfCommentsPerPost(),0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenTotalNoOfUsersEqualsOneHundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersNames()).thenReturn(usersListCreator(100));
        int totalNoOfPosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(totalNoOfPosts);
        int totalNoOfComments = 10000;
        when(statisticsMock.commentsCount()).thenReturn(totalNoOfComments);

        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, staCal.getAvgNoOfPostsPerUser(), 0);
        Assert.assertEquals(100, staCal.getAvgNoOfCommentsPerUser(), 0);
        Assert.assertEquals(10, staCal.getAvgNoOfCommentsPerPost(),0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsersNamesEqualsNull() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(null);
        StatisticsCalculator staCal = new StatisticsCalculator();
        //When
        staCal.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, staCal.getTotalNoOfUsers());
    }
}