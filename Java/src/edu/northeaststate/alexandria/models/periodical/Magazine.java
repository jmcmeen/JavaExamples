package edu.northeaststate.alexandria.models.periodical;

import java.io.Serializable;

public class Magazine extends Periodical implements Serializable {
    public Magazine(String ID, String title, String year, String volumeNumber) {
        super(ID, title, year, volumeNumber);
    }

    public Magazine(Magazine magazine){
        super(magazine);
    }

    @Override
    public String toString() {
        return "Magazine{} " + super.toString();
    }
}
