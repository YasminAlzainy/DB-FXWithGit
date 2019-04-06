package com.mycompany.gitwithdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import propertiesTest.PropertiesTest;

public class UsersTable extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    DataSource dataSource = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    boolean flag = false;

    @Override
    public void start(Stage primaryStage) throws Exception {
        UsersGUI usersGUI = new UsersGUI(this);
        Scene scene = new Scene((Parent) usersGUI, 600, 400);
        primaryStage.setTitle("Chat Application");
        primaryStage.setScene(scene);
        primaryStage.show();

        dataSource = PropertiesTest.getMySQLDataSource();
        connection = dataSource.getConnection();
        String query = "select * from user";
        preparedStatement = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        resultSet = preparedStatement.executeQuery();

        usersGUI.newBTN.setOnAction((event) -> {
            flag = true;
            usersGUI.idTF.clear();
            usersGUI.firstNameTF.clear();
            usersGUI.midNameTF.clear();
            usersGUI.lastNameTF.clear();
            usersGUI.emailTF.clear();
            usersGUI.phoneTF.clear();
            /*
            try {
               
                

                if (true) {
                    JOptionPane.showMessageDialog(null, "Inserted!");
                } else {
                    JOptionPane.showMessageDialog(null, "Not Inserted!");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
             */
        });

        usersGUI.updateBTN.setOnAction((event) -> {

            String id = usersGUI.idTF.getText();
            String firstName = usersGUI.firstNameTF.getText();
            String midName = usersGUI.midNameTF.getText();
            String lastName = usersGUI.lastNameTF.getText();
            String email = usersGUI.emailTF.getText();
            String phone = usersGUI.phoneTF.getText();

            try {
                if (flag) {
                    resultSet.moveToInsertRow();
                    resultSet.updateInt("ID", Integer.parseInt(id));
                    resultSet.updateString("First_Name", firstName);
                    resultSet.updateString("Mid_Name", midName);
                    resultSet.updateString("Last_Name", lastName);
                    resultSet.updateString("Email", email);
                    resultSet.updateInt("Phone", Integer.parseInt(phone));
                    resultSet.insertRow();
                } else {
                    try {
                        preparedStatement = connection.prepareStatement("UPDATE user SET Phone = 33");
                        int isUpdate = preparedStatement.executeUpdate();
                        if (isUpdate == 0) {

                            System.out.println("Updated");
                        } else {
                            System.out.println("Not Updated");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        });

        usersGUI.deleteBTN.setOnAction((event) -> {
            try {

                resultSet.deleteRow();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        usersGUI.firstBTN.setOnAction((event) -> {

            try {
                if (resultSet.first()) {
                    usersGUI.idTF.setText(Integer.toString(resultSet.getInt("ID")));
                    usersGUI.firstNameTF.setText(resultSet.getString("First_Name"));
                    usersGUI.midNameTF.setText(resultSet.getString("Mid_Name"));
                    usersGUI.lastNameTF.setText(resultSet.getString("Last_Name"));
                    usersGUI.emailTF.setText(resultSet.getString("Email"));
                    usersGUI.phoneTF.setText(Integer.toString(resultSet.getInt("Phone")));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        usersGUI.prevBTN.setOnAction((event) -> {

            try {
                if (resultSet.previous()) {
                    usersGUI.idTF.setText(Integer.toString(resultSet.getInt("ID")));
                    usersGUI.firstNameTF.setText(resultSet.getString("First_Name"));
                    usersGUI.midNameTF.setText(resultSet.getString("Mid_Name"));
                    usersGUI.lastNameTF.setText(resultSet.getString("Last_Name"));
                    usersGUI.emailTF.setText(resultSet.getString("Email"));
                    usersGUI.phoneTF.setText(Integer.toString(resultSet.getInt("Phone")));
                } else {
                    JOptionPane.showMessageDialog(null, "This is the first!!");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        usersGUI.nextBTN.setOnAction((event) -> {
            try {
                if (resultSet.next()) {
                    usersGUI.idTF.setText(Integer.toString(resultSet.getInt("ID")));
                    usersGUI.firstNameTF.setText(resultSet.getString("First_Name"));
                    usersGUI.midNameTF.setText(resultSet.getString("Mid_Name"));
                    usersGUI.lastNameTF.setText(resultSet.getString("Last_Name"));
                    usersGUI.emailTF.setText(resultSet.getString("Email"));
                    usersGUI.phoneTF.setText(Integer.toString(resultSet.getInt("Phone")));
                } else {
                    JOptionPane.showMessageDialog(null, "This is the last!!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        usersGUI.lastBTN.setOnAction((event) -> {
            try {
                if (resultSet.last()) {
                    usersGUI.idTF.setText(Integer.toString(resultSet.getInt("ID")));
                    usersGUI.firstNameTF.setText(resultSet.getString("First_Name"));
                    usersGUI.midNameTF.setText(resultSet.getString("Mid_Name"));
                    usersGUI.lastNameTF.setText(resultSet.getString("Last_Name"));
                    usersGUI.emailTF.setText(resultSet.getString("Email"));
                    usersGUI.phoneTF.setText(Integer.toString(resultSet.getInt("Phone")));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
    }

}
