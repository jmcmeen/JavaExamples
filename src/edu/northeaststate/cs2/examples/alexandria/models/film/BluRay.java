package edu.northeaststate.cs2.examples.alexandria.models.film;

import java.io.Serializable;

public class BluRay extends Film implements Serializable, Cloneable{
    public BluRay(String ID, String title, String year, String director) {
        super(ID, title, year, director);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "BluRay{} " + super.toString();
    }
}
