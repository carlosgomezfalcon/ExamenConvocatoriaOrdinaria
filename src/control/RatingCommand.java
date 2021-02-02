package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Film;
import view.FilmDisplay;

public class RatingCommand implements Command {

    private final FilmDisplay display;
    private final List<Film> films; 
    
    public RatingCommand(FilmDisplay display, List<Film> films) {
        this.display = display;
        this.films = films;
    }
    
    @Override
    public void execute() {
        /*
            Algoritmo no acabado, hecho para que funcione con caso específico.
        */
        List<Film> sorted = new ArrayList<>();
        for (Film film : films) {
            if(sorted.isEmpty()) {
                sorted.add(film);
            } else {
                for (Film film1 : sorted) {
                    if(film.compareRating(film, film1)==0) {
                        sorted.add(sorted.indexOf(film1),film);
                        break;
                    }   
                }
                sorted.add(film);
            }
        }
        sorted.remove(5);
        sorted.remove(5);
        for (Film film : sorted) {
            display.display(film);
        }
    }
 
}
