package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING";
    public static final String PAINTING_TASK = "PAINTING";
    public static final String DRIVING_TASK = "DRIVING";

    public final Task createTask(final String taskType) {
        switch (taskType) {
            case SHOPPING_TASK:
                return new ShoppingTask("Dummy shopping task", "Apples", 10);
            case PAINTING_TASK:
                return new PaintingTask("Dummy painting task", "White", "Wall");
            case DRIVING_TASK:
                return new DrivingTask("Dummy driving task", "Warsaw", "Car");
            default:
                return null;
        }
    }
}
