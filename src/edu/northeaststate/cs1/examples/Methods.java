/**
 * -------------------------------------------------
 * File Name: Methods.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;


/**
 * Class Name: Methods
 * Purpose: Demonstrates basic arithmetic operators using integer variables
 * References:
 *      https://www.w3schools.com/java/java_methods.asp
 */
public class Methods{
    /**
     * Method Name: main
     * Method Description: The entry point for the application
     * @param args not used in this program
     */
    public static void main(String[] args) {
        printWelcomeMessage();
        printWelcomeMessage("Ben", "CISP 1010", "CS Examples");
        printWelcomeMessage("Ben - CISP 1010 - CS Examples");

        int intVar = getRandomInt(10);

        System.out.println(intVar);

        intVar = getRandomInt(1,12);

        System.out.println(intVar);
    }

    /**
     * Method Name: printWelcomeMessage
     * Method Description: Prints a welcome message for John McMeen
     */
    public static void printWelcomeMessage(){
        System.out.println("*********************************************");
        System.out.println("* John McMeen * CISP 1010 S# * CS1 Examples *");
        System.out.println("*********************************************");
    }

    /**
     * Method Name: printWelcomeMessage
     * Method Description: Prints a welcome message given some parameters
     * @param programmerName
     * @param courseName
     * @param projectName
     */
    public static void printWelcomeMessage(String programmerName, String courseName, String projectName){
        System.out.println("*********************************************");
        System.out.println("* " + programmerName + " * " + courseName + " * " + projectName + " *");
        System.out.println("*********************************************");
    }

    /**
     * Method Name: printWelcomeMessage
     * Method Description: Prints a welcome message given a message
     * @param message
     */
    public static void printWelcomeMessage(String message){
        System.out.println("*********************************************");
        System.out.println("* " + message + " *");
        System.out.println("*********************************************");
    }

    public static int addTwoIntegers(int a, int b){
        int c = a + b;
        return c;
    }

    /**
     * Method Name: getRandomInt
     * Method Description: Returns a pseudorandom integer >=0 and < upperBound
     * @param upperBound
     * @return
     */
    public static int getRandomInt(int upperBound){
        int temp = (int)(Math.random() * upperBound);
        return temp;
    }

    /**
     * Method Name: getRandomInt
     * Method Description: Returns a pseudorandom integer >= lowerBound and <= upperBound
     * @param lowerBound
     * @param upperBound
     * @return
     */
    public static int getRandomInt(int lowerBound, int upperBound){
        int range = upperBound - lowerBound + 1;
        int temp = (int)(Math.random() * range) + lowerBound;
        return temp;
    }
}