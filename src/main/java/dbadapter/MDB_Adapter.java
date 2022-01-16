package dbadapter;

import interfaces.IMovieDatabase;


import java.sql.*;
import java.sql.Date;

public class MDB_Adapter implements IMovieDatabase {

    @Override
    public boolean addingMovie(String title, String director, String actors, Date publishingDate) {
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
                ps.setDate(3, publishingDate);
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
    public boolean movieExists(String title, String director, Date publishingDate) {
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
                ps.setDate(3, publishingDate);
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

    @Override
    public void setAVG(double avgValue, int movieID) {

    }
}
