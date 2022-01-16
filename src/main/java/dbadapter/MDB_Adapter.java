package dbadapter;

import interfaces.IMovieDatabase;

import java.util.Date;

public class MDB_Adapter implements IMovieDatabase {
    @Override
    public void addingMovie(String title, String director, String actor, Date publishingDate) {

    }

    @Override
    public void setAVG(double avgValue, int movieID) {

    }
}
