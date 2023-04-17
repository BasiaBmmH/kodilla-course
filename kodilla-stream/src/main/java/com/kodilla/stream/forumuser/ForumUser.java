package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
   private int id;
   private String name;
   private char sex;
  private LocalDate birthDay;
   private int postsCount;

    public ForumUser(int id, String name, char sex, LocalDate birthDay, int postsCount) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
        this.postsCount = postsCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostsCount() {
        return postsCount;
    }
}
