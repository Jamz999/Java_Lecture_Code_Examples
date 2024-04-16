package org.example.week9_java_database.movies;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private final String databasePath;

    Database(String databasePath) {

        this.databasePath = databasePath;

        try (Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()) {

            statement.execute("CREATE TABLE IF NOT EXISTS " +
                    "movies (name text, starts INTEGER, watched BOOLEAN)");


        } catch (SQLException e) {
            System.out.println("Error creating movie DB table because " + e);
        }


    }
    public void addNewMovie(Movie movie) {

        String insertSQL = "INSERT INTO movies VALUES (?,?,?)";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getStars());
            preparedStatement.setBoolean(3, movie.getIsWatched());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Error adding movie " + movie + " because " + e);
        }
    }

    public List<Movie> getAllMovies() {


        List<Movie> movies = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()
        ) {

            ResultSet movieResult = statement.executeQuery("SELECT * FROM movies");

            while (movieResult.next()) {
                String name = movieResult.getString("name");
                int stars = movieResult.getInt("starts");
                boolean isWatched = movieResult.getBoolean("watched");

                movies.add(new Movie(name, stars, isWatched));
            }

        } catch (SQLException e) {
            System.out.println("Error fetching all movies because " + e);
        }

        return movies;
    }

}
