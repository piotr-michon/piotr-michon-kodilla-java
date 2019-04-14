package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new YGeneration("John Doe");
        User user2 = new ZGeneration("Jane Doe");
        User user3 = new Millenials("Jake Doe");

        //When
        System.out.println("John just posted: " + user1.post());
        System.out.println("Jane just posted: " + user2.post());
        System.out.println("Jake just posted: " + user3.post());

        //Then
        Assert.assertEquals("Dummy Snapchat post", user1.post());
        Assert.assertEquals("Dummy Facebook post", user2.post());
        Assert.assertEquals("Dummy Twitter post", user3.post());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user = new YGeneration("Robert Smith");

        //When
        System.out.println("Robert just posted: " + user.post());
        user.setPostingPreferences(new FacebookPublisher());
        System.out.println("Robert just posted: " + user.post());

        //Then
        Assert.assertEquals("Dummy Facebook post", user.post());
    }
}