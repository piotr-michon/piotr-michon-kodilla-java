package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secCha = new SecondChallenge();
        try {
            secCha.probablyIWillThrowException(2, 2);
        } catch (Exception e) {
            System.out.println("Error! Exception detected!");
        }
    }
}
