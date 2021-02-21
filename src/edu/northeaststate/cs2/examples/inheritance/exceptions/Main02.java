package edu.northeaststate.cs2.examples.inheritance.exceptions;

public class Main02 {
    public static void main(String[] args) {
        Backpack backpack = new Backpack(2);

        try {
            backpack.addItem(new Item("Wand of Doom", 8));
            backpack.addItem(new Item("Hammer of Fate", 16));
            backpack.addItem(new Item("Pip's Dagger", 32));
        } catch (ContainerFullException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Are you ready for the next adventure?");
    }
}
