package com.kodilla.good.patterns.challenges.allegro;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Order information has been sent on e-mail address: " + user.getEmailAddress());
    }
}
