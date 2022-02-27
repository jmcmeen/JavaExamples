/**
 * -------------------------------------------------
 * File name: RandomEncounterDriver.java
 * Project Name: Random Encounters
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.randommonsters;

import edu.northeaststate.cs2.dndstarter.util.ConsoleHelper;
import java.util.ArrayList;
import java.util.Random;

/**
 * Class Name: RandomEncounterDriver
 * Purpose: An application that will generate randomly filled Monster Encounters
 */
public class RandomEncounterDriver {
    /**
     * Method Name: main
     * Method Description: Entry point for the application. Uses MonsterGenerator.getRandomMonster to build a specified
     * number of Encounter objects and fill them with random monsters of various extended types. Orc and Troll are
     * provided.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //some constant variables to drive the random monster simulation
        final short NUM_ENCOUNTERS = 3;  //number of encounters to generate
        final short MIN_MONSTERS = 2;   //minimum number of monsters to generator per encounter
        final short MAX_MONSTERS = 10;  //maximum number of monsters to generator per encounter

        //Ask for some memory for an ArrayList to hold Encounters
        ArrayList<Encounter> encounters = new ArrayList<>();

        //Ask for some memory for a Random object that will help us generate random numbers
        Random r = new Random();

        //Loop for the number of Encounters specified
        for (int i = 0; i < NUM_ENCOUNTERS; i++) {
            //create a new encounter giving it a generic name
            Encounter encounter = new Encounter("Encounter " + (i + 1));

            //Create a random number between min and max inclusive, to see how many monsters to generate
            int num_monsters = r.nextInt(MAX_MONSTERS - MIN_MONSTERS + 1) + MIN_MONSTERS;

            //Loop for the number of monsters decided to generate
            for (int j = 0; j < num_monsters; j++) {
                //ask MonsterGenerator for a Monster in memory, add the Monster reference to encounter
                encounter.addMonster(MonsterGenerator.getRandomMonster());
            }

            //Add the Encounter to the main list and loop if another encounter
            encounters.add(encounter);
        }

        //Loop through each encounter created
        for (Encounter e : encounters) {
            e.sortMonstersByName();
            //Print the Encounter object
            System.out.println(e);
            ConsoleHelper.pressEnterToContinue();
        }
    }
}

