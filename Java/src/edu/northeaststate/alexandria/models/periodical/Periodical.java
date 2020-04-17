package edu.northeaststate.alexandria.models.periodical;

import edu.northeaststate.alexandria.models.Item;

import java.io.Serializable;

public class Periodical extends Item implements Serializable {
    protected String volumeNumber;

    public Periodical(String ID, String title, String year, String volumeNumber) {
        super(ID, title, year);
        this.volumeNumber = volumeNumber;
    }

    public Periodical(Periodical periodical){
        super(periodical);
        this.volumeNumber =periodical.volumeNumber;
    }

    @Override
    public String toString() {
        return "Periodical{" +
                "volumeNumber='" + volumeNumber + '\'' +
                "} " + super.toString();
    }
}
