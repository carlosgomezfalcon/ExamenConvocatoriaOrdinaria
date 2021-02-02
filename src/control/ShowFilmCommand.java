package control;

import java.util.List;
import java.util.Scanner;
import model.Film;
import view.FilmDisplay;

public class ShowFilmCommand implements Command {

    private final FilmDisplay display;
    private final List<Film> films;

    public ShowFilmCommand(FilmDisplay display, List<Film> films) {
        this.display = display;
        this.films = films;
    }
    
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert title of the film");
        String title = scanner.next();
        int flag = 0;
        for (Film film : films) {
            if(title.equals(film.getTitle())) {
                int index = films.indexOf(film);
                flag = 1;
                display.display(films.get(index));
                break;
            } 
        }
        if (flag==0) System.out.println("Film not available");
    }
        
}
