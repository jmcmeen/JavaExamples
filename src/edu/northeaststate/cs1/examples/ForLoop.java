/**
 * -------------------------------------------------
 * File Name: ForLoop.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * Last Updated By: Kayleigh Post
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;
/**
 * Class Name: ForLoop
 * Purpose: Demonstrates how to use a for loop to print each element in an array
 */
public class ForLoop {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
     */
    public static void main(String[] args) {
        //creat an array of integer values
        int[] myIntegers = {0,32,65,127,23225232,-1};

        //use a for loop to visit each element in the array
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.print(myIntegers[i] + " ");
        }
    }
}
