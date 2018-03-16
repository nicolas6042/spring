package com.domain.patterns.factory.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author mbaranowicz
 */
public class TaskFactoryTestSuite {

    @Test
    public void testDrivingFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("DRIVING", drivingTask.getTaskName());
        assertTrue(drivingTask.executeTask());
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("PAINTING", paintingTask.getTaskName());
        assertTrue(paintingTask.executeTask());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testShoppingFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("SHOPPING",shoppingTask.getTaskName());
        assertTrue(shoppingTask.executeTask());
        assertTrue(shoppingTask.isTaskExecuted());
    }
}
