package org.loginservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        if (LoginDao.validate(name, pass)) {
            request.getRequestDispatcher("userLogged.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("invalidLogin.jsp").forward(request, response);
        }
    }
}
