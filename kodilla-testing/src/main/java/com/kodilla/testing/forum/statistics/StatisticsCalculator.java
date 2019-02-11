package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int totalNoOfUsers;
    int totalNoOfPosts;
    int totalNoOfComments;
    double avgNoOfPostsPerUser;
    double avgNoOfCommentsPerUser;
    double avgNoOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        totalNoOfUsers = statistics.usersNames().size();
        totalNoOfPosts = statistics.postsCount();
        totalNoOfComments = statistics.commentsCount();

        if(totalNoOfUsers > 0) {
            avgNoOfPostsPerUser = totalNoOfPosts / totalNoOfUsers;
            avgNoOfCommentsPerUser = totalNoOfComments / totalNoOfUsers;
        } else {
            avgNoOfPostsPerUser = 0;
            avgNoOfCommentsPerUser = 0;
        }
        if(totalNoOfPosts > 0) {
            avgNoOfCommentsPerPost = totalNoOfComments / totalNoOfPosts;
        } else {
            avgNoOfCommentsPerPost = 0;
        }
    }
    public void showStatistics() {
        System.out.println("Total number of users: " + totalNoOfUsers);
        System.out.println("Total number of posts: " + totalNoOfPosts);
        System.out.println("Total number of comments: " + totalNoOfComments);
        System.out.println("Average number of posts per user: " + avgNoOfPostsPerUser);
        System.out.println("Average number of comments per user: " + avgNoOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + avgNoOfCommentsPerPost);
    }
}