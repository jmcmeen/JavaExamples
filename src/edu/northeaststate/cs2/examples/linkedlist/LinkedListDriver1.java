/**
 * ------------------------------------------
 * File name: LinkedListDriver1.java
 * Project Name: CS2 Examples
 * Created By: Joshua Rimell
 *             John McMeen
 * Email: jrimell@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * ------------------------------------------
 */
package edu.northeaststate.cs2.examples.linkedlist;

import java.util.LinkedList;
/**
 * Class Name: LinkedListDriver
 * Purpose: Demonstrate the use of the LinkedList class using Kool-Aid colors/ flavors
 * Sources:
 *      https://www.w3schools.com/java/java_linkedlist.asp
 *      https://www.educative.io/blog/data-structures-linked-list-java-tutorial
 *      https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/
 */
public class LinkedListDriver1 {
    /**
     * Method Name: main
     * Method Description: Entry point for the application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // LinkedLists are basically the same as ArrayLists, but with a few different features.
        // These lists are somewhat more easily manipulated than ArrayLists
        // These features cause LinkedLists as a whole to take up more memory.

        // The syntax for initiation is the same...
        LinkedList<String> flavorsList = new LinkedList<>();
        KoolAidFlavors flavorObject = new KoolAidFlavors();

        // Next, let's create some variables. In this illustration of LinkedList, I will use Strings.
        // Any data type can be used, just like in ArrayList.
        String darkRed = "Black Cherry";
        String orange = "Orange";
        String pink = "Pink Lemonade";
        String green = "Lemon-Lime";
        String purple = "Grape";
        String lightBlue = "Tropical Punch";

        // We can add variables to the list with the .add() function
        flavorsList.add(darkRed);
        flavorsList.add(orange);

        // Print what we have so far:
        System.out.println("Print the first two items: \n" + flavorsList);

        // Items can be added at a specific index similar to arrays[], as well as at the "beginning"
        // and "end" of the LinkedList...

        flavorsList.addFirst(pink);
        flavorsList.addLast(green);
        System.out.println("\nNow Pink Lemonade is at the beginning and Lemon-Lime is at the end" +
                " of the list: \n" +
                flavorsList);

        // Let's put Black Cherry in the very middle of the list.
        // That would be index #2...

        flavorsList.add(2, purple);
        System.out.println("\nBlack Cherry is now in the middle.\n" + flavorsList);

        // Items can be removed by index or name...
        flavorsList.remove(orange);
        flavorsList.remove(0);

        System.out.println("\nRemoved Orange and the first flavor (Pink Lemonade): \n" + flavorsList);

        // LinkedList can also add objects just like ArrayList.
        flavorsList.addFirst(flavorObject.getRed());
        flavorsList.add(flavorObject.getDarkBlue());

        System.out.println("\nAdded items from the KoolAidFlavors object... \n" + flavorsList);

        // We can also insert and replace items. I want to remove Black Cherry and replace it with Tropical Punch:
        flavorsList.set(1, lightBlue);
        System.out.println("\nReplaced Black Cherry [index 1] with Tropical Punch...\n" +flavorsList);

        // Let's check what item is now in the beginning of the list:
        System.out.println("\nBeginning of the list: " + flavorsList.getFirst());

        // Since red is considered to be the best, let's rank the flavors:
        System.out.println();
        for (int i = 0; i < flavorsList.size(); i++) {
            System.out.println(i+1 + " " + flavorsList.get(i));
        }

        flavorsList.clear();
        System.out.println("\nTo finish, let's clear the entire list without removing the list's " +
                "reference from memory...\n" + flavorsList);
    }
}