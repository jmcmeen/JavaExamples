/**
 * -------------------------------------------------
 * File name: FarmlandDriver.java
 * Project Name: CS2 Examples
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.inheritance.farmland;

import java.util.ArrayList;

/**
 * Demonstrate inheritance using farm animals
 */
public class FarmlandDriver {
    /**
     * Entry point for the application
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Turkey turkey = new Turkey("Wilma the Turkey");
        Horse horse = new Horse("Generic Horse");
        Cow cow = new Cow("Lucy the Cow");
        Frog frog = new Frog("Bud Wiser");
        MrEd mrEd = new MrEd("Mr Ed.");

        animals.add(turkey);
        animals.add(horse);
        animals.add(cow);
        animals.add(frog);
        animals.add(mrEd);

        for(Animal a: animals){
            System.out.println(a.getName() + " says " + a.makeSound());
        }
    }
}
