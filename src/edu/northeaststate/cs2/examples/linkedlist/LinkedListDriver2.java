/**
 * -------------------------------
 * File name: URLDriver.java
 * Project Name: CS2 Examples
 * Creator's name: Jeremiah Dugger
 *                 John McMeen
 * Email: jdugge14@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Class Name: LinkedListDriver2
 * Purpose: creates linked list and array list, times functions of both list to show examples
 */
public class LinkedListDriver2 {
    /**
     * Method Name: Main
     * Method Description: entry to java program
     * @param args not used
     */
    public static void main(String[] args) {
        //LinkedList and ArrayList are simliar and have similar dot operator functions. How each completes various functions differs
        //LinkedList has to cycle through each node for get function taking more time than ArrayList as it can go straight to that point in memory
        //ArrayList has to lift and shift entire array to add, LinkedList can just insert into the list between node before and after, which theoretically is faster
        //Note: testing adding item to large array in this project most often results in arraylist taking longer but not always

        //Create both LinkedList and ArrayList
        LinkedList<Integer> linkedListNumbers = new LinkedList<>();
        ArrayList<Integer> arrayListNumbers = new ArrayList<>();

        //Set variables
        Random rand = new Random();
        int upperbound = 50;
        int findUpperbound = 50;
        int indexLocation = 25;
        int addToIndexLocation = 21;
        long startTime;
        long endTime;
        long elapsedTime;

        //Create rand numbers to store in both lists
        for (int i = 0; i < 50; i++) {
            linkedListNumbers.add(rand.nextInt(upperbound));
        }

        for (int i = 0; i < 50; i++) {
            arrayListNumbers.add(rand.nextInt(upperbound));
        }

        //Time get functions of both lists at specific index location
        System.out.println("Index Location: " + indexLocation);
        startTime = System.nanoTime();
        linkedListNumbers.get(indexLocation);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("Value Stored in Linked List at this index location: " + linkedListNumbers.get(indexLocation));
        System.out.println("It took " + elapsedTime/1000%60 +" seconds to get the value in the index location from the Linked List");
        System.out.println("");

        startTime = System.nanoTime();
        arrayListNumbers.get(indexLocation);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Value Stored in Array List at this index location: " + arrayListNumbers.get(indexLocation));
        System.out.println("It took " + elapsedTime/1000%60 +" seconds to get the value in the index location from the Array List");

        //Time add functions of both lists at specific index location

        System.out.println("");
        System.out.println("Adding an value of 1 to the index location of: " + addToIndexLocation);

        startTime = System.nanoTime();
        linkedListNumbers.add(indexLocation, 1);
        linkedListNumbers.removeLast();
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("It took " + elapsedTime/1000%60 + " seconds to add a value to a specific location in the Linked List");
        System.out.println("Printing index location value to confirm: " + linkedListNumbers.get(indexLocation));

        System.out.println("");

        System.out.println("Adding an value of 1 to the index location of: " + addToIndexLocation);
        startTime = System.nanoTime();
        arrayListNumbers.add(indexLocation, 1);
        arrayListNumbers.remove(20);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("It took " + elapsedTime/1000%60 + " seconds to add a value to a specific location in the Array List");
        System.out.println("Printing index location value to confirm: " + arrayListNumbers.get(indexLocation));

        //Example of removing item, another common shared operator
        System.out.println("");
        linkedListNumbers.remove(indexLocation);
        System.out.println(linkedListNumbers.size());
        System.out.println("");
        arrayListNumbers.remove(indexLocation);
        System.out.println(arrayListNumbers.size());
    }
}
