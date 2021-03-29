/**
 * -------------------------------------------------
 * File name: ThreadRace.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;

/**
 * A class to demonstrate interfaces, threads and computation time needed for String Builder versus using String concatenation
 */
public class ThreadRace {
    public static void main(String[] args) {
        //Create the first thread and start it
        Thread thread = new Thread(new StringConcatThread());
        thread.start(); //start calls run...

        //Create the second thread and start it
        thread = new Thread(new StringBuilderThread());
        thread.start(); //start calls run...

        //Despite getting a head start, the StringBuilder object is more efficient at building Strings
    }
}

/**
 * Simple class that implements a run method for a thread interface
 */
class StringConcatThread implements Runnable {
    /**
     * Appends to a String using concatenation and prints the time elapsed
     */
    public void run() {
        System.out.println("Thread String Concat started...");
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i <1000000; i++) {
            s+= "Don't Panic";
        }
        long finish = System.nanoTime();
        System.out.println ("Thread String Concat finished in " + (finish - start) + " ns");
    }
}

/**
 * Simple class that implements a run methods for a thread interface
 */
class StringBuilderThread implements Runnable {
    /**
     * Appends to a String using a StringBuilder and prints the time elapsed
     */
    public void run() {
        System.out.println("Thread String Builder started...");
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <1000000; i++) {
            sb.append("Don't Panic");
        }
        long finish = System.nanoTime();
        System.out.println ("Thread String Builder finished in " + (finish - start) + " ns");
    }
}
