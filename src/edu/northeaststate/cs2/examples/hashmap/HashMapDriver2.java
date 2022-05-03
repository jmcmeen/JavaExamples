/**
 * ---------------------------------------------------------
 * File Name: HashMapDriver2.java
 * Project Name: CS2 Examples
 * ---------------------------------------------------------
 * Name: Michael Miller
 *       John McMeen
 * Email: mmille54@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * ---------------------------------------------------------
 **/
package edu.northeaststate.cs2.examples.hashmap;
import java.util.HashMap;

/**
 * Class Name: Project3
 * Purpose: Example code for HashMap
 */
public class HashMapDriver2 {
    /**
     * Method Name: Main
     * Purpose: To run the HashMap example
     * @param args - not used
     */
    public static void main(String[] args) {
        //Creating a new hash map named menu that will hold a meal name, and its calorie count
        HashMap<String, Double> menu = new HashMap<>();
        //Filling the hash map
        menu.put("Fre Shavacado", 234.0);
        menu.put("Chili Galore",320.6);
        menu.put("Bag of Air",0.0);
        menu.put("Single Slice of White Bread", 30.0);
        menu.remove("Bag of Air");

        //Printing out the hash map menu
        System.out.println("Come on down to Del Taco! We got: ");
        for (String i : menu.keySet()) {
            System.out.println("\titem: " + i +"\n\t" + menu.get(i) + " calories\n");
        }
        System.out.println("------------------------------------------------------------");

        //Creating a new hash map named shop from an Item object
        HashMap<String, Item> shop = new HashMap<>();

        //Creating the items
        Item item1 = new Item("Holy Grail", 5000);
        Item item2 = new Item("Holy Hand Grenade of Antioch", 3500);
        Item item3 = new Item("Sword from the Stone", 2500);
        Item item4 = new Item("Crown of England", 1400);
        Item item5 = new Item("Mudpacker Mud", 1000);

        //Filling the shop
        shop.put(item1.getName(), item1);
        shop.put(item2.getName(), item2);
        shop.put(item3.getName(), item3);
        shop.put(item4.getName(), item4);
        shop.put(item5.getName(), item5);

        //Printing the shop
        System.out.println("Welcome to Monty's Python! We got: ");
        for (String j : shop.keySet()) {
            System.out.println(shop.get(j) + "\n");
        }
    }
}
