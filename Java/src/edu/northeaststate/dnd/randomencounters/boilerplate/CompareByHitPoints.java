package edu.northeaststate.dnd.randomencounters.boilerplate;

import edu.northeaststate.dnd.randomencounters.boilerplate.monsters.Monster;

import java.util.Comparator;

public class CompareByHitPoints implements Comparator<Monster> {
    @Override
    public int compare(Monster m1, Monster m2) {
        return m1.getHitPoints() - m2.getHitPoints();
    }
}
