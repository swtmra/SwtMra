package application;

import dbadapter.MDB_Adapter;
import dbadapter.MovieDatabase;
import datatypes.User;
import dbadapter.UDB_Adapter;
import interfaces.PCmds;
import interfaces.RUCmds;
import java.util.List;

public class MRA_Application implements PCmds, RUCmds {

    @Override
    public boolean registerUser(String email, int age, String username) {
        boolean usernameExists = new UDB_Adapter().usernameExists(username);
        if (age < 18 && usernameExists) {
            return false;
        } else {
            new UDB_Adapter().registeringUser(email,username,age);
            return true;
        }
    }


    @Override
    public boolean forwardAddMovie(String title, String director, String actor, String publishingDate) {
        boolean movieExists = new MDB_Adapter().movieExists( title, director, publishingDate);
        if(!movieExists){
            new MDB_Adapter().addingMovie(title, actor, director, publishingDate);
            return true;
        }
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
