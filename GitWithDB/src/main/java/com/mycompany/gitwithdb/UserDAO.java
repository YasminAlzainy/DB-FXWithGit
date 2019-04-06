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
    private User user;

    public UserDAO() {
        try {
            user = new User();
            dataSource = DBProperties.getMySQLDataSource();
            connection = dataSource.getConnection();
            String query = "select * from user";
            preparedStatement = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User newUser() {
        return null;
    }

    public User updateUser() {
        return null;
    }

    public User deleteUser() {
        return null;
    }

    public User firstUser() {
        return null;
    }

    public User lastUser() {
        return null;
    }

    public User prevUser() {
        return null;
    }

    public User nextUser() {
        return null;
    }

}
