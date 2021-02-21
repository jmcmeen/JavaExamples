package edu.northeaststate.cs2.examples.inheritance.exceptions;

public class Main01 {
    public static void main(String[] args) throws ContainerFullException {
        Backpack backpack = new Backpack(2);

        backpack.addItem(new Item("Wand of Doom", 8));
        backpack.addItem(new Item("Hammer of Fate", 16));
        backpack.addItem(new Item("Pip's Dagger", 32));

        //This code won't execute if to many items are entered because the exception will be thrown up one level,
        // in this case that is outside of main so the program will exit
        System.out.println("Are you ready for the next adventure?");
    }
}
