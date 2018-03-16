package com.domain.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestSuite3 {

    @Test
    public void testPostCount0() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<>();
        usernameList.add("TestUser");
        int posts = 0;
        when(statistics.usersNames()).thenReturn(usernameList);
        when(statistics.postsCount()).thenReturn(posts);
        CounterStatistics counterStatistics = new CounterStatistics();
        //When
        counterStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, counterStatistics.getPostsCount());

    }

    @Test
    public void testPostCount1000() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<>();
        usernameList.add("TestUser");
        int posts = 1000;
        when(statistics.usersNames()).thenReturn(usernameList);
        when(statistics.postsCount()).thenReturn(posts);
        CounterStatistics counterStatistics = new CounterStatistics();
        //When
        counterStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(1000, counterStatistics.getPostsCount());
    }

    @Test
    public void testCommentCount0() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<>();
        usernameList.add("TesterUser");
        int comments = 0;
        when(statistics.usersNames()).thenReturn(usernameList);
        when(statistics.commentsCount()).thenReturn(comments);
        CounterStatistics counterStatistics = new CounterStatistics();
        //When
        counterStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, counterStatistics.getCommentCount());
    }

    @Test
    public void testCommentLowerThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<>();
        usernameList.add("TesterUser");
        int posts = 20;
        int comments = 10;
        when(statistics.usersNames()).thenReturn(usernameList);
        when(statistics.postsCount()).thenReturn(posts);
        when(statistics.commentsCount()).thenReturn(comments);
        CounterStatistics counterStatistics = new CounterStatistics();
        //When
        counterStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0.5, counterStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCommentHighterThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<>();
        usernameList.add("TesterUser");
        int posts = 10;
        int comments = 20;
        when(statistics.usersNames()).thenReturn(usernameList);
        when(statistics.postsCount()).thenReturn(posts);
        when(statistics.commentsCount()).thenReturn(comments);
        CounterStatistics counterStatistics = new CounterStatistics();
        //When
        counterStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(2, counterStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testUsers0() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(usernameList);
        CounterStatistics counterStatistics = new CounterStatistics();
        //When
        counterStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, counterStatistics.getUsersCount());
        Assert.assertEquals(0, counterStatistics.getAveragePostsPerUser(), 0.01);
    }

    @Test
    public void testUser100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> usernameList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usernameList.add("a " + i);
        }
        when(statistics.usersNames()).thenReturn(usernameList);
        CounterStatistics counterStatistics = new CounterStatistics();
        //When
        counterStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100, counterStatistics.getUsersCount());
    }
}
