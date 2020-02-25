package edu.northeaststate.drivers;

import edu.northeaststate.dungeonsanddragons.SimpleDiceRoller;

public class StaticMethodExample {
    public static void main(String[] args) {
        //Classes with static methods do no require you to create an object first

        //The SimpleDiceRoller class has a static method named roll
        //Just use the name of the class and the method you want to call
        //Roll a D20 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("D20 = " + SimpleDiceRoller.roll(20));
        }

        System.out.println();

        //You can create an object of that class, but it is not necessary
        SimpleDiceRoller d = new SimpleDiceRoller();
        for (int i = 0; i < 5; i++) {
            System.out.println("D20 = " + d.roll(20));
        }
    }
}
