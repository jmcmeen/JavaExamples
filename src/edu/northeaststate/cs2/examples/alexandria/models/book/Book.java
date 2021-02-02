package edu.northeaststate.cs2.examples.alexandria.models.book;

import edu.northeaststate.cs2.examples.alexandria.models.Item;

import java.io.Serializable;

public class Book extends Item implements Serializable, Cloneable{
    protected String author;
    protected String ISBN;

    public Book(String ID, String title, String year, String author, String ISBN) {
        super(ID, title, year);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
