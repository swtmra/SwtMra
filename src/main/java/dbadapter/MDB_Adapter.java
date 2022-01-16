package dbadapter;

import interfaces.IMovieDatabase;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MDB_Adapter implements IMovieDatabase {

    @Override
    public boolean addingMovie(String title, String director, String actors, String publishingDate) {
        String query =
                "insert into moviesdatabase(title, director, actors, avgRating, publishingDate) values(?,?,?,?,?)";
        try (Connection connection = DriverManager
                .getConnection(
                        "jdbc:" + Configuration.getType() + "://" + Configuration.getServer() + ":"
                                + Configuration.getPort() + "/" + Configuration.getDatabase(),
                        Configuration.getUser(), Configuration.getPassword())) {

            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setString(1, title);
                ps.setString(2, director);
                ps.setString(3, actors);
                ps.setDouble(4, 0);
                ps.setString(5, publishingDate);
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
    public boolean movieExists(String title, String director, String publishingDate) throws ClassNotFoundException {
        String query =
                "select * from moviesdatabase where title = ? and director = ? and publishingDate = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
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


    public List<MovieDatabase> get_Movies() throws SQLException, ClassNotFoundException {
        //SQL statements
        String sqlGetMovies = "SELECT * FROM moviesdatabase ORDER BY avgRating DESC";
        List<MovieDatabase> movies = new ArrayList<>();

        Class.forName("com.mysql.cj.jdbc.Driver");
        //Perform database Query
        try (Connection connection = DriverManager.getConnection("jdbc:" + Configuration.getType()
                        + "://" + Configuration.getServer() + ":"
                        + Configuration.getPort() + "/" + Configuration.getDatabase(),
                Configuration.getUser(), Configuration.getPassword())) {
            try (PreparedStatement st = connection.prepareStatement(sqlGetMovies)) {
                ResultSet rsMovies = st.executeQuery();
                while (rsMovies.next()) {
                    MovieDatabase movie = new MovieDatabase(rsMovies.getInt("id"), rsMovies.getString("title"), rsMovies.getString("director"), rsMovies.getString("actors"), rsMovies.getDouble("avgRating"), rsMovies.getString("publishingDate"));
                    movies.add(movie);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return movies;
    }

    @Override
    public void setAVG(double avgValue, int movieID) {

    }
}
