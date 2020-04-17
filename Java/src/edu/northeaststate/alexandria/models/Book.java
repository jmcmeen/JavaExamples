package edu.northeaststate.alexandria.models;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String ISBN;
    private String author;

    //overloaded constructor3
    public Book(String name, String ISBN, String author) {
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
    }

    //copy constructor
    public Book(Book b) {
        this.name = b.getName();
        this.ISBN = b.getISBN();
        this.author = b.getAuthor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", author=" + author +
                '}';
    }
}
