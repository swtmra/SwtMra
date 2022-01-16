package application;

import dbadapter.Configuration;
import dbadapter.MDB_Adapter;
import dbadapter.MovieDatabase;
import datatypes.User;
import dbadapter.UDB_Adapter;
import interfaces.PCmds;
import interfaces.RUCmds;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MRA_Application implements PCmds, RUCmds {

    @Override
    public boolean registerUser(String email, int age, String username) {
        boolean usernameExists = new MRA_Application().usernameExists(username);
        if (age < 18 && usernameExists) {
            return false;
        } else {
            new UDB_Adapter().registeringUser(email,username,age);
            return true;
        }
    }

    @Override
    public boolean usernameExists(String username) {
        return false;
    }

    @Override
    public boolean forwardAddMovie(String title, String director, String actor, Date publishingDate) {
        return false;
    }

    @Override
    public boolean movieExists(String title, String actor, String director, Date publishing_date) {
        return new MDB_Adapter().movieExists(title,director,publishing_date);
    }

    @Override
    public boolean forwardRateMovie(User user, int movieID, int ratingsValue, String optMsg) {
        return false;
    }

    @Override
    public boolean userRatingExists(int movieID, String username) {
        return false;
    }

    //TODO can we use the MovieDatabase as Datatype here or should we use Movie
    @Override
    public List<MovieDatabase> forwardBrowseMovies() {
        return null;
    }
}
