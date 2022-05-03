/**
 -------------------------------
 File name: SimpleDateExample.java
 Project Name: CS2 Examples
 Created By: Terry McCulley
             John McMeen
 Email: tmcculle@stumail.northeaststate.edu
        jnmcmeen@northeaststate.edu
 --------------------------------
*/
package edu.northeaststate.cs2.examples.date;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class Name: SimpleDateExample
 * Purpose: An application that will print the current date in the console.
 */
public class SimpleDateExample {
    /**
     * Method Name: main
     * Method Description: Casts the current date to a string in American format and
     * prints it in the console.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //Setting up the current date in American date format.
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        //This should print the current date.
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
