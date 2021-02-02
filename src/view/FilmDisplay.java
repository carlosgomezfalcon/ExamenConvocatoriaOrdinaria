package view;

import model.Film;

public interface FilmDisplay {
    void display(Film film);
    public Film currentFilm();
}
