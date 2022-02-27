/**
 * -------------------------------------------------
 * File name: CompareByName.java
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
 * Class Name: CompareByName
 * Purpose: Implements a Comparator interface to compare two monsters by name
 */
public class CompareByName implements Comparator<Monster> {
    /**
     * Method Name: compare
     * Method Description: Implements the Comparator interface method, compare. Uses String class compare function to
     * return a comparison by name
     * @param m1
     * @param m2
     * @return
     */
    @Override
    public int compare(Monster m1, Monster m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
