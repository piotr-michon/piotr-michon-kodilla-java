package com.kodilla.rps;

import java.util.Scanner;

public class PlayerInput {
    private String name;
    private String move;
    private boolean condition;
    private int numberOfRounds;
    Scanner scanner = new Scanner(System.in);

    public void setName() {
        System.out.println("\nPlease enter your name: ");
        condition = false;
        while (!condition) {
            name = scanner.nextLine();
            if (name.length() >= 3) {
                condition = true;
            } else {
                System.out.println("You name needs to be at least 3 characters long! Please enter your name again: ");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setNumberOfRounds() {
        System.out.println("\nPlease enter number of rounds you would like to play: ");
        condition = false;
        while (!condition) {
            try {
                numberOfRounds = scanner.nextInt();
                if (numberOfRounds > 0) {
                    condition = true;
                } else {
                    System.out.println("Please enter correct number of rounds: ");
                }
            } catch (Exception e) {
                System.out.println("Please enter correct number of rounds: ");
                scanner.next();
            }
        }
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public String playerMove() {
        System.out.println("Please press 1 for rock, 2 for paper, 3 for scissors, 4 for lizard or 5 for Spock: ");
        condition = false;
        while (!condition) {
            try {
                move = scanner.next().toUpperCase();
                if (move.equals("1")) {
                    System.out.println(getName() + " chose rock!");
                    condition = true;
                    return "1";
                } else if (move.equals("2")) {
                    System.out.println(getName() + " chose paper!");
                    condition = true;
                    return "2";
                } else if (move.equals("3")) {
                    System.out.println(getName() + " chose scissors!");
                    condition = true;
                    return "3";
                } else if (move.equals("4")) {
                    System.out.println(getName() + " chose lizard!");
                    condition = true;
                    return "4";
                } else if (move.equals("5")) {
                    System.out.println(getName() + " chose Spock!");
                    condition = true;
                    return "5";
                } else if (move.equals("X")) {
                    condition = true;
                    return "X";
                } else if (move.equals("N")) {
                    condition = true;
                    return "N";
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Incorrect input! Please try again.");
            }
        }
        return move;
    }
}