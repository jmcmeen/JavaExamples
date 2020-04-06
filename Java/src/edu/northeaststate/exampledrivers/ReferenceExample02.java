package edu.northeaststate.exampledrivers;

import edu.northeaststate.dnd.encounterbuilder.Monster;

public class ReferenceExample02 {
    public static void main(String[] args){
        //Create a monster using overload constructor (see ConstructorExample)
        Monster FrostGiant = new Monster("Frost Giant", 100);

        //View the Monster
        System.out.println("The Frost Giant's hp is: " + FrostGiant.getHitPoints() + "\n");

        //Create another monster reference based on Frost Giant
        Monster FireGiant = FrostGiant;

        //Both references point to the same memory location, making a change to one will affect both
        FrostGiant.takeDamage(25);

        System.out.println("The Frost Giant's hp is: " + FrostGiant.getHitPoints());
        System.out.println("The Fire Giant's hp is: " + FireGiant.getHitPoints() + "\n");

        //Hitting the FireGiant will also cause a change in FrostGiant because they both point to the same place in
        //memory. You have to use the new keyword to get new objects in memory
        FireGiant.takeDamage(25);

        System.out.println("The Frost Giant's hp is: " + FrostGiant.getHitPoints());
        System.out.println("The Fire Giant's hp is: " + FireGiant.getHitPoints() + "\n");

        //Point FireGiant to a new Monster object
        FireGiant = new Monster("FireGiant", 100);

        //FireGiant and FrostGiant are no longer the same reference
        System.out.println("The Frost Giant's hp is:" + FrostGiant.getHitPoints());
        System.out.println("The Fire Giant's hp is:" + FireGiant.getHitPoints() + "\n");

        //Making changes to one will not affect the other
        FireGiant.takeDamage(1);

        System.out.println("The Frost Giant's hp is:" + FrostGiant.getHitPoints());
        System.out.println("The Fire Giant's hp is:" + FireGiant.getHitPoints());
    }
}


