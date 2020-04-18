/**
 * -------------------------------------------------
 * File name: Orc.java
 * Project name: Random Encounters
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * Creation date: Apr 5, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.dnd.randomencounters.monsters;

import edu.northeaststate.dnd.util.SimpleDiceRoller;

/**
 * <b>
 * Purpose: Orc extends Monster and describes a special case of Monster.
 * See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 5, 2020
 * <hr>
 *
 * @author John McMeen
 */
public class Orc extends Monster {
    private static int numOrcs = 1;
    private static final int ORC_MAX_HP = 22;

    /**
     * Method description: No argument constructor, creates a name using using string literal "Orc " and appends the numOrcs
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and ORC_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numOrcs to count
     * total number of Orcs created.
     * Date: Apr 5, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Orc() {
        super("Orc " + numOrcs, SimpleDiceRoller.roll(ORC_MAX_HP));
        numOrcs += 1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and ORC_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numOrcs to count total number of Orcs created
     * Date: Apr 5, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Orc(String name) {
        super(name, SimpleDiceRoller.roll(ORC_MAX_HP));
        numOrcs += 1;
    }

    public Orc(String name, int hitPoints){
        super(name, hitPoints);
        numOrcs++;
    }

    /**
     * Method description: Build a string that represents an Orc
     * Date: Apr 5, 2020
     * Parameters: none
     * Return type: String
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
