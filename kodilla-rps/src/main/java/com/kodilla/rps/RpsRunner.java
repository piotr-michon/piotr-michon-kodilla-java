package com.kodilla.rps;

import java.io.FileNotFoundException;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.startGame();
        } catch (FileNotFoundException e) {
            System.out.println("Problem with reading an introduction file!");
        }
        game.playGame();
    }
}