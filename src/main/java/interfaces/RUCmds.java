package interfaces;

import datatypes.User;

import java.util.Date;

public interface RUCmds {
    boolean forwardAddMovie(String title, String director, String actor, Date publishingDate);
    boolean forwardRateMovie(User user, int movieID, int ratingsValue, String optMsg);
    //TODO which datatype (Movie/MovieDatabase)
    //Movie forwardBrowseMovies();
}
