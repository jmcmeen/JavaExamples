/**
 * -------------------------------
 * File name: Enumerator.java
 * Project Name: CS2 Examples
 * Created By: Genalyn Thomas
 *             John McMeen
 * Email: gnaguna@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.iterator;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Class Name: Enumerator
 * Purpose: This class will demonstrate Enumeration and its methods function
 * Enumeration is only applicable in legacy classes such as Vector, stack, and HashTable,
 * And can only traverse in forward direction. It can perform read/get operation
 */
public class Enumerator
{
    /**
     * Method Name: main
     * Method Description: Serves as Entry point for the application
     */
    public static void main(String[] args)
    {
        // Creating Vector
        Vector<String> flowers = new Vector<>();

        // Adding elements to Vector
        flowers.addElement("Rose");
        flowers.addElement("Jasmine");
        flowers.addElement("Sunflower");
        flowers.addElement("Magnolia");
        flowers.addElement("Camellia");

        // Get Enumeration
        Enumeration<String> enumeration = flowers.elements();

        // Print Vector elements using Enumeration
        System.out.println("Elements Printed Using Enumeration Iterator");

        // Print Vector elements
        while (enumeration.hasMoreElements())
        {
            System.out.println("\t" + enumeration.nextElement());
        }//end while loop
    }
}//end Enumerator
