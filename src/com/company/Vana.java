package com.company;

import java.util.Locale;

public class Vana {



    private Puzzle puzzle = new Puzzle();
    private String phrase;
    private String category;
    private String emptyPhrase;
    private String finalPhrase;


    public Vana(){
        newPuzzle();
    }

    public void newPuzzle(){
        puzzle.getNewPuzzle();
        phrase = puzzle.getPhrase();
        category = puzzle.getCategory();
        emptyPhrase = phrase.replaceAll("[a-zA-Z]","X");
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

    public void outputPuzzle(){
        //System.out.println(phrase);
        System.out.println(category);
        System.out.println(emptyPhrase);
        //System.out.println(finalPhrase);
    }

    public void letterGuess(String guess){
        int x;

        if(guess.equals("*")){
            //nothing needs to happen
        }
        else if(phrase.indexOf(guess) == -1){
            System.out.println("Sorry, that letter is not in the puzzle");
        }
        else {
            while(phrase.indexOf(guess) != -1){
                x = phrase.indexOf(guess);
                emptyPhrase = emptyPhrase.substring(0,x)+phrase.charAt(x)+emptyPhrase.substring(x+1);
                phrase = phrase.substring(0,x)+"-"+phrase.substring(x+1);
            }

        }
        //this is going to have to return a number for how many letters of the guess are in the puzzle.
    }

    public boolean solveCheck(String guess){
        guess = guess.toUpperCase(Locale.ROOT);
        return !guess.equals(finalPhrase);
    }


}
