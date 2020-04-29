package edu.northeaststate.alexandria.models.film;

import java.io.Serializable;

public class LaserDisc extends Film implements Serializable, Cloneable {
    public LaserDisc(String ID, String title, String year, String director) {
        super(ID, title, year, director);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "LaserDisc{} " + super.toString();
    }
}
