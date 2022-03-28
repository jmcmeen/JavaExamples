package edu.northeaststate.cs2;

import java.util.Random;

public class Dice {
    int numsides;

    public Dice(int numsides) {
        this.numsides = numsides;
    }

    public int roll(){
        Random r = new Random();

        return r.nextInt(numsides) + 1;
    }
}
