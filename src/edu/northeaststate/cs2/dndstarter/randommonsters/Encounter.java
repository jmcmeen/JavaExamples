/**
 * -------------------------------------------------
 * File name: Encounter.java
 * Project Name: D&D Encounters
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.randommonsters;

import edu.northeaststate.cs2.dndstarter.randommonsters.monsters.Monster;
import java.util.ArrayList;

/**
 * Class Name: Encounter
 * Purpose: Encounter class is composed of a list of Monster objects and an Encounter's name
 */
public class Encounter {
    private ArrayList<Monster> monsters;
    private String name;

    /**
     * Method Name: Encounter
     * Method description: Partial parameterized constructor. Sets name attribute and allocates memory for ArrayList of
     * Monster objects
     * @param name
     */
    public Encounter(String name) {
        this.name = name;
        this.monsters = new ArrayList<>();
    }

    /**
     * Method Name: addMonster
     * Method description: Adds a monster reference (shallow) to the monsters ArrayList
     * @param monster
     */
    public void addMonster(Monster monster) {
        this.monsters.add(monster);
    }

    /**
     * Method Name: toString
     * Method description: Builds a string to represent Encounter
     * @return String
     */
    @Override
    public String toString() {
        String s = "Encounter[name= " +
                this.name +
                "]\n" +
                "monsters= \n";

        for (int i = 0; i < monsters.size(); i++) {

            s += monsters.get(i).toString() + "\n";
        }

        s += "]";

        return s;
    }

    /**
     * Method Name: sortMonstersByHitPoints
     * Method Description: Uses the ArrayList sort method by hit points by passing in the CompareByHitPoint Comparator
     */
    public void sortMonstersByHitPoints() {
        this.monsters.sort(new CompareByHitPoints());
    }

    /**
     * Method Name: sortMonstersByName
     * Method Description: Uses the ArrayList sort method by hit points by passing in the CompareByName Comparator
     */
    public void sortMonstersByName() {
        this.monsters.sort(new CompareByName());
    }
}
