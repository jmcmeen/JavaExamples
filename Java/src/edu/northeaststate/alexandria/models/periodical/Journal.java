package edu.northeaststate.alexandria.models.periodical;

import java.io.Serializable;

public class Journal extends Periodical implements Serializable {
    public Journal(String ID, String title, String year, String volumeNumber) {
        super(ID, title, year, volumeNumber);
    }

    public Journal(Journal journal){
        super(journal);
    }

    @Override
    public String toString() {
        return "Journal{} " + super.toString();
    }
}
