package dbadapter;

public class MoviesRating {

    private String username;
    private int movieID;
    private int ratingID;
    private int value;
    private String optMsg;

    public MoviesRating() {
    }

    public MoviesRating(String username, int movieID, int ratingID, int value, String optMsg) {
        this.username = username;
        this.movieID = movieID;
        this.ratingID = ratingID;
        this.value = value;
        this.optMsg = optMsg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getRatingID() {
        return ratingID;
    }

    public void setRatingID(int ratingID) {
        this.ratingID = ratingID;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getOptMsg() {
        return optMsg;
    }

    public void setOptMsg(String optMsg) {
        this.optMsg = optMsg;
    }
}
