/**
 * -------------------------------------------
 * File name: StringTokenizerExample.java
 * Created By: Tyler Burleson
 *             John McMeen
 * Email: tburles6@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * -------------------------------------------
 */

package edu.northeaststate.cs2.examples.stringtokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * Class Name: StringTokenizerExample
 * Purpose: Demonstrates the StringTokenizer Class
 */
public class StringTokenizerExample {
    /**
     * Method Name: main
     * Method Description: main entry point for the code
     * @param args
     */
    public static void main(String[] args) {
        StringTokenizer tokenizer;
        Scanner myScanner =  new Scanner(System.in);
        String userInput = "";
        String userDelimiter = "";
        String crazyString = "This!Is!A!Crazy!String";

        System.out.print("Type a sentence only using spaces: ");
        userInput = myScanner.nextLine();
        // creates a StringTokenizer with a specified string and delimiter
        tokenizer = new StringTokenizer(userInput, " ");

        // counts the amount of tokens the user has inputted
        System.out.println("\nNumber of tokens: " + tokenizer.countTokens());

        // if there are still tokens available keep running
        while(tokenizer.hasMoreTokens()){
            // prints the next token in the list that has been seperated by a " "
            System.out.println(tokenizer.nextToken());
        }
        System.out.print("\nType a sentence using any type of delimiter: ");
        userInput = myScanner.nextLine();

        System.out.print("Enter the delimiter you used: ");
        userDelimiter = myScanner.nextLine();

        // creates a tokenizer of a defined string
        tokenizer = new StringTokenizer(userInput);

        // prints the next token using the delimiter
        System.out.println("The first token: " + tokenizer.nextToken(userDelimiter));

        // functions the same way as hasMoreTokens
        while(tokenizer.hasMoreElements()){
            // functions the same as nextToken, but returns an object type
            System.out.println(tokenizer.nextElement());
        }

        System.out.println("\nPredetermined string: " + crazyString);

        // using the boolean return value you can define if the delimiters should be considered as tokens as well
        tokenizer = new StringTokenizer(crazyString, "!", false);
        System.out.println("tokenizer without delimiters as tokens");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(crazyString, "!", true);
        System.out.println("\ntokenizer with delimiters as tokens");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}
