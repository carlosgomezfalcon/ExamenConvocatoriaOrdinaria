package control;

import java.util.List;
import model.Film;
import view.CatalogueDisplay;

public class ShowCatalogueCommand implements Command {

    private final CatalogueDisplay display;
    private final List<Film> films; 
    
    public ShowCatalogueCommand (CatalogueDisplay catalogueDisplay, List<Film> films) {
        this.display = catalogueDisplay;
        this.films = films;
    }
    
    @Override
    public void execute() {
        display.display(films);
    }
    
}
