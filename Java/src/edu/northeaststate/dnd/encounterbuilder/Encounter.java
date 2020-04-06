/**
 * -------------------------------------------------
 * File name: Encounter.java
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
 * Purpose: Encounter class is composed of a list of Monster objects and a name:
 * - Partial parameterized constructor (creates empty list of Monster objects)
 * - Getter methods: TODO create getters for private attributes
 * - Setter methods: TODO create setters for private attributes
 * - Public methods: addMonster, TODO create calculate functions
 * </b>
 * <hr>
 * Date created: Mar 24, 2020
 * <hr>
 * @author John McMeen
 */
public class Encounter{
    private ArrayList<Monster> monsters;
    private String encounterName;

    /**
     * Method description: Partial parameterized constructor. Sets name attribute and allocates memory for ArrayList of
     * Monster objects
     * Date: Mar 24, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Encounter(String name){
        this.encounterName = name;
        this.monsters = new ArrayList<>();
    }

    /**
     * Method description: Takes input for Monster attributes, creates a Monster object, and adds it to ArrayList
     * of Monster objects.
     * TODO When Monster class is updated with new attributes, this method must change to match Monster's overloaded constructor
     * Date: Mar 24, 2020
     * Parameters: String monsterName, int hitPoints
     * Return type: void
     */
    public void addMonster(String monsterName, int hitPoints){
        Monster m = new Monster(monsterName, hitPoints);
        this.monsters.add( m  );
    }
}
