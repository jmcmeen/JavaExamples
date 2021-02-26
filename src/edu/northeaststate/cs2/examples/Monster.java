/**
 * -------------------------------------------------
 * File name: Monster.java
 * Project name: D&D Encounters
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * Creation date: Apr 5, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;

/**
 * Models a role playing game monster
 */
public class Monster{
    private String name;
    private int hitPoints;

    /**
     * Default class constructor using default values
     */
    public Monster() {
        this.name = "";
        this.hitPoints = 0;
    }

    /**
     * Parameterized class constructor specifying monster's name and hit points
     */
    public Monster(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    /**
     * Method description: Returns the hitPoints attribute for Monster
     * Date: Apr 5, 2020
     * Parameters: None
     * @return int
     */
    public int getHitPoints() {
        return this.hitPoints;
    }

    /**
     * Method description: Sets the hitPoints attribute for Monster
     * Date: Apr 5, 2020
     * Parameters: int hitPoint
     * @return void
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Method description: Returns the name attribute for Monster
     * Date: Apr 5, 2020
     * Parameters: None
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method description: Sets the name attribute for Monster
     * Date: Apr 5, 2020
     * Parameters: String name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method description: Subtracts an amount of damage from Monster's hit points
     * Date: Apr 5, 2020
     * Parameters: int damage
     * @return void
     */
    public void takeDamage(int damage) {
        this.hitPoints -= damage;
    }

    /**
     * Method description: Build a string that represents a Monster
     * Date: Apr 5, 2020
     * Parameters: None
     * @return String
     */
    @Override
    public String toString() {
        return "Monster [name=" +
                this.name +
                ", hitPoints=" +
                this.hitPoints +
                "]";
    }
}


