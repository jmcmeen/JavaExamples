/**
 * -------------------------------------------------
 * File name: Monster.java
 * Project Name: D&D Encounters
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.randommonsters.monsters;

/**
 * Class Name: Monster
 * Purpose: Models a Monster object
 */
public class Monster {
    protected String name;
    protected int hitPoints;

    /**
     * Method Name: Monster
     * Method Description: Parameterized constructor
     * @param name
     * @param hitPoints
     */
    public Monster(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    /**
     * Method Name: getHitPoints
     * Method Description: Returns the hitPoints attribute for Monster
     * @return int
     */
    public int getHitPoints() {
        return this.hitPoints;
    }

    /**
     * Method Name: setHitPoints
     * Method Description: Sets the hitPoints attribute for Monster
     * @param hitPoints
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Method Name: getName
     * Method Description: Returns the name attribute for Monster
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method Name: setName
     * Method Description: Sets the name attribute for Monster
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method Name: toString
     * Method description: Build a string that represents a Monster
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


