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
 */
public class Loops {
    /**
     * Method Name: main
     * Method Description: Entry point for the application
     * @param args
     */
    public static void main(String[] args) {
        //demonstrate counting with while loop

        //establish starting point
        int counter = 0;
        while( counter < 5 ){ //evaluate logic condition
            liftWeight();
            lowerWeight();
            //at some point make sure the condition changes
            counter++;
        }

        //demonstrate counting with for loop
        for(int i = 0; i < 5; i++){
            liftWeight();
            lowerWeight();
        }
    }

    /**
     * TBD
     */
    public static void liftWeight(){
        System.out.println("ARRRRRG");
    }

    /**
     * TBD
     */
    public static void lowerWeight(){
        System.out.println("Ahhhhhh");
    }
}
