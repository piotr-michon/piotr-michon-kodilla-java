package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userid;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsCount;

    public ForumUser(final int userid, final String username, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int postsCount) {
        this.userid = userid;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsCount = postsCount;
    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsCount=" + postsCount +
                '}';
    }
}