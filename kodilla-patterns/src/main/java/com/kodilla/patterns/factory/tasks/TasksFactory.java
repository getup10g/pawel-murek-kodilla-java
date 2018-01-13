package com.kodilla.patterns.factory.tasks;

public class TasksFactory {
    public static final String PAINTINGTASK = "Painting Task";
    public static final String DRIVINGTASK = "Driving Task";
    public static final String SHOPPINGTASK = "Shopping Task";

    public Task makeTask(String taskName) {
        switch (taskName) {
            case PAINTINGTASK:
                return new PaintingTask("Wall painting", "Red", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Drag", "San Fransisco", "Toyota Supra");
            case SHOPPINGTASK:
                return new ShoppingTask("Food shopping", "Milk", 1);
            default:
                return null;
        }
    }
}
