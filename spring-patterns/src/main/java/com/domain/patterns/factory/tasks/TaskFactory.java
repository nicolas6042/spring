package com.domain.patterns.factory.tasks;

/**
 * @author mbaranowicz
 */
public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("DRIVING", "AIR", "CAR");
            case PAINTING:
                return new PaintingTask("PAINTING", "RED", "DOG");
            case SHOPPING:
                return new ShoppingTask("SHOPPING", "BALL", 2.0);
            default:
                return null;
        }
    }
}
