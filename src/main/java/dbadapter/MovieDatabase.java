package dbadapter;

import java.util.Date;

public class MovieDatabase {
    private int id;
    private String title;
    private String actors;
    private String director;
    private double avgRating;
    private Date publishingDate;

    public MovieDatabase() {

    }

    public MovieDatabase(int id, String title, String director, String actors, double avgRating, Date publishingDate) {
        this.id = id;
        this.title = title;
        this.actors = actors;
        this.director = director;
        this.avgRating = avgRating;
        this.publishingDate = publishingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }
}
