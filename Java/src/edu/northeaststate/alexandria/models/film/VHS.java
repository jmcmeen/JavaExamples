package edu.northeaststate.alexandria.models.film;

import java.io.Serializable;

public class VHS extends Film implements Serializable {
    public VHS(String ID, String title, String year, String director) {
        super(ID, title, year, director);
    }

    public VHS(VHS vhs){
        super(vhs);
    }

    @Override
    public String toString() {
        return "VHS{} " + super.toString();
    }
}
