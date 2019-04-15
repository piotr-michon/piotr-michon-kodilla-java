package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Dummy shopping task", shopping.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertFalse(painting.isTaskExecuted());
        Assert.assertEquals("Dummy painting task", painting.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Dummy driving task", driving.getTaskName());
    }
}