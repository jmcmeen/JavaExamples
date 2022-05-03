/**
 * ---------------------------------------------------------
 * File Name: Item.java
 * Project Name: Item
 * ---------------------------------------------------------
 * Name: Michael Miller
 * Email: mmille54@stumail.northeaststate.edu
 * ---------------------------------------------------------
 **/
package edu.northeaststate.cs2.examples.hashmap;

/**
 * Class name: Item
 * Purpose: Models an item
 */
public class Item {
    private String name;
    private double value;

    /**
     * Method name :Item
     * Purpose: default constructor
     */
    public Item() {
        this.name = "";
        this.value = 0.0;
    }

    /**
     * Method name: Item
     * description: parameterized constructor
     * @param name - the name of the item
     * @param value - the value of the item
     */
    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Method name: getName
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Method name: setName
     * @param name - the new name of the item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method name: getValue
     * @return the value of the item
     */
    public double getValue() {
        return value;
    }

    /**
     * Method name: setValue
     * @param value - the new value of the item
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Method name: toString
     * @return the item's name and value as a string
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("Item{");
        sb.append("name= '").append(name).append('\'');
        sb.append(", value= ").append(value);
        sb.append('}');
        return sb.toString();
    }
}
