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

        while(notSolved){
            white.outputPuzzle();

            do{
                System.out.print("Please guess a character or solve the puzzle: ");
                guess = scan.nextLine();


                notSolved = white.solveCheck(guess);
                if (notSolved == false){
                    guess = "*";
                }




            } while (guess.length() > 1);
            guess = guess.toUpperCase(Locale.ROOT);


            white.letterGuess(guess);
            guess = "XX";

        }





        //boolean notSolved = true;




        System.out.println("Congrats! You're right!");




    }
}
