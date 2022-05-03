package edu.northeaststate.cs2.examples.runnable; /**
 * -------------------------------
 * File name: FibonacciGenerator.java
 * Created By: Matthew Hamilton
 * Email: mhamilt5@stumail.northeaststate.edu
 * --------------------------------
 */

/**
 * Class Name: FibonacciGenerator
 * Purpose: Implements runnable and generates the fibonacci sequence
 */
public final class FibonacciGenerator implements Runnable {
    private int numberOfTerms;
    private long[] fibonacciSequence;

    /**
     * Method Name: FibonacciGenerator
     * Method Description: Parameterized constructor that assigns numberOfTerms
     * @param numberOfTerms the number of terms you want to generate
     */
    public FibonacciGenerator(int numberOfTerms) {
        if (numberOfTerms < 3) {
            this.numberOfTerms = 3;
        } else {
            this.numberOfTerms = numberOfTerms;
        }
    }

    /**
     * Method Name: generateSequence
     * Method Description: generates the fibonacci sequence and puts them in the array fibonacciSequence
     */
     public void generateSequence() {
         long firstTerm = 0;
         long secondTerm = 1;
         long nextTerm;
         //assigns first two terms of the sequence to the fibonacciSequence array
         fibonacciSequence = new long[numberOfTerms];
         fibonacciSequence[0] = firstTerm;
         fibonacciSequence[1] = secondTerm;

         for (int i = 2; i < numberOfTerms; i++) {
             nextTerm = firstTerm + secondTerm;
             fibonacciSequence[i] = nextTerm;
             firstTerm = secondTerm;
             secondTerm = nextTerm;
         }
     }

    /**
     * Method Name: printSequence
     * Method Description: prints the numbers in fibonacciSequence and
     */
    public void printSequence() {
        int counter = 0;
        if (numberOfTerms < 30) {
            for (long l : fibonacciSequence) {
                System.out.print(l + ", ");
            }
        } else {
            for (long l : fibonacciSequence) {
                System.out.print(l +", ");
                counter++;
                if (counter % 10 == 0) {
                    System.out.println();
                }
            }
        }
     }

    /**
     * Method Name: run
     * Method Description: the method that gets called when used with Thread
     */
    public void run() {
        generateSequence();
    }
}
