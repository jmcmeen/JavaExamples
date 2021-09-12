/**
 * -------------------------------------------------
 * File Name: SimpleMenu.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.util.Scanner;

/**
 * Class Name: SimpleConsoleMenu
 * Purpose: Demonstrates a simple design for a console menu
 */
public class SimpleConsoleMenu {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
     */
    public static void main(String[] args) {
        //setup Scanner and variables needed
        Scanner userInput = new Scanner(System.in);
        String choice;

        //print the menu to the console
        printMenu();

        //prompt the user for a value from menu
        choice = userInput.nextLine();

        //while the user input is not equal to the exit condition, 3
        while(!choice.equals("3")){
            //execute option 1 or 2 depending on user input
            if(choice.equals("1")){
                option1();
            }else if(choice.equals("2")){
                option2();
            }

            // reprint the menu
            printMenu();

            //prompt the user for a value from menu
            choice = userInput.nextLine();
        }
    }

    /**
     * Method Name: printMenu
     * Method Description: prints the menu options in the console
     */
    public static void printMenu(){
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Exit");
    }

    /**
     * Method Name: option1
     * Method Description: executes menu option 1
     */
    public static void option1(){
        System.out.println("You picked option 1");
    }

    /**
     * Method Name: option2
     * Method Description: executes menu option 2
     */
    public static void option2(){
        System.out.println("You picked option 2");
    }
}
