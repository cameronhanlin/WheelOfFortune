package com.company;

import java.util.Locale;

public class Vana {


    private Puzzle puzzle = new Puzzle();
    private String phrase;
    private String category;
    private String emptyPhrase;
    private String finalPhrase;


    public Vana() {
        newPuzzle();
    }

    public void newPuzzle() {
        puzzle.getNewPuzzle();
        phrase = puzzle.getPhrase();
        category = puzzle.getCategory();
        emptyPhrase = phrase.replaceAll("[a-zA-Z]", "X");
        finalPhrase = phrase;
        // notSolved = true;
    }

    /*public boolean getNotSolved(){
        return notSolved;
    }

    public void switchNotSolved(){
        notSolved = !notSolved;
    }

     */

    public void outputPuzzle() {
        //System.out.println(phrase);
        System.out.println(category);
        System.out.println(emptyPhrase);
        //System.out.println(finalPhrase);
    }

    public int letterGuess(String guess) {
        int x;
        int numOccur = 0;


        if (guess.equals("*")) {
            //nothing needs to happen
        }else if (guess.equals("%")){
            numOccur=-1;
        } else if (phrase.indexOf(guess) == -1) {
            System.out.println("Sorry, that letter is not in the puzzle");
        } else {
            while (phrase.indexOf(guess) != -1) {
                x = phrase.indexOf(guess);
                emptyPhrase = emptyPhrase.substring(0, x) + phrase.charAt(x) + emptyPhrase.substring(x + 1);
                phrase = phrase.substring(0, x) + "-" + phrase.substring(x + 1);
                numOccur++;
            }
            System.out.println("There are " + numOccur+ " "+ guess +"'s");

        }
        return numOccur;
    }

    public boolean solveCheck(String guess) {
        guess = guess.toUpperCase(Locale.ROOT);
        return !guess.equals(finalPhrase);
    }


}
