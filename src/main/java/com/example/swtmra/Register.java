package com.example.swtmra;


import application.MRA_Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet()
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    List<String> errors ;
    int age;
    String username;
    String email;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("register.ftl").forward(req, res);

        if (req.getParameter("action").equals("registerUser")) {
            errors = new ArrayList<>();
            age = Integer.parseInt(req.getParameter("age"));
            username = req.getParameter("uname");
            email = req.getParameter("email");

            req.setAttribute("uname", username);
            req.setAttribute("email", email);

            boolean usernameExists = new MRA_Application().usernameExists(username);
            if (usernameExists){
                errors.add("Username is already used");
            }
            if(age < 18) {
                errors.add("You have to be 18 years old or older to register");
            }

            if(errors.isEmpty()) {
                new MRA_Application().registerUser(email, age, username);
                req.getRequestDispatcher("registered_user.jsp").forward(req, res);
            }else {
                req.setAttribute("errors", errors);
                req.getRequestDispatcher("reg_fail.jsp").forward(req, res);
            }
        }

    }



}
