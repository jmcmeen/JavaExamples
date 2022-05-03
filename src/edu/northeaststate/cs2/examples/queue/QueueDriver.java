/**
 * -------------------------------------------------
 * File name: QueueDriver.java
 * Project Name: CS2 Examples
 * -------------------------------------------------
 * Created By: Cora Yon
 *             John McMeen
 * Email: cyon@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

/**
 * Class Name: QueueDriver
 * Purpose: An application that provides an example for how - java.util.PriorityQueue works
 * Sources: https://www.freecodecamp.org/news/priority-queue-implementation-in-java/
 *             https://www.programiz.com/java-programming/priorityqueue, https://www.youtube.com/watch?v=c4ES6jGxqEw
 */
public class QueueDriver {
    /**
     * Method Name: main
     * Method Description: Entry point for the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        //Creates a priority queue of type Integer called someNumbers
        PriorityQueue<Integer> someNumbers = new PriorityQueue<>();

        //Add numbers to the queue
        someNumbers.add(1);
        someNumbers.add(2);
        someNumbers.add(3);
        someNumbers.add(4);

        //print the queue in its natural order
        System.out.println("Priority queue in its natural order: " + someNumbers);

        //.peek() retrieves, but does not remove, the head of the queue, or returns null if this queue is empty.
        someNumbers.peek();

        //.poll() Retrieves and removes the head of the queue, or returns null if this queue is empty.
        int thisNumber = someNumbers.poll();
        System.out.println("Removed item: " + thisNumber);
        System.out.println("New queue items: " + someNumbers);

        //.remove allows us to remove specific elements of the queue
        someNumbers.remove(3);
        System.out.println("Removed the number 3 - " + someNumbers);

        //prints the size of the list
        System.out.println("Size of the list: " + someNumbers.size());

        System.out.println("\n");

        //A queue of type integer that uses the predefined sort method and then reverses the order of the queue using the predefined reverse order method
        PriorityQueue<String> someLetters = new PriorityQueue<>(Collections.reverseOrder());

        //Adding numbers to the reverse order queue
        someLetters.add("A");
        someLetters.add("B");
        someLetters.add("C");
        someLetters.add("D");

        System.out.println("Printing the queue in reverse of the natural order: " + someLetters);

        //blank line  for spacing purposes
        System.out.println("\n");

        //You can use custom comparators to sort the queue however you like
        //Creates a priority queue of type AnyObject called exampleObjects which uses comparable and a custom defined comparableTo method in AnyObject to determine priority
        Queue<AnyObject> exampleObjects = new PriorityQueue<>();

        //Create each object
        AnyObject object1 = new AnyObject(1, "Rock");
        AnyObject object2 = new AnyObject(2, "Nickel");
        AnyObject object3 = new AnyObject(3, "Pinata");
        AnyObject object4 = new AnyObject(4, "Green bean");

        //Add each object to the queue
        exampleObjects.add(object1);
        exampleObjects.add(object2);
        exampleObjects.add(object3);
        exampleObjects.add(object4);

        //Prints the priority queue in descending order of the order ID
        while ((!exampleObjects.isEmpty())) {
            System.out.println(exampleObjects.poll());
        }
    }
}