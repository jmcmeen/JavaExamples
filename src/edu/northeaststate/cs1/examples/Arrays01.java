/**
 * -------------------------------------------------
 * File Name: Arrays01.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */

package edu.northeaststate.cs1.examples;

/**
 * Class Name: Arrays01
 * Purpose: Demonstrate working with arrays in Java
 * References:
 *      https://www.w3schools.com/java/java_arrays.asp
 */
public class Arrays01 {
    /**
     * Method Name: main
     * Method Description: Entry point for the application
     *
     * @param args
     */
    public static void main(String[] args) {
        // declares a reference identifier for an array of values
        int[] myArray;

        //create enough memory for 6 int memory locations
        myArray = new int[6];

        //If you uncomment this out and print the array, notice it prints a weird value. This value is a refernce to the
        //memory location for myArray, because myArray is a reference type, not a value type.
        //System.out.println(myArray);

        //set each value in array
        myArray[0] = 42;
        myArray[1] = -1;
        myArray[2] = 26;
        myArray[3] = 109;
        myArray[4] = 320000;
        myArray[5] = 0;

        //print each array value
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
        System.out.println(myArray[5]);

        //The code above is to show you how to manually work with array values. To automatically work through arrays,
        //we can se a loops to walk through each element in the array.
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}