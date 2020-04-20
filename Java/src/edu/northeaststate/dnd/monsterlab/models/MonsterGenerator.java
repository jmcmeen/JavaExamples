/**
 * -------------------------------------------------
 * File name: MonsterGenerator.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Apr 20, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.dnd.monsterlab.models;

import java.util.Random;

public class MonsterGenerator {
    public static Monster getRandomMonster() {
        //total type of extended Monsters supported by getRandomMonster
        final int NUM_MONSTER_TYPES = 2;

        //A monster reference to hold our extended Monster
        Monster m = null;

        //Using the Random class to pick a random number
        Random r = new Random();

        //Generate a number 0 to NUM_MONSTER_TYPES exclusive
        int monster_pick = r.nextInt(NUM_MONSTER_TYPES);

        //Switch on monster_pick and return a newly created reference to an extended Monster type
        switch (monster_pick) {
            //monster_pick = 0, then construct an Orc
            case 0:
                m = new Orc(); //upcasting
                break;
            //monster_pick = 1, then construct a Troll
            case 1:
                m = new Troll(); //upcasting
                break;
        }

        //Return the randomly decided monster reference
        return m;
    }
}
