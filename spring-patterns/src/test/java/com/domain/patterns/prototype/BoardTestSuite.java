package com.domain.patterns.prototype;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author mbaranowicz
 */
public class BoardTestSuite {
    @Test
    public void testToString() {
        //Given
        //creating the TaskList for todos
        TasksList listToDo = new TasksList("To Do tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number " + n)));

        TasksList listInProgress = new TasksList("In Progress tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task " + n)));

        TasksList listDone = new TasksList("Done tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n->listDone.getTasks().add(new Task("Done Task number "+n)));

        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        Board cloneBoard = null;
        try{
            cloneBoard=board.shallowCopy();
            cloneBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Board deepCloneBoard = null;
        try{
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project number 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);
        //Then

        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepCloneBoard);

        assertEquals(2,board.getLists().size());
        assertEquals(2,cloneBoard.getLists().size());
        assertEquals(3,deepCloneBoard.getLists().size());
        assertEquals(cloneBoard.getLists(),board.getLists());
        assertNotEquals(deepCloneBoard.getLists(),board.getLists());
    }
}
