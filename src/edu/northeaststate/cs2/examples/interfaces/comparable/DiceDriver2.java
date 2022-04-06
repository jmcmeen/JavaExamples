package edu.northeaststate.cs2.examples.interfaces.comparable;

import java.util.ArrayList;

public class DiceDriver2 {
    public static void main(String[] args) {
        ArrayList<Dice> dice = new ArrayList<>();

        createDice(dice, 4, 2);
        createDice(dice, 6, 2);
        createDice(dice, 10, 2);

        rollAllDice(dice);
        sortDiceByLastRoll(dice);
        printAllDice(dice);
    }

    public static void sortDiceByLastRoll(ArrayList<Dice> dice){
        dice.sort(new CompareDiceByLastRoll());
    }

    public static void sortDiceByNumSides(ArrayList<Dice> dice){
        dice.sort(new CompareDiceByNumSides());
    }

    public static void createDice(ArrayList<Dice> dice, int numSides, int numDice){
        for (int i = 0; i < numDice; i++) {
            dice.add(new Dice(numSides));
        }
    }

    public static void rollAllDice(ArrayList<Dice> dice){
        for (int i = 0; i < dice.size(); i++) {
            dice.get(i).roll();
        }
    }

    public static void printAllDice(ArrayList<Dice> dice){
        for (int i = 0; i < dice.size() ; i++) {
            System.out.println(dice.get(i));
        }
    }
}
