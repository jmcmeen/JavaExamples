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
package edu.northeaststate.dnd.encounterbuilder;

import java.util.ArrayList;

/**
 * <b>
 * Purpose: Contains main method for the EncounterDriver application
 * </b>
 * <hr>
 * Date created: Mar 24, 2020
 * <hr>
 * @author John McMeen
 */
public class EncounterDriver {
    /**
     * Method description: Creates some encounters and adds some Monsters using addMonster method in Encounter
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


