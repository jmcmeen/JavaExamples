/**
 * -------------------------------------------------
 * File name: WeirdScience.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;

import java.math.BigDecimal;
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
        System.out.println("Weird Science!");
        String s = "hello world";
        String t = "Y";

        t.equals(s);

        Frankenstein frankie;

        frankie = new Frankenstein(37);

        Object obj = new Object();

        println("John");
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