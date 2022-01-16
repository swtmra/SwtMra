package interfaces;

import dbadapter.MovieDatabase;
import datatypes.User;
import java.util.List;

public interface RUCmds {
    boolean forwardAddMovie(String title, String director, String actor, String publishingDate) throws ClassNotFoundException;
    boolean forwardRateMovie(User user, int movieID, int ratingsValue, String optMsg);
    boolean userRatingExists(int movieID, String username);

    //TODO can we use the MovieDatabase as Datatype here or should we use Movie
    List<MovieDatabase> forwardBrowseMovies();

}
