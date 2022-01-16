package dbadapter;

import interfaces.IMovieDatabase;


import java.sql.*;
import java.sql.Date;

public class MDB_Adapter implements IMovieDatabase {

    // Will be done by the Application before forwarding the addRequest to DB.



    @Override
    public boolean addingMovie(String title, int director_id, int actor_id, Date publishing_date) {
        String query =
                "insert into movies(mid, title, actor_id, director_id, publishing_date) values(?,?,?,?,?)";
        try (Connection connection = DriverManager
                .getConnection(
                        "jdbc:" + Configuration.getType() + "://" + Configuration.getServer() + ":"
                                + Configuration.getPort() + "/" + Configuration.getDatabase(),
                        Configuration.getUser(), Configuration.getPassword())) {

            try (PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setString(1, title);
                ps.setInt(2, actor_id);
                ps.setInt(3, director_id);
                ps.setDate(4, publishing_date);
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
    public void setAVG(double avgValue, int movieID) {

    }
}
