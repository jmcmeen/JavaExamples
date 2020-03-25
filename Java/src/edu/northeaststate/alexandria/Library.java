package edu.northeaststate.alexandria;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name){
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

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public int calculateTotalBooks(){
        return this.books.size();
    }

    public void addBook(String name, String ISBN, String author){
        this.books.add( new Book(name, ISBN, author) );
    }

    public void addBook(Book b){
        this.books.add(new Book(b));
    }

    public void addBooks(ArrayList<Book> books){
        for(Book b: books){
            this.books.add(new Book(b));
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Library name: ");
        sb.append(this.name);
        sb.append("\n");
        sb.append("Total books: ");
        sb.append(this.calculateTotalBooks());
        sb.append("\n");

        for (Book b: this.books) {
            sb.append(b.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
