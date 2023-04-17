package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.List;

public class Forum {


    //TODO dodać przypadki użytkowników niespełniających pozostałe filtry tj. data urodzenia, liczba postów)
    private List<ForumUser> forumUsers = List.of(new ForumUser(1, "Joe", 'M', LocalDate.of(2002, 1,1), 3),
            new ForumUser(2, "Ann", 'F', LocalDate.of(2002, 1,1), 3),
            new ForumUser(3, "Mike", 'M', LocalDate.of(2021, 4,10), 192),
            new ForumUser(4, "Matt", 'M', LocalDate.of(2002, 1,1), 0),
            new ForumUser(5, "Chriss", 'M', LocalDate.of(1998, 4,19), 25),
            new ForumUser(6, "Amy", 'F', LocalDate.of(2002, 1,10), 21),
            new ForumUser(7, "Andrew", 'M', LocalDate.of(1978, 12,11), 192));

    public List<ForumUser> getUserList(){
        return forumUsers;
    }


}
