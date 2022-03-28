/**
 * ------------------------------------------
 * File name: Orc.java
 * Project Name: D&D Encounters
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * ------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.randommonsters.monsters;

import edu.northeaststate.cs2.dndstarter.util.SimpleDiceRoller;

/**
 * Class Name: Orc
 * Purpose: Orc extends Monster and describes a specialization of Monster.
 */
public class Orc extends Monster {
    private static int numOrcs = 0;
    private static final int ORC_MAX_HP = 22;

    /**
     * Method Name: Orc
     * Method Description: No argument constructor, creates a name using using string literal "Orc " and appends the numOrcs
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and ORC_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numOrcs to count
     * total number of Orcs created.
     */
    public Orc() {
        super("Orc " + numOrcs, SimpleDiceRoller.roll(ORC_MAX_HP));
        numOrcs += 1;
    }

    /**
     * Method Name: Orc
     * Method Description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and ORC_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numOrcs to count total number of Orcs created
     * @param name
     */
    public Orc(String name) {
        super(name, SimpleDiceRoller.roll(ORC_MAX_HP));
        numOrcs += 1;
    }

    /**
     * Method Name: Orc
     * Method Description: Parameterized constructor, takes a String name and int hitPoints. Calls parent constructor
     * using super(). Increments the static variable numOrcs to count total number of Orcs created
     * @param name
     * @param hitPoints
     */
    public Orc(String name, int hitPoints){
        super(name, hitPoints);
        numOrcs++;
    }

    /**
     * Method Name: toString
     * Method Description: Build a string that represents an Orc
     * @return String
     */
    @Override
    public String toString() {
        return "Orc [name=" +
                this.name +
                ", hitPoints=" +
                this.hitPoints +
                "]";
    }
}
