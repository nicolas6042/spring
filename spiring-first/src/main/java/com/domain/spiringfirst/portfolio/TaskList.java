package com.domain.spiringfirst.portfolio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mbaranowicz
 */
public class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks=new ArrayList<>();
    }

    public void addTask(String task){
        tasks.add(task);
    }

    public void removeTask(String task){
        tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
