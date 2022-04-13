package edu.northeaststate.cs2.examples.interfaces.comparable;

public class DiceDriver {
    public static void main(String[] args) {
        Dice a = new Dice();
        Dice b = new Dice();

        System.out.println("a = " + a.roll());
        System.out.println("b = " + b.roll());

        if(a.compareTo(b) == 0){
            System.out.println("They are equal");
        }else if (a.compareTo(b) > 0){
            System.out.println("a is greater than b");
        }else if(a.compareTo(b) < 0){
            System.out.println("b is greater than a");
        }
    }

}
