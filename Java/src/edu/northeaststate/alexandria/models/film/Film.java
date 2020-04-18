package edu.northeaststate.alexandria.models.film;

import edu.northeaststate.alexandria.models.Item;

import java.io.Serializable;

public class Film extends Item implements Serializable {
    protected String director;

    public Film(String ID, String title, String year, String director) {
        super(ID, title, year);
        this.director = director;
    }

    public Film(Film film){
        super(film);
        this.director = film.director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "director='" + director + '\'' +
                "} " + super.toString();
    }
}
