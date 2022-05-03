/**
 * ------------------------------------------
 * File name: PatternDriver.java
 * Project Name: CS2 Examples
 * Created By: Matthew Breeding
 *             John McMeen
 * Email: mtsbreeding0818v.2@gmail.com
 *        jnmcmeen@northeaststate.edu
 * Sources used: w3schools.com
 * ------------------------------------------
 */

package edu.northeaststate.cs2.examples.regex;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDriver {
    /**
     * Name: main
     * Purpose: To drive and show implementation of the matcher function
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Code below was copied from: https://www.w3schools.com/java/java_regex.asp
         */
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
            System.out.println("This is w3's implementation of the code\n");
        } else {
            System.out.println("Match not found");
        }
        /**
         * End of copied code
         * Now demonstrating my implementation of this function
         */
        ArrayList<Book> Books = new ArrayList<>();
        Book book;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a book (Enter 0 to exit): ");
        String bookName = userInput.next();
        if (Objects.equals(bookName, "0")) {
            System.exit(0);
        } else {
            System.out.print("What is the book's genre: ");
            String bookGenre = userInput.next();
            book = new Book(bookName, bookGenre);
            Books.add(book);
            while (!Objects.equals(bookName, "0")) {
                System.out.print("Please enter a book (Enter 0 to exit): ");
                bookName = userInput.next();
                if (!Objects.equals(bookName, "0")){
                System.out.print("What is the book's genre: ");
                bookGenre = userInput.next();
                book = new Book(bookName, bookGenre);
                Books.add(book);}
            }System.out.println(Books.toString());
            Pattern patternBook = Pattern.compile("Non-Fiction+|Science+|History+|Biography+",
                    Pattern.CASE_INSENSITIVE);
            Matcher matcherBook = patternBook.matcher(book.getGenre());
            boolean matchFoundBook = matcherBook.find();
            if (matchFoundBook) {
                System.out.println("\nYou have non-fiction books in your collection");
                System.out.println("This is my implementation of this code");
            } else {
                System.out.println("\nYou have no non-fiction books in your collection");
            }
        }
    }
}


