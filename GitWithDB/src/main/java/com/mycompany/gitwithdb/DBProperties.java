package com.mycompany.gitwithdb;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

public class DBProperties {

    private final String url = "jdbc:mysql://localhost:3306/sys";
    private final String user = "root";
    private final String password = "root";

    public DBProperties() {
        setMySQLDataSource();
        testDataSource();
    }

    private void setMySQLDataSource() {
        Properties properties = new Properties();
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream("dataBase.properties");
            properties.setProperty("MYSQL_URL", url);
            properties.setProperty("MYSQL_NAME", user);
            properties.setProperty("MYSQL_PASS", password);
            properties.store(outputStream, null);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    public static DataSource getMySQLDataSource() {

        Properties properties = new Properties();
        FileInputStream inputStream = null;
        MysqlDataSource mysqlDataSource = null;
        try {
            inputStream = new FileInputStream("dataBase.properties");
            properties.load(inputStream);
            mysqlDataSource = new MysqlConnectionPoolDataSource();

            mysqlDataSource.setURL(properties.getProperty("MYSQL_URL"));
            mysqlDataSource.setUser(properties.getProperty("MYSQL_NAME"));
            mysqlDataSource.setPassword(properties.getProperty("MYSQL_PASS"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return (DataSource) mysqlDataSource;
    }
    private void testDataSource() {
        DataSource dataSource = DBProperties.getMySQLDataSource();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM user");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("ID") + " Name: " + resultSet.getString("First_Name") + " Phone: " + resultSet.getInt("Phone"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

    }
    public static void main(String[] args) {
        new DBProperties();
    }

}
