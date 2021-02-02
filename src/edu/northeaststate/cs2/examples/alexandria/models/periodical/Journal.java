package edu.northeaststate.cs2.examples.alexandria.models.periodical;

import java.io.Serializable;

public class Journal extends Periodical implements Serializable, Cloneable {
    public Journal(String ID, String title, String year, String volumeNumber) {
        super(ID, title, year, volumeNumber);
    }

    @Override
    public String toString() {
        return "Journal{} " + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
