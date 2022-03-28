/**
 * -------------------------------------------------
 * File name: Item.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.commonmodels;

import java.util.Objects;

/**
 * Models a role playing game Item
 */
public class Item{
    private String name;
    private double value;

    /**
     * Default class constructor that uses default values
     */
    public Item() {
        this.name = "";
        this.value = 0;
    }

    /**
     * Parameterized class constructor specifying the items name and value
     */
    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Returns the name attribute for Item
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name attribute for Item
     * @param name the item's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the value attribute for Item
     * @return
     */
    public double getValue() {
        return this.value;
    }


    /**
     * Method description: Sets the value attribute for Item
     * @param value the item's worth in unspecified units
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Creates a string representation of the object
     * @return generated string
     */
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        //self check
        if (this == o) {
            return true;
        }
        //null check and type check
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        //The object's references are of the same type, cast Object o to Item
        Item item = (Item) o;

        return Double.compare(item.value, value) == 0 &&
                name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.value);
    }
}
