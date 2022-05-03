/**
 * -------------------------------
 * File name: Item.java
 * Created By: Andrew Stover
 *             John McMeen
 * Email: astover5@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.hashset;

import java.util.Objects;

/**
 * Class name: Item
 * Purpose: Models an item with a name and value.
 */
public class Item {
    private String name;
    private double value;

    /**
     * Class name: Item
     * Purpose: A default constructor.
     */
    public Item() {
        this.name = "";
        this.value = 0;
    }

    /**
     * Class name: Item
     * Purpose: A parameterized constructor
     */
    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Class name: getName
     * Purpose: Gets the name of the item when called
     */
    public String getName() {

        return this.name;
    }

    /**
     * Class name: setName
     * Purpose: Sets the name of the item when called
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Class name: getValue
     * Purpose: Gets the value of the item.
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Class name: setValue
     * Purpose: Sets the value of the item.
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Class name: toString
     * Purpose: Displays the item name and value.
     */
    public String toString() {
        return "Item{name = " + this.name + ", value = " + this.value + " gold coins. }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;
        return Double.compare(item.value, value) == 0 && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
