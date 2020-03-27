/**
 * -------------------------------------------------
 * File name: EncounterDriver.java
 * Project name: D&D Encounters
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * Creation date: Mar 24, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.dungeonsanddragons;

import java.util.ArrayList;

/**
 * <b>
 * Purpose:
 * - Contains for method main application
 * </b>
 * <hr>
 * Date created: Mar 24, 2020
 * <hr>
 * @author John McMeen
 */
public class EncounterDriver {
    /**
     * Method description: Main method for D&D Encounters Application
     * Date: Mar 24, 2020
     * Parameters: String[] args (unused)
     * Return type: void
     */
    public static void main(String[] args) {
        ArrayList<Encounter> encounters = new ArrayList<>();

        Encounter e = new Encounter("Farpoint");

        e.addMonster("Orc", 13);
        e.addMonster("Owl Bear", 23);

        encounters.add(e);

        e = new Encounter("Blurgle");

        e.addMonster("Troll", 7);
        e.addMonster("Dragon", 5);
        e.addMonster("Water Elemental", 14);
        e.addMonster("Giant Spider", 30);

        encounters.add(e);

        for(Encounter encounter: encounters){
            System.out.println(encounter.toString());
        }
    }
}


