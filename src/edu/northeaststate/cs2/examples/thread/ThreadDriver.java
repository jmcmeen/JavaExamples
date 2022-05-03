/**
 * -------------------------------------------------
 * File name: ThreadDriver.java
 * Created By: Tyler Orton
 * Email: torton2@stumail.northeaststate.edu
 * -------------------------------------------------
 *
 * Please do not run this code in the IDE, it will not display correctly.
 * Build the JAR Artifact and run from the terminal.
 * Thanks =)
 */
package edu.northeaststate.cs2.examples.thread;

import java.util.ArrayList;

/**
 * Class Name: ThreadDriver
 * Purpose: Application to demonstrate a method of using the Thread class. This particular example shows a simulated
 * drink dispensing machine and the drink levels as they decrease. This showcases 10 threads all executing Thread.Sleep()
 * with different delays to drive home the multithreaded idea.
 */
public class ThreadDriver
{
    /**
     * Method Name: main
     * Method Description: Entry point for the application
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<ThreadedTerminalDrainBar> terminalDrainBars = new ArrayList<ThreadedTerminalDrainBar>();
        boolean threadsNotFinished = true;

        terminalDrainBars.add(new ThreadedTerminalDrainBar("          Water", 100, 0.0053f, '='));
        terminalDrainBars.add(new ThreadedTerminalDrainBar("       Dr.Perky", 1000, 0.075f, '^'));
        terminalDrainBars.add(new ThreadedTerminalDrainBar("     Baja Blast", 100, 0.037f));
        terminalDrainBars.add(new ThreadedTerminalDrainBar("          Pepsi", 500, 0.053f, '.'));
        terminalDrainBars.add(new ThreadedTerminalDrainBar("         Sprite", 750, 0.065f, '*'));
        terminalDrainBars.add(new ThreadedTerminalDrainBar("    Orange Soda", 150, 0.0125f, '%'));
        terminalDrainBars.add(new ThreadedTerminalDrainBar("      Diet Cola", 500, 0.035f, 'X'));
        terminalDrainBars.add(new ThreadedTerminalDrainBar("        Voltage", 125, 0.025f, '\\'));
        terminalDrainBars.add(new ThreadedTerminalDrainBar("        Dr.Enuf", 333, 0.07f, '@'));
        terminalDrainBars.add(new ThreadedTerminalDrainBar("Cherry Kool-Aid", 250, 0.05f, '|'));

        // Start all threads
        for(int i = 0; i < terminalDrainBars.size(); i++)
        {
            terminalDrainBars.get(i).start();
        }

        System.out.print('\n');

        // Output the status of all threaded terminal drain bars
        while(threadsNotFinished)
        {
            threadsNotFinished = false;

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); // "clear" the screen
            System.out.println("------------------------------------------------------");
            System.out.println("|            Drink Dispenser Fill Levels             |");
            System.out.println("------------------------------------------------------");

            for(int i = 0; i < terminalDrainBars.size(); i++)
            {
                ThreadedTerminalDrainBar currentTerminalDrainBar = terminalDrainBars.get(i);

                if(currentTerminalDrainBar.isAlive())
                {
                    // If any of the remaining threads are still alive, the loop condition will be restored to true
                    threadsNotFinished = true;
                }

                System.out.println(currentTerminalDrainBar.toString());
            }

            // Thread.sleep() halts the application for the given time in milliseconds.
            // It requires a try catch block surrounding it to compile properly.
            try {
                Thread.sleep(100); // Halt execution of the program for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}