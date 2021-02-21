package edu.northeaststate.cs2.examples.inheritance.exceptions;

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
