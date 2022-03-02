package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Vana white = new Vana();
        Player player1 = new Player("George");

        boolean notSolved = true;
        String guess;
        int numOccur;

        while (notSolved) {
            white.outputPuzzle();

            do {
                player1.playerSpin();
                if (player1.getSpinPlace() > 1) {
                    System.out.print("Please guess a character or solve the puzzle: ");
                    guess = scan.nextLine();
                }else if (player1.getSpinPlace()==1) {
                    guess ="*";
                } else guess = ("%");

                notSolved = white.solveCheck(guess);
                if (notSolved == false) {
                    guess = "*";
                }


            } while (guess.length() > 1);
            guess = guess.toUpperCase(Locale.ROOT);


            numOccur = white.letterGuess(guess);

            player1.changeScore(numOccur);
            System.out.println(" ");
            guess = "XX";
            numOccur = 0;
        }


        //boolean notSolved = true;


        System.out.println("Congrats! You're right!");


    }
}
