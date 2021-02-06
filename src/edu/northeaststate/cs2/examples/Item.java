/**
 * -------------------------------------------------
 * File name: Item.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 6, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;
/**
 * <b>Purpose: Models an in game Item
 * - Public methods: main
 * </b>
 * <hr>
 * Date created: Feb 6, 2021
 * <hr>
 * @author John McMeen
 */
public class Item {
    private String name;
    private double value;

    /**
     * Method description: Parameterized constructor
     * Date: Apr 5, 2020
     * Parameters: String name, double value
     * @return None
     */
    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Method description: returns a string representation of the object
     * Date: Feb 2, 2021
     * @return void
     */
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
