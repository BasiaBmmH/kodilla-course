package com.kodilla.testing.statistics;

import java.util.List;

interface Statistics {
    List<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}