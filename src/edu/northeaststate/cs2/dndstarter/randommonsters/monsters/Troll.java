/**
 * ------------------------------------------
 * File name: Troll.java
 * Project Name: D&D Encounters
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * ------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.randommonsters.monsters;

import edu.northeaststate.cs2.dndstarter.util.SimpleDiceRoller;

/**
 * Class Name: Troll
 * Purpose: Troll extends Monster and describes a specialization of Monster.
 */
public class Troll extends Monster {
    private static int numTrolls = 0;
    private static final int TROLL_MAX_HP = 120;

    /**
     * Method Name: Troll
     * Method description: Default constructor, creates a name using using string literal "Troll " and appends the numTrolls
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and TROLL_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numTrolls to count
     * total number of Trolls created.
     */
    public Troll() {
        super("Troll " + numTrolls, SimpleDiceRoller.roll(TROLL_MAX_HP));
        numTrolls += 1;
    }

    /**
     * Method Name: Troll
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and TROLL_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numTrolls to count total number of Trolls created
     * @param name
     */
    public Troll(String name) {
        super(name, SimpleDiceRoller.roll(TROLL_MAX_HP));
        numTrolls += 1;
    }

    /**
     * Method Name: Troll
     * Method description: Parameterized constructor, takes a String name and int hitPoints. Calls parent constructor
     * using super(). Increments the static variable numTrolls to count total number of Trolls created
     * @param name
     * @param hitPoints
     */
    public Troll(String name, int hitPoints){
        super(name, hitPoints);
        numTrolls++;
    }

    /**
     * Method Name: toString
     * Method description: Build a string that represents a Troll
     * @return String
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
