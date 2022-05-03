/**
 * ------------------------------------------
 * File name: Book.java
 * Project Name: CS2 Examples
 * Created By: Matthew Breeding
 *             John McMeen
 * Email: mtsbreeding0818v.2@gmail.com
 *        jnmcmeen@northeaststate.edu
 * ------------------------------------------
 */

package edu.northeaststate.cs2.examples.regex;

public class Book {
    private String name;
    private CharSequence genre;

    /**
     * Name:Book
     * Purpose:Constructor
     * @param name
     * @param genre
     */
    public Book(String name,CharSequence genre) {
        this.name = name;
        this.genre = genre;
    }

    /**
     * Name:getname
     * Purpose:retrieves the name
     * @return
     */
    public String getname() {
        return name;
    }

    /**
     * Name:setName
     * Purpose:sets the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name:getGenre
     * Purpose: retrieves the genre
     * @return
     */
    public CharSequence getGenre(){
        return genre;
    }

    /**
     * Name:setGenre
     * Purpose:Sets the genre
     * @param genre
     */
    public void setGenre(CharSequence genre){
        this.genre = genre;
    }

    /**
     * Name toString
     * Purpose:To display the list as a string
     * @return
     */
    public String toString() {
        return "Book: " +
                "Name = " + name +" Genre = " + genre;
    }
}