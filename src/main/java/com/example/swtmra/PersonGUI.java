package com.example.swtmra;

import application.MRA_Application;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet()
public class PersonGUI extends HttpServlet {
    private static final long serialVersionUID = 1L;

    List<String> errors ;
    int age;
    String username;
    String email;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("register.ftl").forward(request, response);

        if (request.getParameter("action").equals("registerUser")) {
            errors = new ArrayList<>();
            age = Integer.parseInt(request.getParameter("age"));
            username = request.getParameter("uname");
            email = request.getParameter("email");

            request.setAttribute("uname", username);
            request.setAttribute("email", email);

            boolean usernameExists = new MRA_Application().usernameExists(username);
            if (usernameExists){
                errors.add("Username is already used");
            }
            if(age < 18) {
                errors.add("You have to be 18 years old or older to register");
            }

            if(errors.isEmpty()) {
                new MRA_Application().registerUser(email, age, username);
                request.getRequestDispatcher("registered_user.jsp").forward(request, response);
            }else {
                request.setAttribute("errors", errors);
                request.getRequestDispatcher("reg_fail.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
