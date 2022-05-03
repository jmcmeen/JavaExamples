/**
 * -------------------------------
 * File name: HashSetDriver.java
 * Created By: Andrew Stover
 *             John McMeen
 * Email: astover5@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.hashset;

import java.util.HashSet;

/**
 * Class name: HashSetDriver
 * Purpose: Demonstrates the HashSet class.
 */
public class HashSetDriver {
    /**
     * Method name: main
     * Method description: An entry point for the application
     *
     * @param args
     */
    public static void main(String[] args) {
        HashSet<String> games = new HashSet<String>();
        HashSet<Item> items = new HashSet<Item>();

        System.out.println("HashSet 1");

        games.add("Elden Ring");
        games.add("Elden Ring"); /* Duplicates of objects are removed, the original gets put to the end of the set. */
        games.add("Grand Theft Auto V re-re-re-mastered");
        games.add("TES: Oblivion");
        games.add("Mr. McMean's WhileTrue Survival");
        games.add("NANDGate Clicker");

        System.out.println(games);
        System.out.println("Size of HashSet 1 = " + games.size());
        System.out.println("Clearing HashSet 1.");
        games.clear();

        System.out.println();

        System.out.println("New HashSet 1");
        games.add("Shallow Rock System");
        games.add("Half-Life 2.99");
        games.add("Programmer Simulator: Last Minute Coding");
        System.out.println(games);
        System.out.println("Size of New HashSet 1 = " + games.size());
        System.out.println("Removing Shallow Rock System from New HashSet 1.");
        games.remove("Shallow Rock System");

        System.out.println();

        System.out.println("Adjusted HashSet");
        System.out.println(games);
        System.out.println("New size = " + games.size());

        System.out.println();

        System.out.println("Item HashSet.");
        Item item1 = new Item("Sword of NANDGate", 250);
        items.add(item1);
        System.out.println(items);
    }
}