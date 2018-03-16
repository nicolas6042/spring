package com.domain.spiringfirst.forum;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author mbaranowicz
 */
public class ForumUserTestSuite {

    @Test
    public void testGetUsername(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.domain.spiringfirst.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String result = forumUser.getUsername();

        //Then
        Assert.assertEquals("John Smith", result);
    }
}
