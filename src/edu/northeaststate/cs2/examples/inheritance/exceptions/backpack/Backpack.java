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

import edu.northeaststate.cs2.examples.commonmodels.Item;

import java.util.ArrayList;

/**
 * Class Name: Backpack
 * Purpose: Models a container for Items with a max limit on number of Items
 */
public class Backpack {
    private ArrayList<Item> items;
    private int maxNumItems;

    /**
     * Method Name: Backpack
     * Method Description: Parameterized constructor that accepts maxSize
     * @param maxNumItems
     */
    public Backpack(int maxNumItems) {
        this.items = new ArrayList<>();
        this.maxNumItems = maxNumItems;
    }

    /**
     * Method Name: addItem
     * Method Description: Adds an item to the Backpack, unless maxNumItems has already been met, in which case the
     * method will throw a ContainerFullException
     * @param item
     * @throws ContainerFullException
     */
    public void addItem(Item item) throws ContainerFullException {
        if(items.size()<this.maxNumItems){
            this.items.add(item);
        }else{
            throw new ContainerFullException();
        }
    }
}
