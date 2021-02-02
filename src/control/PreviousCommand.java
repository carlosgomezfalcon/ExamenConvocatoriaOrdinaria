package control;

import java.util.List;
import model.Film;
import view.FilmDisplay;

public class PreviousCommand implements Command{
    
    private final List<Film> films;
    private final FilmDisplay filmDisplay;

    public PreviousCommand(List<Film> films, FilmDisplay filmDisplay) {
        this.films = films;
        this.filmDisplay = filmDisplay;
    }
    
    @Override
    public void execute() {
        filmDisplay.display(prev());
    }
    
    private Film prev() {
        int index = films.indexOf(filmDisplay.currentFilm());
        return films.get((index-1+films.size()) % films.size());
    }
}
