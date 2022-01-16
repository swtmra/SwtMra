package com.example.swtmra;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/moviesOverview"}, name = "MoviesOverviewServlet")
public class MoviesOverview extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.getRequestDispatcher("MoviesOverviewWebpage.jsp").forward(request, response);

    }
}
