package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock - Paper - Scissor game!\n");

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = s.next();
        System.out.println("\nAvailable game modes:");
        System.out.println("1. Classic (Rock - Paper - Scissor)");
        System.out.println("2. Extended (Rock - Paper - Scissor - Lizard - Spock)");
        System.out.print("Please select 1 or 2: ");
        int gameMode = s.nextInt();
        //tu dać instrukcję dotyczącą klawiszy używanych do obsługi gry
        System.out.print("\nPlease enter number of rounds: ");
        int noOfRounds = s.nextInt();
        System.out.println("\nAvailable difficulty levels:");
        System.out.println("1. Easy");
        System.out.println("2. Normal");
        System.out.println("3. Hard");
        System.out.print("Please select 1, 2 or 3: ");
        int difficulty = s.nextInt();
    }
}
