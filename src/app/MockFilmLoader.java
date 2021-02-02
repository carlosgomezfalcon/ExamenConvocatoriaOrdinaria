package app;

import java.util.ArrayList;
import java.util.List;
import model.Film;
import view.FilmLoader;

public class MockFilmLoader implements FilmLoader {
    
    @Override
    public List<Film> load() {
        List<Film> list = new ArrayList<>();
        list.add(new Film("FilmImage1","Film1",2020,"Carlos","Manuel,Alba,Pedro","Comedy",4.9,"90 minutes"));
        list.add(new Film("FilmImage2","Film2",2020,"Laura","Manuel,Alba,Carlos","Horror",4.2,"60 minutes"));
        list.add(new Film("FilmImage3","Film3",2020,"Manuel","Carlos,Laura,Pedro","Action",3.8,"150 minutes"));
        list.add(new Film("FilmImage4","Film4",2020,"Pedro","Manuel,Laura,Carlos","Drama",2.3,"120 minutes"));
        list.add(new Film("FilmImage5","Film5",2020,"Juana","Aroa,Alejandro,Emilio,Javier","Suspense",4.4,"137 minutes"));
        return list;
    }
    
}

