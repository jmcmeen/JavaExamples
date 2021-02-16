package edu.northeaststate.cs2.examples;

public class ReferenceExample02 {
    public static void main(String[] args) {
        //Create a monster using overload constructor (see ConstructorExample)
        Monster frostGiant = new Monster("Frost Giant", 100);

        //View the Monster
        System.out.println("The Frost Giant's hp is: " + frostGiant.getHitPoints() + "\n");

        //Create another monster reference based on Frost Giant
        Monster fireGiant = frostGiant;

        System.out.println(fireGiant);

        //Both references point to the same memory location, making a change to one will affect both
        frostGiant.takeDamage(25);

        System.out.println("After damage, the Frost Giant's hp is: " + frostGiant.getHitPoints());
        System.out.println("After damage, the Fire Giant's hp is: " + fireGiant.getHitPoints() + "\n");

        //Hitting the fireGiant will also cause a change in frostGiant because they both point to the same place in
        //memory. You have to use the new keyword to get new objects in memory
        fireGiant.takeDamage(25);

        System.out.println("After damage, the Frost Giant's hp is: " + frostGiant.getHitPoints());
        System.out.println("After damage, the Fire Giant's hp is: " + fireGiant.getHitPoints() + "\n");

        //Point fireGiant to a new Monster object
        fireGiant = new Monster("Fire Giant", 100);

        //fireGiant and frostGiant are no longer the same reference
        System.out.println("The Frost Giant's hp is:" + frostGiant.getHitPoints());
        System.out.println("The Fire Giant's hp is:" + fireGiant.getHitPoints() + "\n");

        //Making changes to one will not affect the other
        fireGiant.takeDamage(1);

        System.out.println("The Frost Giant's hp is:" + frostGiant.getHitPoints());
        System.out.println("The Fire Giant's hp is:" + fireGiant.getHitPoints());
    }
}


