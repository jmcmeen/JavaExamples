/**
 * -------------------------------
 * File name: ListIterator.java
 * Project Name: CS2 Examples
 * Created By: Genalyn Thomas
 *             John McMeen
 * Email: gnaguna@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Class Name: ListIterator
 * Purpose: This class will demonstrate ListIterator and its methods function.
 * ListIterator can traverse in both forward and backward direction.
 * It can perform read, add, update, and remove operation
 * It is applicable to only list collection classes such as ArrayList, LinkedList, and Vector.
 */
public class ListIterators
{
    /**
     * Method Name: main
     * Method Description: Serves as Entry point for the application.
     */
    public static void main(String[] args)
    {
        // Creating ArrayList
        ArrayList<String> flowerList = new ArrayList<>();

        // Adding elements to ArrayList
        flowerList.add("Rose");
        flowerList.add("Jasmine");
        flowerList.add("Sunflower");
        flowerList.add("Magnolia");
        flowerList.add("Camellia");

        //Get ListIterator
        ListIterator<String> listIterator = flowerList.listIterator();

        //Printing ArrayList elements in forward direction using hasNext() in while loop
        System.out.println("ArrayList elements in Forward Direction:");
        while(listIterator.hasNext())
        {
            System.out.println("\t" + listIterator.next());
        }//end while loop

        System.out.println();

        //Printing ArrayList elements in backward direction using hasPrevious() in while loop
        System.out.println("ArrayList elements in Backward Direction:");
        while(listIterator.hasPrevious())
        {
            System.out.println("\t" + listIterator.previous());
        }//end while loop

        System.out.println();

        String flower;
        //While ListIterator hasNext() remove Element using remove method
        while(listIterator.hasNext())
        {
            flower = listIterator.next();

            if(flower.equals("Jasmine"))
            {
                System.out.println("Removing element Jasmine from the ArrayList.......");
                listIterator.remove();
                System.out.println("Element Jasmine has been removed");
            }
        }//end while loop

        System.out.println();
        //Printing Elements currently in the ArrayList
        System.out.println("Printing elements after using remove method");
        for(String flowers : flowerList)
        {
            System.out.println("\t" + flowers);
        }//end for loop

        System.out.println();
        //Add new Element to the ArrayList using the listIterator add method
        System.out.println("Adding new element to the ArrayList...");
        listIterator.add("Hydrangea");
        System.out.println("Element Hydrangea has been added");

        //Printing Elements currently in the ArrayList
        System.out.println("\nPrinting all Elements currently in the ArrayList after adding a new element");
        for(String flowers : flowerList)
        {
            System.out.println("\t" + flowers);
        }//end for loop
    }//end main
}//end ListIterator
