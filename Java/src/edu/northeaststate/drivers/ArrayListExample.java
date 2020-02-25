package edu.northeaststate.drivers;

import edu.northeaststate.dungeonsanddragons.Monster;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Declare an ArrayList for type Monster
        ArrayList<Monster> monsters = new ArrayList<Monster>();

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
        monsters.add(new Monster("Ghost", 45));
        monsters.add(new Monster("Ghoul", 23));
        monsters.add(new Monster("Zombie", 12));

        //Display the number of Monsters in ArrayList
        System.out.println("Monster Count: " + monsters.size() + "\n");

        //Display all the Monsters using for loop
        for(int i = 0; i < monsters.size(); i++){
            System.out.println(monsters.get(i).toString());
        }

        //Display break in between output
        System.out.println("");

        //Display all the Monsters using for each loop (preferred)
        //Also add up all hit points
        int totalHp = 0;

        //The for each loop let's you construct a for loop  using an alias for each of the Monsters in the ArrayList
        //Here we use "mo" because m is already used above. You can name the alias whatever you would like
        for(Monster mo: monsters){
            System.out.println(mo.toString());
            totalHp += mo.getHitPoints();
        }

        //Display total HP
        System.out.println("Total HP = " + totalHp);
    }
}
