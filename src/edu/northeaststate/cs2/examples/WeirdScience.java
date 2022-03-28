/**
 * -------------------------------------------------
 * File name: WeirdScience.java
 * Project Name: CS2 Examples
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;

import edu.northeaststate.cs2.examples.commonmodels.Item;

import java.util.Objects;

/**
 * Just a Hello World application, with some nice comments, no real purpose here
 */
public class WeirdScience{
    /**
     * An entry point for the application
     * @param args
     */
    public static void main(String[] args) {
        for(int i = 0 ; i < 1000000000; i++){
            System.out.println(i);
        }



//        System.out.println("Weird Science!");
//
//        Item a = new Item("Wand of Doom", 500);
//        Item b = a;
//        Item e= null;
//        String f = "somestring";
//        Item d = new Item("Staff of Impurity", 600);
//        Item c = new Item("Wand of Doom", 500);
//
////        if(a.equals(c)){
////            System.out.println("These are equal");
////        }else{
////            System.out.println("These are not equal");
////        }
//
//        int hash1 = Objects.hash(2,4,25);
//        int hash2 = Objects.hash(2);
//
//        System.out.println(hash1);
//        System.out.println(hash2);
//
//
//        System.out.println(a + "   " + a.hashCode());
//        System.out.println(d + "   " + d.hashCode());
//        System.out.println(c + "   " + c.hashCode());
//
//

//
//        Frankenstein frankie;
//
//        frankie = new Frankenstein(37);
//
//        Object obj = new Object();

    }

    public static void pageFeed(){
        String n = "\n";
        System.out.println(n.repeat(30));
    }

    public static void println(String message){
        System.out.println(message);
    }
}



/**
 * An internal Frankenstein class, with nice comments as well
 */
class Frankenstein{
    private int age;
    private int height;

    public Frankenstein(int age) {
        this.age = age;

    }

    /**
     * Makes Frankie alive!
     * @param volts positive input of volts
     * @param time positive input of time to apply voltage
     * @return true if alive, false if experiment failed
     */
    public boolean itsAlive(int volts, double time){
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frankenstein that = (Frankenstein) o;
        return this.age == that.age &&
                this.height == that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height);
    }
}