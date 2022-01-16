package interfaces;

import datatypes.User;
import dbadapter.Movie;

import java.util.Date;
import java.util.List;

public interface RUCmds {
    boolean forwardAddMovie(String title, String director, String actor, Date publishingDate);
    boolean movieExists(String title, String director, Date publishingDate);
    boolean forwardRateMovie(User user, int movieID, int ratingsValue, String optMsg);
    boolean userRatingExists(int movieID, String username);
    //TODO which datatype (Movie/MovieDatabase)
    List<Movie> forwardBrowseMovies();
}
