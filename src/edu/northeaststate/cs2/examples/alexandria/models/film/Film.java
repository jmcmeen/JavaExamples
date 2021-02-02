package edu.northeaststate.cs2.examples.alexandria.models.film;

import edu.northeaststate.cs2.examples.alexandria.models.Item;

import java.io.Serializable;

public class Film extends Item implements Serializable, Cloneable{
    protected String director;

    public Film(String ID, String title, String year, String director) {
        super(ID, title, year);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "director='" + director + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
