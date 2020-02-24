package edu.northeaststate.drivers;

import edu.northeaststate.dungeonsanddragons.Monster;

public class ReferenceExample02 {
    public static void main(String[] args){
        //Create a monster
        Monster FrostGiant = new Monster(100);

        System.out.println("The Frost Giant's hp is:" + FrostGiant.getHitPoints());

        //Create another monster reference based on Frost Giant
        Monster FireGiant = FrostGiant;

        //Both references point to the same memory location, making a change to one will affect both
        FrostGiant.hit(25);

        System.out.println("The Frost Giant's hp is:" + FrostGiant.getHitPoints());
        System.out.println("The Fire Giant's hp is:" + FireGiant.getHitPoints());

        FireGiant.hit(25);

        System.out.println("The Frost Giant's hp is:" + FrostGiant.getHitPoints());
        System.out.println("The Fire Giant's hp is:" + FireGiant.getHitPoints());
    }
}


