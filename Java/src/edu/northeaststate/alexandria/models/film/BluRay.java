package edu.northeaststate.alexandria.models.film;

public class BluRay extends Film {
    public BluRay(String ID, String title, String year, String director) {
        super(ID, title, year, director);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "BluRay{} " + super.toString();
    }
}
