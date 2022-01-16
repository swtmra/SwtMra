package com.example.swtmra;

import application.MRA_Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;


@WebServlet(urlPatterns = {"/AddMovieWebPage"}, name = "addMovieServlet")
    public class AddMovie extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            if(request.getParameter("action").equals("AddMovie")) {
                String title = request.getParameter("title");
                String director = request.getParameter("title");
                String actors = request.getParameter("title");
                String publishingDate = request.getParameter("title");
                boolean add_res = new MRA_Application().forwardAddMovie(title, director, actors, publishingDate);
                if (add_res) {
                    request.setAttribute("var", "The Movie was added !");
                    request.getRequestDispatcher("showConfirmed.jsp").forward(request, response);
                } else {
                    request.setAttribute("var", "Movie adding failed !");
                    request.getRequestDispatcher("showFailed.jsp").forward(request, response);
                }
            }


                request.setAttribute("uname", request.getParameter("uname"));
            request.getRequestDispatcher("AddMovieWebpage.jsp").forward(request, response);

        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
    }

