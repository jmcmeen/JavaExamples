/**
 * -------------------------------------------------
 * File name: StackDriver.java
 * Project Name: CS2 Examples
 * Created By: Noah Horner
 * John McMeen
 * Email: nhorner1@stumail.northeaststate.edu
 * jnmcmeen@northeaststate.edu
 * <p>
 * Sources: https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
 * https://www.geeksforgeeks.org/stack-class-in-java/
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.stack;

import java.util.*;

/**
 * Class name: Stack Driver
 * Purpose: To showcase how java.stack uses it's LIFO stack of elements using simple ints and the functions used
 */
public class StackDriver {
    /**
     * Method Name: main
     * method description: Entry point of the function
     * @param args
     */
    public static void main(String[] args) {
        //Creates a New Stack
        Stack<Integer> stack = new Stack<>();

        //Uses push method to push new int to stack 5 times
        stackPush(stack);

        //Uses pop method to 'pop' each individual element in stack and print to screen
        stackPop(stack);

        //Uses push method again push new ints to stack 5 times
        stackPush(stack);

        //Uses peek method to return the object on top without removing it from the stack
        stackPeek(stack);

        //Uses search method to return the 1 based position of where the element is on the stack
        stackSearch(stack, 2);

        //Attempts to search for a position not on the stack and returns an error.
        stackSearch(stack, 6);

    }


    static void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stackPop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    static void stackPeek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    static void stackSearch(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
}

