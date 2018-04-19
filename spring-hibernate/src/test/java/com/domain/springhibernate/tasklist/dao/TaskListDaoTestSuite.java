package com.domain.springhibernate.tasklist.dao;

import com.domain.springhibernate.hibernate.task.Task;
import com.domain.springhibernate.hibernate.task.TaskFinancialDetails;
import com.domain.springhibernate.tasklist.TaskList;
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
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "DESCRIPTION";
    private static final String LISTNAME = "LISTNAME";

    @Test
    public void testFindByListName(){
        //given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        String listName = taskList.getListName();
        taskListDao.save(taskList);
        //when
        List<TaskList> taskNames = taskListDao.findByListName(listName);
        //Then
        assertEquals(1,taskNames.size());

        //CleanUp
        int id = taskNames.get(0).getId();
        taskListDao.delete(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks(){
        //Given
        Task task = new Task("Test: Learn Hibernate",14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20),false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10),false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0,id);

        //CleanUp
        taskListDao.delete(id);

    }
}
