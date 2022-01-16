package dbadapter;

import interfaces.IMovieDatabase;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MDB_Adapter implements IMovieDatabase {

    @Override
    public boolean addingMovie(String title, String director, String actors, String publishingDate) {
        String query =
                "insert into movies(title, director, actors, publishingDate) values(?,?,?,?)";
        try (Connection connection = DriverManager
                .getConnection(
                        "jdbc:" + Configuration.getType() + "://" + Configuration.getServer() + ":"
                                + Configuration.getPort() + "/" + Configuration.getDatabase(),
                        Configuration.getUser(), Configuration.getPassword())) {

            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setString(1, title);
                ps.setString(2, director);
                ps.setString(3, actors);
                ps.setString(4, publishingDate);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean movieExists(String title, String director, String publishingDate) {
        String query =
                "select * from movies where title = ? and director = ? and publishingDate = ?";
        try (Connection connection = DriverManager
                .getConnection(
                        "jdbc:" + Configuration.getType() + "://" + Configuration.getServer() + ":"
                                + Configuration.getPort() + "/" + Configuration.getDatabase(),
                        Configuration.getUser(), Configuration.getPassword())) {

            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setString(1, title);
                ps.setString(2, director);
                ps.setString(3, publishingDate);
                ResultSet rs = ps.executeQuery();

                if(rs.next()) {
                    return true;
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public List<MovieDatabase> get_Movies() throws SQLException {
        //SQL statements
        String sqlGetMovies = "SELECT * FROM MoviesDatabase ORDER BY avgRating DESC";

        //Perform database Query
        try (Connection connection = DriverManager.getConnection("jdbc:" + Configuration.getType()
                        + "://" + Configuration.getServer() + ":"
                        + Configuration.getPort() + "/" + Configuration.getDatabase(),
                Configuration.getUser(), Configuration.getPassword())) {
            try (PreparedStatement st = connection.prepareStatement(sqlGetMovies)) {
                ResultSet rsMovies = st.executeQuery();
                List<MovieDatabase> movies = new ArrayList<MovieDatabase>();
                while (rsMovies.next()) {
                    MovieDatabase movie = new MovieDatabase(rsMovies.getInt("id"), rsMovies.getString("title"), rsMovies.getString("director"), rsMovies.getString("actors"), rsMovies.getDouble("avgRating"), rsMovies.getDate("publishingDate"));
                    movies.add(movie);
                    return movies;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void setAVG(double avgValue, int movieID) {

    }
}
