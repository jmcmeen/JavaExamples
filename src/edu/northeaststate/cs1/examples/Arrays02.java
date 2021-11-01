/**
 * -------------------------------------------------
 * File Name: Arrays02.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */

package edu.northeaststate.cs1.examples;

/**
 * Class Name: Arrays02
 * Purpose: Demonstrate working with arrays in Java
 */
public class Arrays02 {
    public static void main(String[] args) {
        //Declare and initialize an array with 10000000 memory locations
        int[] myArray = new int[10000000];

        //set all the values in the array with a random value
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getRandomInt(1,100);
        }

        System.out.println("Done setting values");

        //total up all the values in an array
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }

        //print the average of all values
        System.out.println(total / myArray.length);
    }

    /**
     * Method Name: getRandomInt
     * Method Description: Returns a pseudorandom integer >= lowerBound and <= upperBound
     * @param lowerBound
     * @param upperBound
     * @return
     */
    public static int getRandomInt(int lowerBound, int upperBound){
        int range = upperBound - lowerBound + 1;
        int temp = (int)(Math.random() * range) + lowerBound;
        return temp;
    }
}
