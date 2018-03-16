package com.domain.patterns.factory.tasks;

/**
 * @author mbaranowicz
 */
public interface Task {

    boolean executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
