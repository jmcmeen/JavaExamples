/**
 * -------------------------------------------------
 * File name: Item.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.inheritance.exceptions.backpack;

public class Item {
    private String name;
    private double value;

    public Item() {
        this.name = "";
        this.value = 0;
    }

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
