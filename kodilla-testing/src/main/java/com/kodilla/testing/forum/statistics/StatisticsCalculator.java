package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    private int totalNoOfUsers;
    private int totalNoOfPosts;
    private int totalNoOfComments;
    private double avgNoOfPostsPerUser;
    private double avgNoOfCommentsPerUser;
    private double avgNoOfCommentsPerPost;

    public double getAvgNoOfPostsPerUser() {
        return avgNoOfPostsPerUser;
    }

    public double getAvgNoOfCommentsPerUser() {
        return avgNoOfCommentsPerUser;
    }

    public double getAvgNoOfCommentsPerPost() {
        return avgNoOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        totalNoOfPosts = statistics.postsCount();
        totalNoOfComments = statistics.commentsCount();

        if (statistics.usersNames().size() > 0) {
            totalNoOfUsers = statistics.usersNames().size();
        } else {
            totalNoOfUsers = 0;
        }
        if (totalNoOfUsers > 0) {
            avgNoOfPostsPerUser = totalNoOfPosts / totalNoOfUsers;
            avgNoOfCommentsPerUser = totalNoOfComments / totalNoOfUsers;
        } else {
            avgNoOfPostsPerUser = 0;
            avgNoOfCommentsPerUser = 0;
        }
        if (totalNoOfPosts > 0) {
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