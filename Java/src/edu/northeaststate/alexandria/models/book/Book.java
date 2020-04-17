package edu.northeaststate.alexandria.models.book;

import edu.northeaststate.alexandria.models.Item;

import java.io.Serializable;

public class Book extends Item implements Serializable {
    protected String author;
    protected String ISBN;

    public Book(String ID, String title, String year, String author, String ISBN) {
        super(ID, title, year);
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book(Book book) {
        super(book);
        this.ISBN = book.ISBN;
        this.author = book.author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                "} " + super.toString();
    }
}
