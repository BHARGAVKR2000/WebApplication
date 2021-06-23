package com.java.Servlets;

import com.java.utility.DBConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "userServlet", value = "/userLogin")
public class UserLogin extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                RequestDispatcher rd = request.getRequestDispatcher("UserHome.jsp");
                rd.include(request, response);
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("Alert","true");
                response.sendRedirect("index.jsp");
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}
