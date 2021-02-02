package edu.northeaststate.cs2.examples.alexandria.models.periodical;

import edu.northeaststate.cs2.examples.alexandria.models.Item;

import java.io.Serializable;

public class Periodical extends Item implements Serializable, Cloneable {
    protected String volumeNumber;

    public Periodical(String ID, String title, String year, String volumeNumber) {
        super(ID, title, year);
        this.volumeNumber = volumeNumber;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getVolumeNumber() {
        return volumeNumber;
    }

    @Override
    public String toString() {
        return "Periodical{" +
                "volumeNumber='" + volumeNumber + '\'' +
                "} " + super.toString();
    }
}
