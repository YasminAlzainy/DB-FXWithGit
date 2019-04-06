package com.mycompany.gitgui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class GUIBase extends SplitPane {

    protected final AnchorPane anchorPane;
    protected final Label idlabel;
    protected final Label fnamelabel;
    protected final Label mnamelabel;
    protected final Label lnamelabel;
    protected final Label emaillabel;
    protected final Label phonelabel;
    protected final TextField idtxtfield;
    protected final TextField fnametxtfield;
    protected final TextField mnametxtfield;
    protected final TextField lnametxtfield;
    protected final TextField emailtxtfield;
    protected final TextField phonetxtfield;
    protected final AnchorPane anchorPane0;
    protected final Button newbtn;
    protected final Button updatebtn;
    protected final Button deletebtn;
    protected final Button firstbtn;
    protected final Button lastbtn;
    protected final Button clearbtn;

    public GUIBase() {

        anchorPane = new AnchorPane();
        idlabel = new Label();
        fnamelabel = new Label();
        mnamelabel = new Label();
        lnamelabel = new Label();
        emaillabel = new Label();
        phonelabel = new Label();
        idtxtfield = new TextField();
        fnametxtfield = new TextField();
        mnametxtfield = new TextField();
        lnametxtfield = new TextField();
        emailtxtfield = new TextField();
        phonetxtfield = new TextField();
        anchorPane0 = new AnchorPane();
        newbtn = new Button();
        updatebtn = new Button();
        deletebtn = new Button();
        firstbtn = new Button();
        lastbtn = new Button();
        clearbtn = new Button();

        setDividerPositions(0.8165829145728644);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setOrientation(javafx.geometry.Orientation.VERTICAL);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(244.0);
        anchorPane.setPrefWidth(598.0);

        idlabel.setLayoutX(29.0);
        idlabel.setLayoutY(30.0);
        idlabel.setText("ID");

        fnamelabel.setLayoutX(21.0);
        fnamelabel.setLayoutY(68.0);
        fnamelabel.setText("First Name");

        mnamelabel.setLayoutX(21.0);
        mnamelabel.setLayoutY(103.0);
        mnamelabel.setText("Mid Name");

        lnamelabel.setLayoutX(21.0);
        lnamelabel.setLayoutY(136.0);
        lnamelabel.setText("Last Name");

        emaillabel.setLayoutX(21.0);
        emaillabel.setLayoutY(172.0);
        emaillabel.setText("Email");

        phonelabel.setLayoutX(21.0);
        phonelabel.setLayoutY(209.0);
        phonelabel.setText("Phone");

        idtxtfield.setId("txtid");
        idtxtfield.setLayoutX(91.0);
        idtxtfield.setLayoutY(26.0);

        fnametxtfield.setId("fnameid");
        fnametxtfield.setLayoutX(91.0);
        fnametxtfield.setLayoutY(56.0);

        mnametxtfield.setId("mnameid");
        mnametxtfield.setLayoutX(91.0);
        mnametxtfield.setLayoutY(99.0);

        lnametxtfield.setId("lnameid");
        lnametxtfield.setLayoutX(91.0);
        lnametxtfield.setLayoutY(132.0);

        emailtxtfield.setId("emailid");
        emailtxtfield.setLayoutX(91.0);
        emailtxtfield.setLayoutY(168.0);

        phonetxtfield.setId("phoneid");
        phonetxtfield.setLayoutX(91.0);
        phonetxtfield.setLayoutY(205.0);

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(100.0);
        anchorPane0.setPrefWidth(160.0);

        newbtn.setId("newid");
        newbtn.setLayoutX(85.0);
        newbtn.setLayoutY(14.0);
        newbtn.setMnemonicParsing(false);
        newbtn.setText("New");

        updatebtn.setId("updateid");
        updatebtn.setLayoutX(156.0);
        updatebtn.setLayoutY(14.0);
        updatebtn.setMnemonicParsing(false);
        updatebtn.setText("Update");

        deletebtn.setId("deleteid");
        deletebtn.setLayoutX(230.0);
        deletebtn.setLayoutY(14.0);
        deletebtn.setMnemonicParsing(false);
        deletebtn.setText("Delete");

        firstbtn.setId("firstid");
        firstbtn.setLayoutX(303.0);
        firstbtn.setLayoutY(14.0);
        firstbtn.setMnemonicParsing(false);
        firstbtn.setText("First");

        lastbtn.setId("lastid");
        lastbtn.setLayoutX(363.0);
        lastbtn.setLayoutY(14.0);
        lastbtn.setMnemonicParsing(false);
        lastbtn.setText("Last");

        clearbtn.setId("clearid");
        clearbtn.setLayoutX(428.0);
        clearbtn.setLayoutY(14.0);
        clearbtn.setMnemonicParsing(false);
        clearbtn.setText("Clear");

        anchorPane.getChildren().add(idlabel);
        anchorPane.getChildren().add(fnamelabel);
        anchorPane.getChildren().add(mnamelabel);
        anchorPane.getChildren().add(lnamelabel);
        anchorPane.getChildren().add(emaillabel);
        anchorPane.getChildren().add(phonelabel);
        anchorPane.getChildren().add(idtxtfield);
        anchorPane.getChildren().add(fnametxtfield);
        anchorPane.getChildren().add(mnametxtfield);
        anchorPane.getChildren().add(lnametxtfield);
        anchorPane.getChildren().add(emailtxtfield);
        anchorPane.getChildren().add(phonetxtfield);
        getItems().add(anchorPane);
        anchorPane0.getChildren().add(newbtn);
        anchorPane0.getChildren().add(updatebtn);
        anchorPane0.getChildren().add(deletebtn);
        anchorPane0.getChildren().add(firstbtn);
        anchorPane0.getChildren().add(lastbtn);
        anchorPane0.getChildren().add(clearbtn);
        getItems().add(anchorPane0);

    }
}
