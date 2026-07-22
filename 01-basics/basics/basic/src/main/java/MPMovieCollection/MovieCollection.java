package MPMovieCollection;
import java.util.Collection;
import java.util.List;
import java.util.HashMap;

public class MovieCollection {
    private final HashMap<String, Movie> movies = new HashMap<>();

    public Movie getMovie(String title) { return movies.get(title); }
    public Collection<Movie> getMovies() { return movies.values(); }

    public void addMovie(Movie movie) {
        if (movie == null) {
            throw new IllegalArgumentException("Movie can't be null.");
        }

        movies.put(movie.getTitle(), movie);
    }

    public void removeMovie(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Wrong format.");
        }

        movies.remove(title);
    }

    public Movie findMovie(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Wrong format.");
        }

        return movies.get(title);
    }

    public double getAverageRating() {
        if (movies.isEmpty()) {
            return 0;
        }

        double summary = 0;
        for (Movie movie : movies.values()) {
            summary += movie.getRating();
        }
        return summary / movies.size();
    }

    public void printWatchedMovies() {
        for (Movie movie : movies.values()) {
            if (movie.getWatched()) {
                System.out.println(movie);
            }
        }
    }

    public void printUnwatchedMovies() {
        for (Movie movie : movies.values()) {
            if (!movie.getWatched()) {
                System.out.println(movie);
            }
        }
    }

    public void printAllMovies() {
        if (movies.isEmpty()) {
            System.out.println("Collection is empty.");
            return;
        }

        for (Movie movie : movies.values()) {
            System.out.println(movie);
        }
    }
}
