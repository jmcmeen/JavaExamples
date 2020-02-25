package edu.northeaststate.dungeonsanddragons;

import java.util.Random;

public class SimpleDiceRoller {
    public static int roll(int numSides){
        Random r = new Random();

        return r.nextInt(numSides) + 1;
    }
}
