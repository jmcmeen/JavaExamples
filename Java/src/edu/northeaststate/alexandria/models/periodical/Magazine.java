package edu.northeaststate.alexandria.models.periodical;

import java.io.Serializable;

public class Magazine extends Periodical implements Serializable, Cloneable{
    public Magazine(String ID, String title, String year, String volumeNumber) {
        super(ID, title, year, volumeNumber);
    }

    @Override
    public String toString() {
        return "Magazine{} " + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
