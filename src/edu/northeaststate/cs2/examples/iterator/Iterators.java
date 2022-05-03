/**
 * -------------------------------
 * File name: Iterator.java
 * Project Name: CS2 Examples
 * Created By: Genalyn Thomas
 *             John McMeen
 * Email: gnaguna@stumail.northeaststate.edu
 *        jnmcmeen@northeastststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class Name: Iterators
 * Purpose: This class will demonstrate iterator and its methods function.
 * Iterator can only traverse in forward direction. It can perform read and remove operation
 * It is applicable to all collection classes.
 */
public class Iterators
{
    /**
     * Method Name: main
     * Method Description: Serves as Entry point for the application.
     */
    public static void main(String[] args)
    {
        // Creating ArrayList
        ArrayList<String> flowers = new ArrayList<>();

        // Adding elements to ArrayList
        flowers.add("Rose");
        flowers.add("Jasmine");
        flowers.add("Sunflower");
        flowers.add("Magnolia");
        flowers.add("Camellia");

        // Printing  ArrayList elements
        System.out.println("Elements in the ArrayList");
        for(String flowerList : flowers)
        {
            System.out.println("\t" + flowerList);
        }//end for loop

        System.out.println();

        // Get Iterator
        Iterator<String> iterator = flowers.iterator();

        //Initialize variable
        String flower;

        // Print ArrayList elements in forward direction using hasNext() in while loop
        while (iterator.hasNext())
        {
            flower = iterator.next();

            //Iterator remove method Removes element from the ArrayList
            if(flower.equals("Jasmine"))
            {
                System.out.println("Removing element Jasmine from the ArrayList.......");
                iterator.remove();
                System.out.println("Element Jasmine has been removed");
            }//end if statement
        }//end while loop

        //Printing Elements currently in the ArrayList
        System.out.println("\nElements currently in the ArrayList");
        for(String flowerList : flowers)
        {
            System.out.println("\t" + flowerList);
        }//end for loop
    }//end main
}//end Iterator
