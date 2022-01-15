package interfaces;

import java.util.Date;

public interface IMovieDatabase {
    void addingMovie(String title, String director, String actor, Date publishingDate);
    void setAVG(double avgValue, int movieID);
}
