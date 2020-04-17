package edu.northeaststate.alexandria.models;

import edu.northeaststate.alexandria.models.book.Book;
import edu.northeaststate.alexandria.models.film.DVD;
import edu.northeaststate.alexandria.models.film.VHS;
import edu.northeaststate.alexandria.models.periodical.Journal;
import edu.northeaststate.alexandria.models.periodical.Magazine;
import edu.northeaststate.alexandria.models.periodical.Newspaper;

import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable {
    private String name;
    private ArrayList<Item> items;

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

    public ArrayList<Item> getItems() {
        return items;
    }

    //deep copy
    public void setItems(ArrayList<Item> newItems) {
        this.items = new ArrayList<>();

        for (Item item : newItems) {
            if(item instanceof Book){
                this.items.add(new Book( (Book) item) );
            }else if (item instanceof DVD){
                this.items.add(new DVD( (DVD) item));
            }else if (item instanceof VHS){
                this.items.add(new VHS( (VHS) item));
            }else if (item instanceof Journal){
                this.items.add(new Journal( (Journal) item));
            }else if (item instanceof Magazine){
                this.items.add(new Magazine( (Magazine) item));
            }else if (item instanceof Newspaper){
                this.items.add(new Newspaper( (Newspaper) item));
            }
        }
    }

    public int calculateTotalItems() {
        return this.items.size();
    }

    public void addItem(Item item) {
        if(item instanceof Book){
            this.items.add(new Book( (Book) item) );
        }else if (item instanceof DVD){
            this.items.add(new DVD( (DVD) item));
        }else if (item instanceof VHS){
            this.items.add(new VHS( (VHS) item));
        }else if (item instanceof Journal){
            this.items.add(new Journal( (Journal) item));
        }else if (item instanceof Magazine){
            this.items.add(new Magazine( (Magazine) item));
        }else if (item instanceof Newspaper){
            this.items.add(new Newspaper( (Newspaper) item));
        }
    }

    //deep copy
    public void addItems(ArrayList<Item> newItems) {
        for (Item item : newItems) {
            if(item instanceof Book){
                this.items.add(new Book( (Book) item) );
            }else if (item instanceof DVD){
                this.items.add(new DVD( (DVD) item));
            }else if (item instanceof VHS){
                this.items.add(new VHS( (VHS) item));
            }else if (item instanceof Journal){
                this.items.add(new Journal( (Journal) item));
            }else if (item instanceof Magazine){
                this.items.add(new Magazine( (Magazine) item));
            }else if (item instanceof Newspaper){
                this.items.add(new Newspaper( (Newspaper) item));
            }
        }
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

        for (Item i : this.items) {
            sb.append(i.toString());
            sb.append("\n");
        }

        return sb.toString();
    }


}
