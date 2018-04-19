package com.domain.springhibernate.task.dao;

import com.domain.springhibernate.hibernate.task.Task;
import com.domain.springhibernate.hibernate.task.TaskFinancialDetails;
import com.domain.springhibernate.hibernate.task.dao.TaskDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author mbaranowicz
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Hibernate";

    @Test
    public void testTaskDaoSave(){
        //Given
        Task task = new Task(DESCRIPTION,7);

        //When
        taskDao.save(task);

        //Then
        int id = task.getId();
        Task readTask = taskDao.findOne(id);
        assertEquals(id,readTask.getId());

        //CleanUp
        taskDao.delete(id);
    }

    @Test
    public void testTaskDaoFindByDuration(){
        //Given
        Task task = new Task(DESCRIPTION,7);
        taskDao.save(task);
        int duration = task.getDuration();

        //when
        List<Task> readTasks = taskDao.findByDuration(duration);

        //then
        assertEquals(1,readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskDao.delete(id);
    }

    @Test
    public void testTaskDaoSaveWithFinancialDetails(){
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120),false));

        //When
        taskDao.save(task);
        int id=task.getId();

        //Then

        assertNotEquals(0,id);

        //CleanUp
        taskDao.delete(id);
    }
}
