package com.java.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection con;
    private DBConnection() {};
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?characterEncoding=latin1","root","root");
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    public static Connection getCon()
    {
        return con;
    }
}
