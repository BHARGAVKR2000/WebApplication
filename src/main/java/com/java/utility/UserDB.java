package com.java.utility;

import com.java.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDB {

    private static final String SELECT_ALL_Employee = "select * from users";
    private static final String DELETE_Employee = "delete from users where id = ?;";
    private static final String UPDATE_Employee = "update from users set name=?, email=?, country=? where id=?;";



    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?characterEncoding=latin1", "root", "root");
        } catch (SQLException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        return connection;
    }




    public List<User> selectAllUsers() {


        List<User> users = new ArrayList<>();

        try {
            Connection connection = getConnection();



            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Employee);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            e.printStackTrace();;
        }
        return users;
    }

    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_Employee);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    public boolean updateUser(int id, String name, String email, String country) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_Employee);) {
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, country);
            statement.setInt(4, id);
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

}
