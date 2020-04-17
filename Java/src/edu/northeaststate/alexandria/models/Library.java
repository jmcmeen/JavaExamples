package edu.northeaststate.alexandria.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    //deep copy
    public void setBooks(ArrayList<Book> books) {
        this.books = new ArrayList<>();

        for (Book b : books) {
            this.books.add(new Book(b));
        }
    }

    public int calculateTotalBooks() {
        return this.books.size();
    }

    public void addBook(String name, String ISBN, String author) {
        this.books.add(new Book(name, ISBN, author));
    }

    //deep copy
    public void addBooks(ArrayList<Book> books) {
        for (Book b : books) {
            this.books.add(new Book(b));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Library name: ");
        sb.append(this.name);
        sb.append("\n");
        sb.append("Total books: ");
        sb.append(this.calculateTotalBooks());
        sb.append("\n");

        for (Book b : this.books) {
            sb.append(b.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
