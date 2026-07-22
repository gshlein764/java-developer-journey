package MPMovieCollection;

public class Movie {
    private final String title;
    private final String director;
    private final int year;
    private double rating;
    private boolean watched;

    // Геттеры
    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public int getYear() { return year; }
    public double getRating() { return rating; }
    public boolean getWatched() { return watched; }

    public Movie(String title, String director, int year, double rating, boolean watched) {
        this.title = title;
        this.director = director;
        this.year = year;
        this. rating = rating;
        this.watched = watched;
    }

    public void watch() {
        if (!watched) {
            watched = true;
        }
    }

    public void changeRating(double Rating) {
        if (Rating < 0) {
            throw new IllegalArgumentException("Rating must be positive.");
        }

        if (Rating > 10) {
            throw new IllegalArgumentException("Rating must be on 0 to 10 interval.");
        }

        rating = Rating;
    }

    @Override
    public String toString() {
        return """
               Title: %s
               Director: %s
               Year: %d
               Rating: %.1f
               Watched: %b
               """.formatted(title, director, year, rating, watched);
    }
}
