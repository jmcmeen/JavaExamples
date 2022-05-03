/**
 * ------------------------------------------
 * File name: KoolAidFlavors.java
 * Project Name: CS2 Examples
 * Created By: Joshua Rimell
 *             John McMeen
 * Email: jrimell@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * Course and section: 1020
 * ------------------------------------------
 */
package edu.northeaststate.cs2.examples.linkedlist;

/**
 * Class Name: KoolAidFlavors
 * Purpose: Demonstrate the use of the LinkedList class using Kool-Aid colors/ flavors
 * Sources:
 *      https://www.w3schools.com/java/java_linkedlist.asp
 *      https://www.educative.io/blog/data-structures-linked-list-java-tutorial
 *      https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/
 */
public class KoolAidFlavors {
    private final String red = "Cherry";
    private final String darkBlue = "Blue Raspberry";

    /**
     * Method Name: KoolAidFlavors
     * Method Description: Constructor
     */
    public KoolAidFlavors(){
    }

    /**
     * Method Name: getRed
     * Method Description: Getter for the Red Kool-Aid flavor
     * @return String
     */
    public String getRed() {
        return this.red;
    }

    /**
     * Method Name: getDarkBlue
     * Method Description: Getter for the DarkBlue Kool-Aid flavor
     * @return String
     */
    public String getDarkBlue() {
        return this.darkBlue;
    }
}
