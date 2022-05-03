
/**
 * -------------------------------
 * File name: RunnableDriver2.java
 * Created By: Matthew Hamilton
 *             John McMeen
 * Email: mhamilt5@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.runnable;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Class Name: RunnableDriver2
 * Purpose: Demonstrates the use of classes that implement the Runnable interface.
 */
public class RunnableDriver2 {
    /**
     * Method Name: main
     * Method Description: entry point for program
     * @param args not used
     */
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(50000000,10000 );
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(60);

        /*
         * A class that implements Runnable has to have a run() function. This is what the thread executes whenever you call thread.start().
         * I am creating a Thread object called randomGenThread, and I am passing the Runnable object randomNumberGenerator to randomGenThread.
         */
        Thread randomGenThread = new Thread(randomNumberGenerator);
        //Here I am doing the same thing as above, but with the fibonacciGenerator and fibonacciThread instead.
        Thread fibonacciThread = new Thread(fibonacciGenerator);
        /*
        Sets both threads to Daemon threads. This basically tells the JVM that these are low priority threads. Daemon threads
        cannot prevent the JVM from exiting. Main is a non-daemon thread, so it has to finish executing before the JVM closes.
        If main finished executing before the threads, then the JVM will terminate.
         */
        randomGenThread.setDaemon(true);
        fibonacciThread.setDaemon(true);

        Scanner sc = new Scanner(System.in);

        System.out.print("Would you like to see some jokes while you wait? (yes or no): ");
        if (sc.nextLine().equalsIgnoreCase("no")) {
            System.out.println("You don't have a choice.");
        }

        /*
        I start both threads and the rest of the code below continues to execute while fibonacciThread generates fibonacci
         numbers and randomGenThread
         */
        fibonacciThread.start();
        randomGenThread.start();

        int counter = 1;
        do {
            switch (counter) {
                case 1:
                    System.out.println("\nWhat does a Jedi’s broken roof do?\n" + "Leak Skywater.");
                    break;
                case 2:
                    System.out.println("It's official. My career is in ruins. I just got a job as an archaeologist.");
                    break;
                case 3:
                    System.out.println("Sylvester Stallone and Arnold Schwarzenegger are hanging out and thinking back on their careers.\n" +
                            "Sly says, \"You did a few okay comedy films, but you were the Governor and should also be really proud of your political success.\"\n" +
                            "Arnold says, \"Yeah, but I've never been nominated for an Oscar, you have been three times. I wish I could be taken seriously as an actor.\"\n" +
                            "They think about it for a few minutes and Stallone says, \"We should do a serious film together. A historical.\"\n" +
                            "Arnold's eyes light up and he grins, immediately warming to the idea adding, \"A period piece. That's a great way for our acting comebacks to be taken seriously.\"\n" +
                            "Stallone continues, \"We want people to be emotionally affected by it. Music really moves people. Can we do something about music?\"\n" +
                            "Schwarzenegger agrees, \"We could do classical music. You're Italian, maybe you could play an Italian composer.\"\n" +
                            "Sylvester says, \"I'll play Vivaldi!\"\n" +
                            "\n" +
                            "Arnold Schwarzenegger says, \"I'll be Bach.\"\n");

                    System.out.print("Press enter to continue.");
                    //I did this to try to fix the program needing multiple enter presses. Sometimes it works correctly.
                    sc = new Scanner(System.in);
                    sc.nextLine();
                    break;
                default:
                    System.out.print("Waiting...");
            }
            System.out.println();

            //pauses the application for 3750 milliseconds (3.75 seconds), except during case 3 when the program waits for the user to hit enter.
            if (counter != 3 ) {
                try {
                    Thread.sleep(3750);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            counter++;

            //checks to see if randomGenThread and fibonacciThread are still active and doing stuff. This loop is like a loading screen.
        } while(randomGenThread.isAlive() || fibonacciThread.isAlive());

        System.out.println("\nFibonacci Sequence: ");
        fibonacciGenerator.printSequence();

        System.out.println("\nA lot of random integers: ");
        int[] numbers = randomNumberGenerator.getRandomNumberArray();
        for (int i: numbers) {
            System.out.print(i+", ");
        }
        System.out.println('\n');

        ArrayList<Integer> primes= randomNumberGenerator.getSortedByPrimeList();
        System.out.println("Total number of primes: " + primes.size());
        for (Integer p: primes) {
            System.out.print(p+", ");
        }
    }
}