package com.java.Servlets;


import com.java.utility.UserDB;

import java.sql.Connection;
import java.sql.PreparedStatement;


import javax.servlet.RequestDispatcher;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addUser")
public class AddUser extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        Connection conn = UserDB.getConnection();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users(name,email,country)VALUES(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, country);
            int rowsInserted = ps.executeUpdate();
            if(rowsInserted >= 1) {
                RequestDispatcher rd = request.getRequestDispatcher("user-form.jsp");
                rd.include(request,response);
            }


        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
