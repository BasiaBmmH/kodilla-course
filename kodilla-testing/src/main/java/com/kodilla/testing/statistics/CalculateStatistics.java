package com.kodilla.testing.statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * utwórz klasę obliczającą następujące statystyki:
 *
 * liczbę użytkowników,
 * liczbę postów,
 * liczbę komentarzy,
 * średnią liczbę postów na użytkownika,
 * średnią liczbę komentarzy na użytkownika,
 * średnią liczbę komentarzy na post.
 */

public class CalculateStatistics implements Statistics {

    public List<String> userNames = new ArrayList<>();
    public int numberOfUsers = 0;
    public int numberOfPosts = 0;
    public int numberOfComments = 0;
    public double numbersOfPostsPerUser = 0.0;
    public double numbersOfCommentsPerUser = 0.0;
    public double numbersOfCommentsPerPost = 0.0;

    @Override
    public List<String> usersNames() {
        return userNames;
    }

    @Override
    public int postsCount() {
        return numberOfPosts;
    }

    @Override
    public int commentsCount() {
        return numberOfComments;
    }
    public int howManyUsers(){
        return usersNames().size();

    }

    public int howManyPosts(){
        return postsCount();
    }

    public int howManyComments(){
        return commentsCount();
    }

    public double postsAveragePerUser(){
        if(postsCount() == 0 || howManyUsers() == 0) return 0;
        return postsCount()/howManyUsers();
    }

    public double commentsAveragePerUser(){
        if(commentsCount() == 0 || howManyUsers() == 0) return 0;
        return commentsCount()/howManyUsers();

    }

    public double commentsAveragePerPost(){
        if(commentsCount() == 0 || howManyPosts() == 0) return 0;
        return commentsCount()/howManyPosts();

    }

    public void calculateAdvStatistics(Statistics statistics) {
        userNames = statistics.usersNames();
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        numbersOfCommentsPerPost = commentsAveragePerPost();
        numbersOfCommentsPerUser = commentsAveragePerUser();
        numbersOfPostsPerUser = postsAveragePerUser();
//        showStatistics();
    }


}
