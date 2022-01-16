package dbadapter;

import interfaces.IMoviesRatings;

public class MR_Adapter implements IMoviesRatings {
    @Override
    public void ratingMovie(String username, int movieID, int ratingsValue, String optMsg) {

    }

    @Override
    public double getAVG(int movieID) {
        return 0;
    }
}
