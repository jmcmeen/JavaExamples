package edu.northeaststate.cs2.examples.alexandria.models.periodical;

import java.io.Serializable;

public class Newspaper extends Periodical implements Serializable, Cloneable {
    public Newspaper(String ID, String title, String year, String volumeNumber) {
        super(ID, title, year, volumeNumber);
    }

    @Override
    public String toString() {
        return "Newspaper{} " + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
