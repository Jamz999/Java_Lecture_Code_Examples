package org.example.week9_java_database.movies;


import java.sql.SQLException;
import java.util.List;

import static input.InputUtils.*;

public class MovieList {

    private static final String DB_PATH = "jdbc:sqlite:movie_watchlist";
    private static Database database;

    public static void main(String[] args) throws SQLException {
        database = new Database(DB_PATH);
        addNewMovies();
        displayMovies();
    }

    public static void addNewMovies() {
        do {

            String movieName = stringInput("Enter Movie name:");
            boolean movieWatched = yesNoInput("Have you seen this movie yet?");
            int movieStars = 0;
            if (movieWatched) {
                movieStars = positiveIntInput("What is your rating, in stars out of 5?");
            }

            Movie movie = new Movie(movieName, movieStars, movieWatched);
            database.addNewMovie(movie);

        } while (yesNoInput("Add another movie to watchlist? "));
    }

    public static void displayMovies() {
        List<Movie> movies = database.getAllMovies();
        if (movies.isEmpty()) {
            System.out.println("There are no movies");
            return;
        }

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
