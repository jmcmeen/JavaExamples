package edu.northeaststate.alexandria.models.periodical;

import java.io.Serializable;

public class Newspaper extends Periodical implements Serializable {
    public Newspaper(String ID, String title, String year, String volumeNumber) {
        super(ID, title, year, volumeNumber);
    }

    public Newspaper(Newspaper newspaper){
        super(newspaper);
    }

    @Override
    public String toString() {
        return "Newspaper{} " + super.toString();
    }
}
