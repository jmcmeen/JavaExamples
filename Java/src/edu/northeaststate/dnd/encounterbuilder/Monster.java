/**
 * -------------------------------------------------
 * File name: Monster.java
 * Project name: D&D Encounters
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * Creation date: Mar 24, 2020
 * -------------------------------------------------
 */

package edu.northeaststate.dnd.encounterbuilder;

/**
 * <b>
 * Purpose:
 * - Default constructor and parameterized constructor
 * - Getter methods: getName, getHitPoints
 * - Setter methods: setName, setHitPoints
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Mar 24, 2020
 * <hr>
 *
 * @author John McMeen
 */
public class Monster {
    private String name;
    private int hitPoints;

    /**
     * Method description: Default constructor
     * Date: Mar 24, 2020
     * Parameters: NA
     * Return type: NA
     */
    public Monster() {
    }

    /**
     * Method description: Parameterized constructor
     * Date: Mar 24, 2020
     * Parameters: String name, int hitPoints
     * Return type: NA
     */
    public Monster(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    /**
     * Method description: Returns the hitPoints attribute for Monster
     * Date: Mar 24, 2020
     * Parameters: NA
     * Return type: int
     */
    public int getHitPoints() {
        return this.hitPoints;
    }

    /**
     * Method description: Sets the hitPoints attribute for Monster
     * Date: Mar 24, 2020
     * Parameters: int hitPoints
     * Return type: void
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Method description: Returns the name attribute for Monster
     * Date: Mar 24, 2020
     * Parameters: NA
     * Return type: int
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method description: Sets the name attribute for Monster
     * Date: Mar 24, 2020
     * Parameters: String name
     * Return type: void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method description: Subtracts damage from Monster hitPoints
     * Date: Mar 24, 2020
     * Parameters: String name
     * Return type: void
     */
    public void takeDamage(int damage) {
        this.hitPoints -= damage;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monster [name=");
        sb.append(this.name);
        sb.append(", hitPoints=");
        sb.append(this.hitPoints);
        sb.append("]");

        return sb.toString();
    }
}


