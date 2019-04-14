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
        System.out.println("John just posted: " + user1.sharePost());
        System.out.println("Jane just posted: " + user2.sharePost());
        System.out.println("Jake just posted: " + user3.sharePost());

        //Then
        Assert.assertEquals("Dummy Snapchat sharePost", user1.sharePost());
        Assert.assertEquals("Dummy Facebook sharePost", user2.sharePost());
        Assert.assertEquals("Dummy Twitter sharePost", user3.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user = new YGeneration("Robert Smith");

        //When
        System.out.println("Robert just posted: " + user.sharePost());
        user.setSharingPreferences(new FacebookPublisher());
        System.out.println("Robert just posted: " + user.sharePost());

        //Then
        Assert.assertEquals("Dummy Facebook sharePost", user.sharePost());
    }
}