package com.mycompany.gitwithdb;

import com.mycompany.gitgui.GUIBase;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author yasmin
 */
public class UserViewer extends Application {

    @Override
    public void start(Stage primaryStage) {

        //Yasmin Code
        
        
        //Noran Code 
        
    int personID;
    boolean insertFlag = false;
    String firstName, middleName, lastName, email, phone;

        GUIBase root = new GUIBase();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
         root.newbtn.setOnAction((event) -> {
             UserDAO k= new UserDAO();
             User firstUser = k.firstUser();
             root.idtxtfield.clear();
             root.fnametxtfield.clear();
             root.mnametxtfield.clear();
             root.lnametxtfield.clear();
             root.emailtxtfield.clear();
             root.phonetxtfield.clear();
             firstUser.getFirstName();
             firstUser.getEmail();
             firstUser.getLastName();
             firstUser.getPhone();
            });


        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
