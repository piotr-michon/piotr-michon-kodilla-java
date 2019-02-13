package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "User1", 'M', 1991, 5, 11, 0));
        userList.add(new ForumUser(2, "User2", 'F', 1992, 6, 12, 101));
        userList.add(new ForumUser(3, "User3", 'M', 1993, 7, 13, 100));
        userList.add(new ForumUser(4, "User4", 'F', 1994, 8, 14, 103));
        userList.add(new ForumUser(5, "User5", 'M', 2005, 9, 15, 104));
        userList.add(new ForumUser(6, "User6", 'F', 1995, 10, 16, 105));
        userList.add(new ForumUser(7, "User7", 'M', 1996, 11, 17, 106));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
