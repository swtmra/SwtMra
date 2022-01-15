package interfaces;

public interface IMoviesRatings {
    void ratingMovie(String username, int movieID, int ratingsValue, String optMsg);
    double getAVG(int movieID);
}
