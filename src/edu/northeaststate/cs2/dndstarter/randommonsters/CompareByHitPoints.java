/**
 * -------------------------------------------------
 * File name: CompareByHitPoints.java
 * Project Name: D&D Encounters
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.randommonsters;

import edu.northeaststate.cs2.dndstarter.randommonsters.monsters.Monster;

import java.util.Comparator;

/**
 * Class Name: CompareByHitPoints
 * Purpose: Implements a Comparator interface to compare two monsters by name
 */
public class CompareByHitPoints implements Comparator<Monster> {

    /**
     * Method Name: compare
     * Method Description: Implements the Comparator interface method, compare. Subtracts second Monster's hit points
     * from the first Monsters hit points to compare hit point values
     * @param m1
     * @param m2
     * @return
     */
    @Override
    public int compare(Monster m1, Monster m2) {
        return m1.getHitPoints() - m2.getHitPoints();
    }
}
