package com.domain.patterns.factory.tasks;

/**
 * @author mbaranowicz
 */
public final class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Your Driving Task: " +taskName + ", " + where + ", "+using);
        taskExecuted=true;
        return taskExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
