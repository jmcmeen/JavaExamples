package edu.northeaststate.cs2.examples.treemap; /**
 * -------------------------------------------------
 * File name: TreeMapExample.java
 * -------------------------------------------------
 * Created By: Isaac Duncan
 *             John McMeen
 * Email: iduncan@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 * Reference: https://www.javatpoint.com/java-treemap
 * -------------------------------------------------
 */

import java.util.Map;
import java.util.TreeMap;

/**
 * Class Name: Book
 * Purpose: Create a book object to be used in the example
 */
class Book {
  int id;
  String name, author, publisher;
  int quantity;

  public Book(
      int id,
      String name,
      String author,
      String publisher,
      int quantity) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    this.quantity = quantity;
  }
}
// End Book Class

/**
 * Class Name: TreeMapExample
 * Purpose: To demonstate an implementation of the TreeMap class
 */
public class TreeMapExample {

  public static void main(String[] args) {
    // Creating map of Books
    Map<Integer, Book> map = new TreeMap<Integer, Book>();
    // Creating Books
    Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
    Book b2 = new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
    Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
    // Adding Books to map
    // The put method assigns an object to the 'key' and unlike an Array or ArrayList, can be done in any order
    // The first paramether sets the key and the second sets the value of the entry
    map.put(2, b2);
    map.put(1, b1);
    map.put(3, b3);

    // Traversing map
    for (Map.Entry<Integer, Book> entry : map.entrySet()) {
      // Prints each book in the TreeMap
      int key = entry.getKey();
      Book b = entry.getValue();
      System.out.println(key + " Details:");
      System.out.println(
          b.id +
              " " +
              b.name +
              " " +
              b.author +
              " " +
              b.publisher +
              " " +
              b.quantity);
    }
  }
}
