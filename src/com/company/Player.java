package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Player {

    private Scanner scan = new Scanner(System.in);
    private Random rand = new Random();
    private String[] wheel = {"Bankruptcy", "Lose a Turn", "$100", "$200", "$300", "$400", "$500", "$600", "$700", "$800", "$900", "$1000"};
    private int[] value = {0, 0, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    private int score;
    private String name;
    private String guess;
    private int spinPlace;

    public Player(String name) {
        this.name = name;
        score = 0;
    }
    public Player(){}

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getSpinPlace() {
        return spinPlace;
    }

    public int playerSpin() {
        //wheel spin method will spin the wheel
        spinPlace = rand.nextInt(wheel.length);
        System.out.println(name + " spun the wheel and landed on " + wheel[spinPlace]);
        return spinPlace;
    }

    //add score method receiving an integer and taking the wheel spin x integer to add to total score
    public void changeScore(int numOccur) {
        if (spinPlace > 0)
            score = score + value[spinPlace] * numOccur;
        else if (numOccur == -1)
            score=0;
        System.out.println(name +"'s score is now " + score);

    }
    ///make guess/solve(turn) method


}
