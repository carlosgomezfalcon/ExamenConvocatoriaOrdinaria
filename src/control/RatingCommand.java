package control;

import java.util.ArrayList;
import java.util.List;
import model.Film;
import view.FilmDisplay;

public class RatingCommand implements Command {

    private final FilmDisplay display;
    private List<Film> films; 

    public RatingCommand(FilmDisplay display, List<Film> films) {
        this.display = display;
        this.films = films;
    }
    
    @Override
    public void execute() {
        /*
        List<Film> sorted = new ArrayList<>();
        for (Film film : films) {
            if(sorted.isEmpty()) {
                sorted.add(film);
            } else {
                algoritmo de ordenación
            }
            
        }
        display.display(sorted);
        */
        for (Film film : films) {
            display.display(film);
        }
    }
}
