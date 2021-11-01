/**
 * -------------------------------------------------
 * File Name: Loops.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */

package edu.northeaststate.cs1.examples;

/**
 * Class Name: Loops
 * Purpose: Demonstrates while and for loops
 * References
 *  https://www.w3schools.com/java/java_while_loop.asp
 *  https://www.w3schools.com/java/java_for_loop.asp
 *  https://www.w3schools.com/java/java_break.asp
 */
public class Loops {
    /**
     * Method Name: main
     * Method Description: Entry point for the application
     * @param args
     */
    public static void main(String[] args) {
        //demonstrate counting with while loop

        int counter = 0; //establish starting point
        while( counter < 5 ){ //evaluate logic condition
            liftWeight();
            lowerWeight();
            counter++;      //at some point make sure the condition changes
        }

        //demonstrate counting with for loop
        for(int i = 0; i < 5; i++){
            liftWeight();
            lowerWeight();
        }
    }

    /**
     * Method Name: liftWeight
     * Method Description: Simulates lifting a weight by printing a message
     */
    public static void liftWeight(){
        System.out.println("Lifting the weight!");
    }

    /**
     * Method Name: liftWeight
     * Method Description: Simulates lowering a weight by printing a message
     */
    public static void lowerWeight(){
        System.out.println("Lowering the weight!");
    }
}
