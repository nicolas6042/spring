package com.domain.springhibernate.tasklist.dao;

import com.domain.springhibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author mbaranowicz
 */
public interface TaskListDao extends CrudRepository<TaskList, Integer> {

    List<TaskList> findByListName(String listName);
}
