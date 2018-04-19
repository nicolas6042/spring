package com.domain.springhibernate.hibernate.task.dao;

import com.domain.springhibernate.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author mbaranowicz
 */
@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {

    List<Task> findByDuration(int duration);
}
