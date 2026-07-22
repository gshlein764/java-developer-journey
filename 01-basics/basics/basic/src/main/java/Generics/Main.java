package Generics;

import MPMovieCollection.Movie;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox.getValue());

        Box<Integer> intBox = new Box<>(42);
        System.out.println(intBox.getValue());

        Box<Movie> movieBox = new Box<>(new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 8.3, false));
        System.out.println(movieBox.getValue());
    }
}
