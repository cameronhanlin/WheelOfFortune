package com.company;

import java.util.Random;

public class Puzzle {

    private String[] phrases = {"DON'T BE HARD ON YOURSELF","AMANDA IS THE GREATEST"};
    private String[] categories = {"MOTIVATION","TRUTH"};

    private Random rand = new Random();
    private String puzzle;
    private String category;

    public Puzzle(){
        int x = rand.nextInt(phrases.length);

        puzzle = phrases[x];
        category = categories[x];
    }

    public void getNewPuzzle(){
        int x = rand.nextInt(phrases.length);

        puzzle = phrases[x];
        category = categories[x];
    }

    public String getPhrase() {
        return puzzle;
    }

    public String getCategory() {
        return category;
    }
}
