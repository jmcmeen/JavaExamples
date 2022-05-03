/**
 * File Name: RunnableExample.java
 * Project Name: CS2 Examples
 * Created By: Alex Crawford
 *             John McMeen
 * Email: ccrawf18@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 */
package edu.northeaststate.cs2.examples.runnable;
/**
 * Class Name: Runnable Example
 * Purpose: Example of the Runnable interface
 */
public class RunnableExample implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}