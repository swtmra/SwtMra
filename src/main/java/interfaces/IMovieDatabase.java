package interfaces;

import datatypes.User;

import java.util.Date;

public interface IMovieDatabase {
    void addingMovie(String title, String director, String actor, Date publishingDate);
    void setAVG(double avgValue, int movieID);

    //TODO there'S no basis how to implement this method (it was wrongly built all along)
    //boolean movieInUsersList(int movieID, User registeredUser);
}
