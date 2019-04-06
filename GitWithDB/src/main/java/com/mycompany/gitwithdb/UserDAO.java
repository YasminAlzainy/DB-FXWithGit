package com.mycompany.gitwithdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author yasmin
 */
public class UserDAO {

    private DataSource dataSource = null;
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private boolean flag = false;

    public UserDAO() {
        try {
            dataSource = DBProperties.getMySQLDataSource();
            connection = dataSource.getConnection();
            String query = "select * from user";
            preparedStatement = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User newUser(User user) {
        return null;
    }

    public User updateUser() {
        return null;
    }

    public User deleteUser() {
        return null;
    }

    public User firstUser() {
        User user = null;
        try {
            if (resultSet.first()) {
                user = new User();
                user.setId(resultSet.getInt("ID"));
                user.setFirstName(resultSet.getString("First_Name"));
                user.setMidName(resultSet.getString("Mid_Name"));
                user.setLastName(resultSet.getString("Last_Name"));
                user.setEmail(resultSet.getString("Email"));
                user.setPhone(resultSet.getInt("Phone"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public User lastUser() {
        User user = null;
        try {
            if (resultSet.last()) {
                user = new User();
                user.setId(resultSet.getInt("ID"));
                user.setFirstName(resultSet.getString("First_Name"));
                user.setMidName(resultSet.getString("Mid_Name"));
                user.setLastName(resultSet.getString("Last_Name"));
                user.setEmail(resultSet.getString("Email"));
                user.setPhone(resultSet.getInt("Phone"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public User prevUser() {
        User user = null;
        try {
            if (resultSet.previous()) {
                user = new User();
                user.setId(resultSet.getInt("ID"));
                user.setFirstName(resultSet.getString("First_Name"));
                user.setMidName(resultSet.getString("Mid_Name"));
                user.setLastName(resultSet.getString("Last_Name"));
                user.setEmail(resultSet.getString("Email"));
                user.setPhone(resultSet.getInt("Phone"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public User nextUser() {
        User user = null;
        try {
            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("ID"));
                user.setFirstName(resultSet.getString("First_Name"));
                user.setMidName(resultSet.getString("Mid_Name"));
                user.setLastName(resultSet.getString("Last_Name"));
                user.setEmail(resultSet.getString("Email"));
                user.setPhone(resultSet.getInt("Phone"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }

}
