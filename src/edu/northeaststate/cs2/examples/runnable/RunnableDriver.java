/**
 * File Name: RunnableDriver.java
 * Project Name: CS2 Examples
 * Created By: Alex Crawford
 *             John McMeen
 * Email: ccrawf18@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 */
package edu.northeaststate.cs2.examples.runnable;
/**
 * Class Name: RunnableDriver
 * Purpose: Demonstrates the Runnable example
 */
public class RunnableDriver {
    /**
     * Method Name: main
     * Method Description: Entry point to the application
     * @param args
     */
    public static void main(String[] args){
        RunnableExample runnableExample = new RunnableExample();
        Thread myThread = new Thread(runnableExample);
        Thread myOtherThread = new Thread(runnableExample);
        myThread.start();
        myOtherThread.start();
    }
}
