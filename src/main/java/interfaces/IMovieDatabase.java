package interfaces;

import datatypes.User;

import java.sql.Date;

public interface IMovieDatabase {
    boolean addingMovie(String title, int director_id, int actor_id, Date publishingDate);
    void setAVG(double avgValue, int movieID);
    boolean movieExists(String title, int actor_id, int director_id, Date publishing_date);

    //TODO there'S no basis how to implement this method (it was wrongly built all along)
    //boolean movieInUsersList(int movieID, User registeredUser);
}
