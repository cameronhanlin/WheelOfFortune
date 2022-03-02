package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Vana white = new Vana();
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Andrea"));
        playerList.add(new Player("Ehab"));
        playerList.add(new Player("Julia"));
        Player winner = new Player();

        boolean notSolved = true;
        String guess;
        int numOccur;
        int turn = 0;

        while (notSolved) {
            white.outputPuzzle();

            do {
                playerList.get(turn).playerSpin();
                if (playerList.get(turn).getSpinPlace() > 1) {
                    System.out.print("Please guess a character or solve the puzzle: ");
                    guess = scan.nextLine();
                }else if (playerList.get(turn).getSpinPlace()==1) {
                    guess ="*";
                } else guess = ("%");

                notSolved = white.solveCheck(guess);
                if (notSolved == false) {
                    guess = "*";
                }


            } while (guess.length() > 1);
            guess = guess.toUpperCase(Locale.ROOT);


            numOccur = white.letterGuess(guess);

            playerList.get(turn).changeScore(numOccur);
            System.out.println(" ");
            turn++;
            if (turn == 3){
                turn=0;
            }

            guess = "XX";
            numOccur = 0;
        }


        //boolean notSolved = true;

        winner=playerList.get(0);
        if (winner.getScore() < playerList.get(1).getScore()){
            winner=playerList.get(1);
        }
        if (winner.getScore() < playerList.get(2).getScore()){
            winner=playerList.get(2);
        }
        System.out.println("Congrats!" +winner.getName()+ " you win with a final score of "+ winner.getScore());


    }
}
