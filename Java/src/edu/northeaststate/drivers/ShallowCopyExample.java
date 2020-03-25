package edu.northeaststate.drivers;

import edu.northeaststate.alexandria.*;

import java.util.ArrayList;

public class ShallowCopyExample {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Library alexandria = new Library("Alexandria");

        //Add some books to ArrayList
        books.add(new Book("Hitchhikers Anonymous", "978-0833030474", "Arthur Dent"));
        books.add(new Book("Chess for Lords and Ladies", "978-0870334337", "Jean Luc Picard"));

        //Library's function setBooks does a shallow copy of the books ArrayList. It simply assigns the books attribute
        //to the ArrayList reference being passed in
        alexandria.setBooks(books);

        //Print the Library information
        System.out.println(alexandria.toString());

        //Since the Library does a shallow copy of the array list, changes made to the list will affect the Library
        books.clear();

        //See we lost Alexandria's books
        System.out.println(alexandria.toString());
    }
}
