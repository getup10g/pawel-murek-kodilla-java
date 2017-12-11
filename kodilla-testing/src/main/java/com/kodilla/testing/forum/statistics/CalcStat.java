package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalcStat  {
   int numberOfUsers;
   int numberOfPosts;
   int numberOfComments;
   double avgNumberCommentsPerUser;
   double avgNumberPostsPerUser;
   double avgNumberCommentsOnPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgNumberCommentsPerUser() {
        return avgNumberCommentsPerUser;
    }

    public double getAvgNumberPostsPerUser() {
        return avgNumberPostsPerUser;
    }

    public double getAvgNumberCommentsOnPost() {
        return avgNumberCommentsOnPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
    this.numberOfUsers=statistics.usersNames().size();
    this.numberOfPosts=statistics.postsCount();
    this.numberOfComments=statistics.commentsCount();
        if(numberOfPosts>0){
            this.avgNumberCommentsOnPost=numberOfComments/numberOfPosts;
        }
        if(numberOfPosts==0){
            this.avgNumberCommentsOnPost=0;
        }
        if(numberOfUsers>0){
            this.avgNumberCommentsPerUser=numberOfComments/numberOfUsers;
            this.avgNumberPostsPerUser=numberOfPosts/numberOfUsers;
        }
        if(numberOfUsers==0){
            this.avgNumberCommentsPerUser=0;
            this.avgNumberPostsPerUser=0;
        }
    }



}
