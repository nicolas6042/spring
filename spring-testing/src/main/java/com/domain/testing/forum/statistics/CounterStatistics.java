package com.domain.testing.forum.statistics;

public class CounterStatistics {

    private int usersCount;
    private int postsCount;
    private int commentCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentCount = statistics.commentsCount();

        if(statistics.usersNames().size()==0){
            System.out.println("User list is empty");
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        } else{
            averagePostsPerUser = (double) postsCount/(double) usersCount;
            averageCommentsPerUser = (double) commentCount/(double) usersCount;
        }
        if(statistics.postsCount() == 0){
            System.out.println("This post has no comments");
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = (double) commentCount / (double) postsCount;
        }

    }


    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

}
