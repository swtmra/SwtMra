package application;

import dbadapter.Configuration;
import dbadapter.MovieDatabase;
import datatypes.User;
import interfaces.PCmds;
import interfaces.RUCmds;

import java.sql.*;
import java.sql.Date;
import java.util.List;

public class MRA_Application implements PCmds, RUCmds {

    @Override
    public void registerUser(String email, int age, String username) {

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
    public boolean movieExists(String title, int actor_id, int director_id, Date publishing_date) {
        return false;
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
