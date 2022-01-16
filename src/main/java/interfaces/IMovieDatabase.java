package interfaces;

public interface IMovieDatabase {
    boolean addingMovie(String title, String director, String actors, String publishingDate);
    void setAVG(double avgValue, int movieID);
    boolean movieExists(String title, String director, String publishingDate) throws ClassNotFoundException;

    //TODO there'S no basis how to implement this method (it was wrongly built all along)
    //boolean movieInUsersList(int movieID, User registeredUser);
}
