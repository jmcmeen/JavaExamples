/**
 * -------------------------------------------------
 * File name: Troll.java
 * Project name: Random Encounters
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * Creation date: Apr 5, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.dnd.randomencounters.boilerplate.monsters;

import edu.northeaststate.dnd.util.SimpleDiceRoller;

/**
 * <b>
 * Purpose: Troll extends Monster and describes a special case of Monster.
 *          See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 5, 2020
 * <hr>
 * @author John McMeen
 */
public class Troll extends Monster {
    private static int numTrolls = 1;
    private static final int TROLL_MAX_HP = 120;

    /**
     * Method description: Default constructor, creates a name using using string literal "Troll " and appends the numTrolls
     *                     static attribute. Also uses SimpleDiceRoller to generate a number between 1 and TROLL_MAX_HP.
     *                     Calls parent constructor using super(). Increments the static variable numTrolls to count
     *                     total number of Trolls created.
     * Date: Apr 5, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Troll(){
        super("Troll " + numTrolls, SimpleDiceRoller.roll(TROLL_MAX_HP));
        numTrolls+=1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     *                     a number between 1 and TROLL_MAX_HP. Calls parent constructor using super(). Increments
     *                     the static variable numTrolls to count total number of Trolls created
     * Date: Apr 5, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Troll(String name){
        super(name, SimpleDiceRoller.roll(TROLL_MAX_HP));
        numTrolls+=1;
    }

    /**
     * Method description: Build a string that represents a Troll
     * Date: Apr 5, 2020
     * Parameters: none
     * Return type: String
     */
    @Override
    public String toString() {
        return "Troll [name=" +
                this.name +
                ", hitPoints=" +
                this.hitPoints +
                "]";
    }
}
