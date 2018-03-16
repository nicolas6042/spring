package com.domain.patterns.factory.tasks;

/**
 * @author mbaranowicz
 */
public final class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Your shopping task: " + taskName + ", " +whatToBuy + ", " + quantity);
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
