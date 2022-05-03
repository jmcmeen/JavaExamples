/**
 * -------------------------------
 * File name: DateExample.java
 * Created By: Andrew Stover
 *             John McMeen
 * Email: astover5@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * --------------------------------
 */
package edu.northeaststate.cs2.examples.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Class name: Project3
 * Purpose: Demonstrates the Date class
 */
public class DateExample {
    /**
     * Method name: main
     * Method description: An entry point for the application
     *
     * @param args
     */
    public static void main(String[] args) {

        LocalDate Date = LocalDate.now();
        LocalTime Time = LocalTime.now();
        LocalDateTime dateAndTime = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime formattedDateTime1 = LocalDateTime.now();
        String formattedDate1 = formattedDateTime1.format(format);

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        LocalDateTime formattedDateTime2 = LocalDateTime.now();
        String formattedDate2 = formattedDateTime2.format(format2);

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        LocalDateTime formattedDateTime3 = LocalDateTime.now();
        String formattedDate3 = formattedDateTime3.format(format3);

        System.out.println("The date is: " + Date);
        System.out.println("The time is: " + Time);
        System.out.println();
        System.out.println("The current date and time is: " + dateAndTime);
        System.out.println();
        System.out.println();
        System.out.println("Date and time with formatting: ");
        System.out.println("\t" + formattedDate1);
        System.out.println("\t" + formattedDate2);
        System.out.println("\t" + formattedDate3);
    }
}
