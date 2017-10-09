package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals(shopping.getTaskName(), "Buy car");
        Assert.assertEquals(shopping.isTaskExecuted(), false);
    }

    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask("PAINTING");
        //Then
        Assert.assertEquals(painting.getTaskName(), "Paint Mona Lisa");
        Assert.assertEquals(painting.isTaskExecuted(), false);
    }

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals(driving.getTaskName(), "Go to London");
        Assert.assertEquals(driving.isTaskExecuted(), true);
    }
}
