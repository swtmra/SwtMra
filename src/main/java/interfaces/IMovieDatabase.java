package interfaces;

import datatypes.User;

import java.sql.Date;

public interface IMovieDatabase {
    boolean addingMovie(String title, int director_id, int actor_id, Date publishingDate);
    void setAVG(double avgValue, int movieID);

    //TODO there'S no basis how to implement this method (it was wrongly built all along)
    //boolean movieInUsersList(int movieID, User registeredUser);
}
