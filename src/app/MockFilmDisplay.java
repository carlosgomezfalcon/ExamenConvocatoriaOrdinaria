package app;

import model.Film;
import view.FilmDisplay;

public class MockFilmDisplay implements FilmDisplay {
 
    private Film film;

    @Override
    public void display(Film film) {
        this.film = film;
        System.out.println(film.toString());
    }

    @Override
    public Film currentFilm() {
        return film;
    }
    
}
