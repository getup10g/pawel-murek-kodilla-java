package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addTaskToDoList("Zrob pranie");
        board.addTaskInProgressList("Zrob pranie");
        board.addTaskDoneList("Zrob pranie");
        boolean resultToDo =  board.getToDoList().getTask().contains("Zrob pranie");
        boolean resultInProgress =  board.getInProgressList().getTask().contains("Zrob pranie");
        boolean resultDoneList =  board.getDoneList().getTask().contains("Zrob pranie");
        //Then
        Assert.assertEquals(resultToDo,true);
        Assert.assertEquals(resultInProgress,true);
        Assert.assertEquals(resultDoneList,true);
    }
}
