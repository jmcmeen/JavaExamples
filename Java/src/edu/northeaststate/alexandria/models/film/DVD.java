package edu.northeaststate.alexandria.models.film;

import java.io.Serializable;

public class DVD extends Film implements Serializable {
    public DVD(String ID, String title, String year, String director) {
        super(ID, title, year, director);
    }

    public DVD(DVD dvd){
        super(dvd);
    }

    @Override
    public String toString() {
        return "DVD{} " + super.toString();
    }
}
