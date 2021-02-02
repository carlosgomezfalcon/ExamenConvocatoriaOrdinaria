package model;

public class Film {
    
    private final String image;
    private final String title;
    private final int year;
    private final String director;
    private final String cast; //Reparto de actores
    private final String genre;
    private final double rating;
    private final String duration;

    public Film(String image, String title, int year, String director, String cast, String genre, double rating, String duration) {
        this.image = image;
        this.title = title;
        this.year = year;
        this.director = director;
        this.cast = cast;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + ": year=" + year + ", director=" + director + ", cast=" + cast + ", genre=" + genre + ", rating=" + rating + ", duration=" + duration;
    }
    
    
    
}
