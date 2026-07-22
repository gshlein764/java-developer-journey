package MPMovieCollection;

public class Main {
    public static void main(String[] args) {
        MovieCollection movieCollection = new MovieCollection();

        movieCollection.addMovie(new Movie("Despecable Me 2", "Pier Koffen", 2013, 7.6, true));
        movieCollection.addMovie(new Movie("Despecable Me 4", "Patrik Delazh", 2024, 5.6, true));
        movieCollection.addMovie(new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 8.3, false));
        movieCollection.addMovie(new Movie("The Lords Of the Rings: The Return Of The King", "Piter Jackson", 2003, 8.1, true));
        movieCollection.addMovie(new Movie("Fight Club", "David Fincher", 1999, 8.1, true));

        movieCollection.removeMovie("Despecable Me 4");
        movieCollection.findMovie("Fight Club");
        movieCollection.findMovie("Despecable Me 4");
        System.out.println(movieCollection.getAverageRating());
        System.out.println(movieCollection.getMovie("Fight Club"));
        movieCollection.printUnwatchedMovies();
        movieCollection.printWatchedMovies();
    }
}
