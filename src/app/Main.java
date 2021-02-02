package app;

import control.Command;
import control.ExitCommand;
import control.NextCommand;
import control.NullCommand;
import control.PreviousCommand;
import control.RatingCommand;
import control.ShowCatalogueCommand;
import control.ShowFilmCommand;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import model.Film;
import view.FilmLoader;
import view.CatalogueDisplay;
import view.FilmDisplay;

public class Main {
    
    private List<Film> catalogue = new ArrayList<>();
    private Map<String, Command> commands = new HashMap<>();
    private CatalogueDisplay catalogueDisplay = new MockCatalogueDisplay();
    private FilmLoader catalogueLoader = new MockFilmLoader();
    private FilmDisplay filmDisplay = new MockFilmDisplay();
    
    public static void main(String[] args) {
        new Main().execute();
    }

    private void execute() {
        Scanner scanner = new Scanner(System.in);
        this.commands = createCommands();
        catalogue.addAll(catalogueLoader.load());
        while(true) {
            commands.getOrDefault(scanner.next(), NullCommand.Instance).execute();
        }
    }

    private Map<String, Command> createCommands() {
        /**
         * No me da tiempo, pero para ordenar las películas habría
         * que crear comandos diseñados para ello, y dentro de cada comando 
         * ordenar la lista de películas según el criterio elegido,
         * y luego en el display mostrar la lista de películas en orden.
         */
        this.commands.put("c", new ShowCatalogueCommand(catalogueDisplay, catalogue));
        this.commands.put("f", new ShowFilmCommand(filmDisplay, catalogue));
        this.commands.put("n", new NextCommand(catalogue, filmDisplay));
        this.commands.put("p", new PreviousCommand(catalogue, filmDisplay));
        this.commands.put("r", new RatingCommand(filmDisplay, catalogue));
        this.commands.put("q", new ExitCommand());
        this.commands.put("C", commands.get("c"));
        this.commands.put("F", commands.get("f"));
        this.commands.put("N", commands.get("n"));
        this.commands.put("P", commands.get("p"));
        this.commands.put("R", commands.get("r"));
        this.commands.put("Q", commands.get("q"));
        return commands;
    }
    
}
