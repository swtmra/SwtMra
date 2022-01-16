package com.example.swtmra;
import application.MRA_Application;
import dbadapter.MovieDatabase;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = {"/moviesOverview"}, name = "MoviesOverviewServlet")
public class MoviesOverview extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<MovieDatabase> movies = null;
        try {
            movies = new MRA_Application().forwardBrowseMovies();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.setAttribute("movies", movies);
        request.getRequestDispatcher("MoviesOverviewWebpage.jsp").forward(request, response);

    }
}
