package com.domain.testing.forum.tdd;

import com.domain.testing.forum.ForumComment;
import com.domain.testing.forum.ForumPost;
import com.domain.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite2 {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is beginning test");
    }

    @AfterClass
    public  static void afterAllTests(){
        System.out.println("All tests finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith","John Smith");
        //When
        forumUser.addPost("mrsmith","Hello everyone");
        //Then
        Assert.assertEquals(1,forumUser.getPostQuantity());
    }

    @Test
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith","John Smith");
        ForumPost thePost = new ForumPost("Hello everyone","mrsmith");
        //When
        forumUser.addComment(thePost,"mrsmith","Thanks");
        //Then
        Assert.assertEquals(1, forumUser.getCommentQuantity());
    }

    @Test
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith","John Smith");
        ForumPost thePost = new ForumPost("Hello everyone","mrsmith");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());
        //When
        ForumPost retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost,retrievedPost);
    }

    @Test
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith","John Smith");
        ForumPost thePost = new ForumPost("Hello everyone","mrsmith");
        ForumComment theComment = new ForumComment(thePost,"Thanks","mrsmith");
        forumUser.addComment(thePost,theComment.getAuthor(),theComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment,retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith","John Smith");
        ForumPost thePost = new ForumPost("Hello everyone","mrsmith");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith","John Smith");
        ForumPost thePost =new ForumPost("Hello everyone","mrsmith");
        ForumComment theComment = new ForumComment(thePost,"Thanks","mrsmith");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith","John Smith");
        ForumPost thePost = new ForumPost("Hello everyone","mrsmith");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getPostQuantity());
    }

    @Test
    public void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith","John Smith");
        ForumPost thePost = new ForumPost("Hello everyone","mrsmith");
        ForumComment theComment = new ForumComment(thePost,"Thanks","mrsmith");
        forumUser.addComment(thePost,theComment.getAuthor(),theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getCommentQuantity());
    }
}
