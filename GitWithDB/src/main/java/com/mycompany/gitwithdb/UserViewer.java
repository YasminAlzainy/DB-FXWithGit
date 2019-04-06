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
 UserDAO user = new UserDAO();
        GUIBase root = new GUIBase();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

        root.clearbutton.setOnAction((event) -> {

            User firstUser = user.firstUser();
            root.idtxtfield.clear();
            root.fnametxtfield.clear();
            root.mnametxtfield.clear();
            root.lnametxtfield.clear();
            root.emailtxtfield.clear();
            root.phonetxtfield.clear();
            firstUser.getFirstName();
            firstUser.getEmail();
            firstUser.getLastName();
            firstUser.getMidName();
            firstUser.getPhone();
            firstUser.getId();

        });
        
     /*   root.deletebutton.setOnAction((event) -> {

            User dUser = user.deleteUser();
            root.idtxtfield.clear();
            root.fnametxtfield.clear();
            root.mnametxtfield.clear();
            root.lnametxtfield.clear();
            root.emailtxtfield.clear();
            root.phonetxtfield.clear();
            dUser.getFirstName();
            dUser.getEmail();
           dUser.getLastName();
            dUser.getMidName();
           dUser.getPhone();
           dUser.getId();

        });*/

        /*  root.newbtn.setOnAction((event) -> {
            UserDAO k = new UserDAO();
            User newUser= k.newUser();
            root.idtxtfield.clear();
            root.fnametxtfield.clear();
            root.mnametxtfield.clear();
            root.lnametxtfield.clear();
            root.emailtxtfield.clear();
            root.phonetxtfield.clear();
            newUser.getFirstName();
            newUser.getEmail();
            newUser.getLastName();
            newUser.getMidName();
            newUser.getPhone();
            newUser.getId();

        });*/
        root.lastbutton.setOnAction((event) -> {

            User lastUser = user.lastUser();
            root.idtxtfield.setText(""+lastUser.getId());
            root.fnametxtfield.setText(""+lastUser.getFirstName());
            root.mnametxtfield.setText(""+lastUser.getMidName());
            root.lnametxtfield.setText(""+ lastUser.getLastName());
            root.emailtxtfield.setText(""+ lastUser.getEmail());
            root.phonetxtfield.setText(""+lastUser.getPhone());

        });

        root.nextbutton.setOnAction((event) -> {

            User nextUser = user.nextUser();
          
            root.idtxtfield.setText(""+nextUser.getId());
            root.fnametxtfield.setText(""+nextUser.getFirstName());
            root.mnametxtfield.setText(""+nextUser.getMidName());
            root.lnametxtfield.setText(""+nextUser.getLastName());
            root.emailtxtfield.setText(""+ nextUser.getEmail());
            root.phonetxtfield.setText(""+nextUser.getPhone());


        });

        root.previousbutton.setOnAction((event) -> {

            User prevUser = user.prevUser();
          root.idtxtfield.setText(""+prevUser.getId());
            root.fnametxtfield.setText(""+prevUser.getFirstName());
            root.mnametxtfield.setText(""+prevUser.getMidName());
            root.lnametxtfield.setText(""+prevUser.getLastName());
            root.emailtxtfield.setText(""+ prevUser.getEmail());
            root.phonetxtfield.setText(""+prevUser.getPhone());


        });

        /*  Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
