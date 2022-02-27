package edu.northeaststate.cs2.examples.alexandria.models;

import java.io.Serializable;

public abstract class LibraryItem implements Serializable, Cloneable {
    protected String ID;
    protected String title;
    protected String year;

    public LibraryItem(String ID, String title, String year) {
        this.ID = ID;
        this.title = title;
        this.year = year;
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
