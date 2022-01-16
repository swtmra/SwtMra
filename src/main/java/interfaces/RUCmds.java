package interfaces;

import dbadapter.MovieDatabase;
import datatypes.User;
import java.sql.Date;
import java.util.List;

public interface RUCmds {
    boolean forwardAddMovie(String title, String director, String actor, Date publishingDate);
    boolean movieExists(String title, int actor_id, int director_id, Date publishing_date);
    boolean forwardRateMovie(User user, int movieID, int ratingsValue, String optMsg);
    boolean userRatingExists(int movieID, String username);

    //TODO can we use the MovieDatabase as Datatype here or should we use Movie
    List<MovieDatabase> forwardBrowseMovies();

}
