/**
 * -------------------------------------------------
 * File name: ForLoop.java
 * Project name: CS1 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 12, 2021
 * Last Updated By: Kayleigh Post
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

public class ForLoop {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,};

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }
}
