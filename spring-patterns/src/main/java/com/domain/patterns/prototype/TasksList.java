package com.domain.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mbaranowicz
 */
public class TasksList {
    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    public TasksList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TasksList{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
