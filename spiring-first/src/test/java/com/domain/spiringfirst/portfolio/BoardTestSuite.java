package com.domain.spiringfirst.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * @author mbaranowicz
 */
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("test1");
        board.getInProgressList().addTask("test2");
        board.getDoneList().addTask("test3");

        //Then
        assertEquals(1, board.getToDoList().getTasks().size());
        assertEquals("test1",board.getToDoList().getTasks().get(0));
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals("test2", board.getInProgressList().getTasks().get(0));
        assertEquals(1,board.getDoneList().getTasks().size());
        assertEquals("test3",board.getDoneList().getTasks().get(0));
    }
}
