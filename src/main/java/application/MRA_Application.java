package application;

import datatypes.User;
import interfaces.PCmds;
import interfaces.RUCmds;

import java.util.Date;

public class MRA_Application implements PCmds, RUCmds {
    @Override
    public void registerUser(String email, int age, String username) {

    }

    @Override
    public boolean forwardAddMovie(String title, String director, String actor, Date publishingDate) {
        return false;
    }

    @Override
    public boolean forwardRateMovie(User user, int movieID, int ratingsValue, String optMsg) {
        return false;
    }
}
