package edu.northeaststate.cs2.examples.alexandria.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable {
    private String name;
    private ArrayList<LibraryItem> items;

    public Library(String name) {
        this.name = name;
        items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<LibraryItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<LibraryItem> newItems) {
        this.items = (ArrayList<LibraryItem>)newItems.clone();
    }

    public int calculateTotalItems() {
        return this.items.size();
    }

    public void addItem(LibraryItem item) throws CloneNotSupportedException {
        this.items.add( (LibraryItem)item.clone() );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Library name: ");
        sb.append(this.name);
        sb.append("\n");
        sb.append("Total items: ");
        sb.append(this.calculateTotalItems());
        sb.append("\n");

        for (LibraryItem i : this.items) {
            sb.append(i.toString());
            sb.append("\n");
        }

        return sb.toString();
    }


}
