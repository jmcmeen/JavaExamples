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
package edu.northeaststate.dnd.randomencounters.boilerplate.monsters;

/**
 * <b>
 * Purpose:
 * - Default constructor and parameterized constructor
 * - Getter methods: getName, getHitPoints
 * - Setter methods: setName, setHitPoints
 * - Public methods: toString, takeDamage
 * </b>
 * <hr>
 * Date created: Apr 5, 2020
 * <hr>
 * @author John McMeen
 */
public class Monster {
    //protected attributes accessible by sub classes
    protected String name;
    protected int hitPoints;

    /**
     * Method description: Parameterized constructor
     * Date: Apr 5, 2020
     * Parameters: String name, int hitPoints
     * Return type: None
     */
    public Monster(String name, int hitPoints){
        this.name = name;
        this.hitPoints = hitPoints;
    }

    /**
     * Method description: Returns the hitPoints attribute for Monster
     * Date: Apr 5, 2020
     * Parameters: None
     * Return type: int
     */
    public int getHitPoints(){
        return this.hitPoints;
    }

    /**
     * Method description: Sets the hitPoints attribute for Monster
     * Date: Apr 5, 2020
     * Parameters: int hitPoints
     * Return type: void
     */
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    /**
     * Method description: Returns the name attribute for Monster
     * Date: Apr 5, 2020
     * Parameters: None
     * Return type: int
     */
    public String getName(){
        return this.name;
    }

    /**
     * Method description: Sets the name attribute for Monster
     * Date: Apr 5, 2020
     * Parameters: String name
     * Return type: void
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Method description: Build a string that represents a Monster
     * Date: Apr 5, 2020
     * Parameters: None
     * Return type: String
     */
    @Override
    public String toString(){
        return "Monster [name=" +
                this.name +
                ", hitPoints=" +
                this.hitPoints +
                "]";
    }
}


