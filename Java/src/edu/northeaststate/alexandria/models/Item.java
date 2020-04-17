package edu.northeaststate.alexandria.models;

import java.io.Serializable;

public abstract class Item implements Serializable {
    protected String ID;
    protected String title;
    protected String year;

    public Item(String ID, String title, String year) {
        this.ID = ID;
        this.title = title;
        this.year = year;
    }

    public Item(Item item){
        this.ID = item.ID;
        this.title = item.title;
        this.year = item.year;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
