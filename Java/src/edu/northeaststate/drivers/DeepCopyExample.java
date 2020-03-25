package edu.northeaststate.drivers;

import edu.northeaststate.alexandria.*;

import java.util.ArrayList;

public class DeepCopyExample {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Library alexandria = new Library("Alexandria");

        //Add some books to ArrayList
        books.add(new Book("Hitchhikers Anonymous", "978-0833030474", "Arthur Dent"));
        books.add(new Book("Chess for Lords and Ladies", "978-0870334337", "Jean Luc Picard"));

        //Library's function addBooks does a deep copy of the books ArrayList
        alexandria.addBooks(books);

        //Print the Library information
        System.out.println(alexandria.toString());

        //Since the Library does a deep copy of the array list, we can safely make changes to this list without affecting
        //the library
        books.clear();

        //See no changes
        System.out.println(alexandria.toString());
    }
}
