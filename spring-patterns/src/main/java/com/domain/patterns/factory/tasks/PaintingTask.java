package com.domain.patterns.factory.tasks;

/**
 * @author mbaranowicz
 */
public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean taskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Your Painting Task: "+ taskName + ", " +color + ", " + whatToPaint);
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
