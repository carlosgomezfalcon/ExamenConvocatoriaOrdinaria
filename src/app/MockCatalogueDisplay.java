package app;

import java.util.List;
import model.Film;
import view.CatalogueDisplay;

public class MockCatalogueDisplay implements CatalogueDisplay  {

    private List<Film> catalogue;
    
    @Override
    public void display(List<Film> catalogue) {
        this.catalogue = catalogue;
        for (Film film : catalogue) {
            //System.out.println(film.toString());
            System.out.println("Title: "+film.getTitle()+","+"Image: "+film.getImage());
        }
    }
    
}

