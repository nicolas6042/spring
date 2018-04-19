package com.domain.springhibernate.task.dao;

import com.domain.springhibernate.hibernate.task.TaskFinancialDetails;
import com.domain.springhibernate.hibernate.task.dao.TaskFinancialDetailsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * @author mbaranowicz
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {

    @Autowired
    TaskFinancialDetailsDao taskFinancialDetailsDao;

    @Test
    public void testFindById(){
        //Given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id =taskFinancialDetails.getId();

        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);

        //Then
        assertEquals(1,resultList.size());

        //CleanUp
        taskFinancialDetailsDao.delete(id);
    }
}
