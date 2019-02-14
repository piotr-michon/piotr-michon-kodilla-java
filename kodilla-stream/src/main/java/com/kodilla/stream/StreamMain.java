package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> ChronoUnit.YEARS.between(forumUser.getBirthDate(), LocalDate.now()) >= 20)
                .filter(forumUser -> forumUser.getPostsCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserid, forumUser -> forumUser))
                .entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
