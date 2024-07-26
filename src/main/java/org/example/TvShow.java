package org.example;

public class TvShow {
    private String name;
    private int episodes;
    private String genre;

    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    // Second constructor with default values for episodes and genre
    public TvShow(String name) {
        this.name = name;
        this.episodes = 0;
        this.genre = "Unknown";
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getName() + " it had " + getEpisodes() + " episodes in the " + getGenre() + " genre.";
    }
}

