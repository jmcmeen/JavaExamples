/**
 * -------------------------------------------------
 * File Name: Backpack.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.inheritance.exceptions.backpack;

import java.util.ArrayList;

public class Backpack {
    private ArrayList<Item> items;
    private int maxSize;

    public Backpack(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void addItem(Item item) throws ContainerFullException {
        if(items.size()<this.maxSize){
            this.items.add(item);
        }else{
            throw new ContainerFullException();
        }
    }
}
