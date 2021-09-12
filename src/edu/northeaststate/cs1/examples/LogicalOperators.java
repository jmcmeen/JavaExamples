/**
 * -------------------------------------------------
 * File Name: LogicalOperators.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

/**
 * Class Name: LogicalOperators
 * Purpose: Demonstrates basic logical operators
 * References:
 *      https://www.w3schools.com/java/java_operators.asp
 */
public class LogicalOperators {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
     */
    public static void main(String[] args) {
        //Declare some variables to use in this program
        boolean true1 = true;
        boolean true2 = true;
        boolean false1 = false;
        int intValue = 1;

        //Logical operators are gernerally used in if statements and loops to evaluate some logical condition
        //If blocks only evaluate if the expression in true
        if(true1){
            System.out.println("The value of true1 is " + true1);
        }

        //Logical operators allow us to combine logical

        //Demonstrate logical AND - && - returns true if both statements are true
        if(true1 && true2){
            System.out.println("Both statements are true");
        }

        //the following if block will be skipped because one statement is false
        if(true1 && false1){
            System.out.println("I won't be printed because AND logic");
        }

        //the following if block will be skipped because one statement is false
        if(false1 && false1){
            System.out.println("I won't be printed because AND logic");
        }

        //Demonstrate logical OR - || - returns true if one statement is true
        if(true1 || true2){
            System.out.println("At lease one statement is true");
        }
        //This block is true
        if(true1 || false1){
            System.out.println("At lease one statement is true");
        }
        //This block will be skipped
        if(false1 || false1){
            System.out.println("I won't be printed because OR logic");
        }

        //Demonstrate logical NOT - ! - reverse boolean value
        if(!false1){
            System.out.println("Not false is true");
        }

        //This will be skipped because it is not true
        if(!true1){
            System.out.println("I won't be printed because not true is false");
        }

        //You more than likely will not be testing boolean values, but rather other expressions and statements
        if(intValue > 0 && intValue !=2){
            System.out.println(intValue + " is greater than 0 and is not equal to 2");
        }

        if(intValue > 0 && intValue !=1){
            System.out.println("I will be skipped because intValue is equal to 1 and both conditions in an AND must be true");
        }

        //Here are some examples with OR, only one of the conditions below is true
        if (intValue < 0 || intValue > 0 ){
            System.out.println(intValue + " is less than 0 or greater than 0");
        }

        //What would happen if intValue was equal to 0
        intValue = 0;
        if (intValue < 0 || intValue > 0 ){
            System.out.println("This will be skipped because both statements are false now");
        }
    }
}
