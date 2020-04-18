package edu.northeaststate.alexandria.models.film;

import java.io.Serializable;

public class VHS extends Film implements Serializable, Cloneable {
    public VHS(String ID, String title, String year, String director) {
        super(ID, title, year, director);
    }

    @Override
    public String toString() {
        return "VHS{} " + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
