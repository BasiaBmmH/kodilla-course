package com.kodilla.testing.statistics;

import java.util.List;

public class User implements Statistics {

private String name;
    public User(String name) {
        this.name = name;
    }

    @Override
    public List<String> usersNames() {
        return null;
    }

    @Override
    public int postsCount() {
        return 0;
    }

    @Override
    public int commentsCount() {
        return 0;
    }
}
