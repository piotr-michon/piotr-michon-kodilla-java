package com.kodilla.rps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Game {
    private Map<String, String> results;
    private Map<String, Winner> score;
    private int currentRound;
    private int playerScore;
    private int computerScore;
    private boolean end = false;

    public void startGame() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("Introduction.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
    }

    public String comMoves() {
        Random r = new Random();
        int move = r.nextInt(5) + 1;
        if (move == 1) {
            System.out.println("Computer chose rock!");
            return "1";
        } else if (move == 2) {
            System.out.println("Computer chose paper!");
            return "2";
        } else if (move == 3) {
            System.out.println("Computer chose scissor!");
            return "3";
        } else if (move == 4) {
            System.out.println("Computer chose lizard!");
            return "4";
        } else {
            System.out.println("Computer chose Spock!");
            return "5";
        }
    }

    public void playGame() {
        currentRound = 1;
        playerScore = 0;
        computerScore = 0;
        results = new HashMap<>();
        results.put("11", "It's a draw!");
        results.put("12", "Paper covers rock! You lose!");
        results.put("13", "Rock crushes scissors! You win!");
        results.put("14", "Rock crushes lizard! You win!");
        results.put("15", "Spock vaporizes rock! You lose!");
        results.put("21", "Paper covers rock! You win!");
        results.put("22", "It's a draw!");
        results.put("23", "Scissors cut paper! You lose!");
        results.put("24", "Lizard eats paper! You lose!");
        results.put("25", "Paper disproves Spock! You win!");
        results.put("31", "Rock crushes scissors! You lose!");
        results.put("32", "Scissors cut paper! You win!");
        results.put("33", "It's a draw!");
        results.put("34", "Scissors decapitate lizard! You win!");
        results.put("35", "Spock smashes scissors! You lose!");
        results.put("41", "Rock crushes lizard! You lose!");
        results.put("42", "Lizard eats paper! You win!");
        results.put("43", "Scissors decapitate lizard! You lose!");
        results.put("44", "It's a draw!");
        results.put("45", "Lizard poisons Spock! You win!");
        results.put("51", "Spock vaporizes rock! You win!");
        results.put("52", "Paper disproves Spock! You lose!");
        results.put("53", "Spock smashes scissors! You win!");
        results.put("54", "Lizard poisons Spock! You lose!");
        results.put("55", "It's a draw!");

        score = new HashMap<>();
        score.put("It's a draw!", Winner.DRAW);
        score.put("Paper covers rock! You lose!", Winner.COMPUTER);
        score.put("Rock crushes scissors! You win!", Winner.PLAYER);
        score.put("Rock crushes lizard! You win!", Winner.PLAYER);
        score.put("Spock vaporizes rock! You lose!", Winner.COMPUTER);
        score.put("Paper covers rock! You win!", Winner.PLAYER);
        score.put("Scissors cut paper! You lose!", Winner.COMPUTER);
        score.put("Lizard eats paper! You lose!", Winner.COMPUTER);
        score.put("Paper disproves Spock! You win!", Winner.PLAYER);
        score.put("Rock crushes scissors! You lose!", Winner.COMPUTER);
        score.put("Scissors cut paper! You win!", Winner.PLAYER);
        score.put("Scissors decapitate lizard! You win!", Winner.PLAYER);
        score.put("Spock smashes scissors! You lose!", Winner.COMPUTER);
        score.put("Rock crushes lizard! You lose!", Winner.COMPUTER);
        score.put("Lizard eats paper! You win!", Winner.PLAYER);
        score.put("Scissors decapitate lizard! You lose!", Winner.COMPUTER);
        score.put("Lizard poisons Spock! You win!", Winner.PLAYER);
        score.put("Spock vaporizes rock! You win!", Winner.PLAYER);
        score.put("Paper disproves Spock! You lose!", Winner.COMPUTER);
        score.put("Spock smashes scissors! You win!", Winner.PLAYER);
        score.put("Lizard poisons Spock! You lose!", Winner.COMPUTER);

        PlayerInput playerInput = new PlayerInput();
        playerInput.setName();
        playerInput.setNumberOfRounds();
        while (!end && playerInput.getNumberOfRounds() >= currentRound) {
            System.out.println("\nRound " + currentRound + " out of " + playerInput.getNumberOfRounds());
            String playerChoice;
            playerChoice = playerInput.playerMove();
            if (playerChoice.equals("X")) {
                System.out.println("Would you like to end this game? Press Y for yes, every other choice will continue the game.");
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine().toUpperCase();
                if (s.equals("Y")) {
                    System.out.println("\nThanks for playing!");
                    end = true;
                    break;
                } else {
                    continue;
                }
            } else if (playerChoice.equals("N")) {
                System.out.println("Would you like to end this game and start new one? Press Y for yes, every other choice will continue the game.");
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine().toUpperCase();
                if (s.equals("Y")) {
                    System.out.println("\nStarting new game!");
                    playerInput.setNumberOfRounds();
                    currentRound = 1;
                    playerScore = 0;
                    computerScore = 0;
                    continue;
                } else {
                    continue;
                }
            }
            String computerChoice;
            computerChoice = comMoves();
            String result;
            result = results.get(playerChoice + computerChoice);
            if (score.get(result).equals(Winner.DRAW)) {
                System.out.println(result);
                computerScore++;
                playerScore++;
            } else if (score.get(result).equals(Winner.COMPUTER)) {
                System.out.println(result);
                computerScore++;
            } else if (score.get(result).equals(Winner.PLAYER)) {
                System.out.println(result);
                playerScore++;
            }
            System.out.println(playerInput.getName() + " score: " + playerScore);
            System.out.println("Computer score : " + computerScore);
            currentRound++;
        }
        System.out.println("\nGame ended. Final score: " + playerInput.getName() + " " + playerScore + " - " + computerScore + " Computer");
    }
}