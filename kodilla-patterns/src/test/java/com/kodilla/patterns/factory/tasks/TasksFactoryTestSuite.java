package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TasksFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Task shoppingTask = factory.makeTask(TasksFactory.SHOPPINGTASK);
        shoppingTask.executeTask();

        //Then
        Assert.assertEquals(shoppingTask.getTaskName(),"Food shopping");
        Assert.assertEquals(shoppingTask.isTaskExecuted(),true);
    }
    @Test
    public void testDrivingTask(){
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Task drivingTask = factory.makeTask(TasksFactory.DRIVINGTASK);
        drivingTask.executeTask();

        //Then
        Assert.assertEquals(drivingTask.getTaskName(),"Drag");
        Assert.assertEquals(drivingTask.isTaskExecuted(),true);
    }
    @Test
    public void testPaintingTask(){
        //Given
        TasksFactory factory = new TasksFactory();
        //When
        Task paintingTask = factory.makeTask(TasksFactory.PAINTINGTASK);
        paintingTask.executeTask();

        //Then
        Assert.assertEquals(paintingTask.getTaskName(),"Wall painting");
        Assert.assertEquals(paintingTask.isTaskExecuted(),true);
    }
}
