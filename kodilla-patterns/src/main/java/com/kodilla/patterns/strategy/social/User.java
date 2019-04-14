package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SocialPublisher;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String post() {
        return socialPublisher.share();
    }

    public void setPostingPreferences(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
