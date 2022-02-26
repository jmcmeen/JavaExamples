/**
 * -------------------------------------------------
 * File name: ArrayListExample01.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.arraylists;

import edu.northeaststate.cs2.examples.models.Monster;

import java.util.ArrayList;

/**
 * <b>Purpose: Demonstrates ArrayList functionality with Monster objects
 * - Public methods: main
 * </b>
 * <hr>
 * Date created: Feb 2, 2021
 * <hr>
 * @author John McMeen
 */
public class ArrayListExample02 {
    /**
     * Entry point for application
     * @param args
     */
    public static void main(String[] args) {
        //Declare an ArrayList for type Monster
        ArrayList<Monster> monsters = new ArrayList<>();

        //Monster reference
        Monster m;

        //Point monster reference to new Monster
        m = new Monster("Fire Orc", 24);

        //Add monster to ArrayList
        monsters.add(m);

        //Point m to a new monster, the ArrayList still "remembers" where the first Monster is
        m = new Monster("Giant Spider", 21);

        //Add monster to ArrayList
        monsters.add(m);

        //We don't even really need the reference m if we are only passing it off to ArrayList and we have an overloaded
        // constructor, because the ArrayList is just storing a reference to an object
        monsters.add( new Monster("Ghost", 45) );
        monsters.add( new Monster("Ghoul", 23) );
        monsters.add( new Monster("Zombie", 12) );

        //Display the number of Monsters in ArrayList
        System.out.println("Monster Count: " + monsters.size() + "\n");

        //Display all the Monsters using for loop
        for (int i = 0; i < monsters.size(); i++) {
            System.out.println(monsters.get(i));
        }

        //Display break in between output
        System.out.println();

        //Display all the Monsters using for each loop (preferred)
        //Also add up all hit points
        int totalHp = 0;

        //The for each loop let's you construct a for loop  using an alias for each of the Monsters in the ArrayList
        //Here we use "mo" because m is already used above. You can name the alias whatever you would like
        for (Monster currentMonster : monsters) {
            System.out.println(currentMonster.toString());
            totalHp += currentMonster.getHitPoints();
        }

        //Display total HP
        System.out.println("Total HP = " + totalHp);
    }
}
