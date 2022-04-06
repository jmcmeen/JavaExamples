package edu.northeaststate.cs2.examples.interfaces.comparable;

import java.util.Random;

public class Dice implements Comparable<Dice>{
    private int numSides;
    private int lastRoll;

    public Dice(){
        this.numSides = 6;
        this.lastRoll = 0;
    }

    public Dice(int numSides) {
        this.numSides = numSides;
        this.lastRoll = 0;
    }

    public int getNumSides(){
        return this.numSides;
    }

    public int getLastRoll(){
        return this.lastRoll;
    }

    public int roll(){
        Random r = new Random();
        this.lastRoll = r.nextInt(numSides) + 1;
        return this.lastRoll;
    }

    @Override
    public int compareTo(Dice dice) {
        return Integer.compare(this.lastRoll, dice.lastRoll);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dice{");
        sb.append("numSides=").append(numSides);
        sb.append(", lastRoll=").append(lastRoll);
        sb.append('}');
        return sb.toString();
    }
}
