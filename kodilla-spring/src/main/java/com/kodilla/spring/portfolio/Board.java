package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(final TaskList toDoList,final TaskList inProgressList,final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public void addTaskToDoList(String task){
        toDoList.addTask(task);
    }
    public void addTaskInProgressList(String task){
        inProgressList.addTask(task);
    }
    public void addTaskDoneList(String task){
        doneList.addTask(task);
    }
    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

}