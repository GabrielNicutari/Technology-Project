package com.example.demo.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Game {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String genre;
    private double rating;
    private String mode;
    private Date releaseDate;
    private String developer;
    private String publisher;
    private String engine;

    public Game() {}

    public Game(int id, String name, String genre, double rating, String mode,
                Date releaseDate, String developer, String publisher, String engine) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.mode = mode;
        this.releaseDate = releaseDate;
        this.developer = developer;
        this.publisher = publisher;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
