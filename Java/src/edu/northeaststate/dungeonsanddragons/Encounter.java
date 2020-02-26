package edu.northeaststate.dungeonsanddragons;

import java.util.ArrayList;

public class Encounter {
    private ArrayList<Monster> monsters;
    public String encounterName;

    //Overloaded constructor
    public Encounter(String name){
        this.monsters = new ArrayList<Monster>();
        this.encounterName = name;
    }

    //addMonster function takes input for Monster, creates a Monster object, and adds it to monsters attribute
    public void addMonster(String monsterName, int hitPoints){
        this.monsters.add(  new Monster(monsterName, hitPoints) );
    }
}
