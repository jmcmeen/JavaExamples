package edu.northeaststate.cs2.examples.interfaces.comparable;

import java.util.Comparator;

public class CompareDiceByNumSides implements Comparator<Dice> {
    @Override
    public int compare(Dice o1, Dice o2) {
        return Integer.compare(o1.getNumSides(), o2.getNumSides());
    }
}
