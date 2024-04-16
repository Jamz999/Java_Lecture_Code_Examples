package org.example.week9_java_database.movies;

public class Movie {

    private String name;
    private int stars;
    private boolean isWatched;

    Movie(String name, int stars, boolean isWatched) {
        this.name = name;
        this.stars = stars;
        this.isWatched = isWatched;
    }

    @Override
    public String toString() {
        String text = "The Movie " + name + " has a rating of " + stars + " out of 5 stars. ";
        if (isWatched) {
            text += "You have watched this movie.";
        } else {
            text += "You have not watched this movie.";
        }
        return text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean getIsWatched() {
        return isWatched;
    }

    public void setIsWatched(boolean isWatched) {
        this.isWatched = isWatched;
    }
}
