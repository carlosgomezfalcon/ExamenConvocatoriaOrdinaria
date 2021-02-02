package control;

import java.util.List;
import model.Film;
import view.FilmDisplay;

public class NextCommand implements Command {

    private final List<Film> films;
    private final FilmDisplay filmDisplay;

    public NextCommand(List<Film> films, FilmDisplay filmDisplay) {
        this.films = films;
        this.filmDisplay = filmDisplay;
    }
    
    @Override
    public void execute() {
        filmDisplay.display(next());
    }
    
    private Film next() {
        int index = films.indexOf(filmDisplay.currentFilm());
        return films.get((index+1) % films.size());
    }
    
}
