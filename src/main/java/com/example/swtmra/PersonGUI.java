package com.example.swtmra;

import application.MRA_Application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/register"}, name="registerServlet")
public class PersonGUI extends HttpServlet {
    private static final long serialVersionUID = 1L;
    int age;
    String username;
    String email;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        if (request.getParameter("action").equals("registerUser")) {
            age = Integer.parseInt(request.getParameter("age"));
            username = request.getParameter("uname");
            email = request.getParameter("email");

            request.setAttribute("uname", username);
            request.setAttribute("email", email);


            boolean registerationStatus = new MRA_Application().registerUser(email, age, username);
            if (registerationStatus) {
                request.setAttribute("var","Registeration success");
                request.getRequestDispatcher("showConfirmed.jdp").forward(request, response);
            } else {
                request.setAttribute("var","Registeration failed. username or age isn't rigt!");
                request.getRequestDispatcher("showFailed.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
