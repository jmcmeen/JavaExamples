/**
 * -------------------------------
 * File name: ArrayDequeSample.java
 * Project Name: CS Examples
 * Created By: Genalyn Thomas
 *             John McMeen
 * Email: gnaguna@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Class Name: ArrayDequeSample
 * Purpose: This class demonstrate how Deque interface is implemented in ArrayDeque collection
 */
public class ArrayDequeSample
{
    public static void main (String[] args)
    {
        //Create Deque using ArrayDeque
        Deque<Integer> numbers = new ArrayDeque<>();

        //Adding elements to the deque and display all elements
        numbers.offerFirst(1);
        numbers.offerLast(2);
        numbers.addFirst(0);
        numbers.addLast(3);
        System.out.println("Deque elements : " + numbers);
        System.out.println();

        //Access first element of the deque using peekFirst method
        //Display the first element of the deque
        int firstElement = numbers.peekFirst();
        System.out.println("First element in the deque: " + firstElement);
        System.out.println();

        //Access last element of the deque using peekFirst method
        //Display the last element of the deque
        int lastElement = numbers.peekLast();
        System.out.println("Last element in the deque: " + lastElement);
        System.out.println();

        //Remove and return first element using removeFirst method
        //Display elements in the deque after removing the first element
        int removeFirstElement = numbers.removeFirst();
        System.out.println("Remove First Element: " + removeFirstElement);
        System.out.println("Deque elements after removing the First element: " + numbers);
        System.out.println();

        //Remove and return last element removeLast()
        //Display elements in the deque after removing the first element
        int removeLastElement = numbers.removeLast();
        System.out.println("Remove Last Element: " + removeLastElement);
        System.out.println("Deque elements after removing the last element: " + numbers);
        System.out.println();

        //Remove element and return element using pollFirst()
        int pollFirstElement = numbers.pollFirst();
        System.out.println("Poll First Element: " + pollFirstElement);
        System.out.println("Deque elements after polling the first element: " + numbers);
        System.out.println();

        //Remove element and return element using pollLast()
        int pollLastElement = numbers.pollLast();
        System.out.println("Poll Last Element: " + pollLastElement);
        System.out.println("Deque elements after polling the last element: " + numbers);
        System.out.println();

        //Insert element using push method
        System.out.println("Push element 10 in deque");
        numbers.push(10);
        System.out.println("Elements in deque: " + numbers);
        System.out.println();

        //Print element in the deque using size method
        System.out.println("Total number of elements in the deque: " + numbers.size());
    }//end main
}//end ArrayDequeSample
