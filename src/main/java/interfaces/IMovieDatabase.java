package interfaces;

import datatypes.User;

import java.sql.Date;

public interface IMovieDatabase {
    boolean addingMovie(String title, String director, String actors, Date publishingDate);
    void setAVG(double avgValue, int movieID);
    boolean movieExists(String title, String director, Date publishing_date);

    //TODO there'S no basis how to implement this method (it was wrongly built all along)
    //boolean movieInUsersList(int movieID, User registeredUser);
}
