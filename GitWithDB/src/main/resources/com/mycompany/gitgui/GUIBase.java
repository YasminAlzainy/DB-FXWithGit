package com.mycompany.gitgui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public  class GUIBase extends SplitPane {

    public final AnchorPane anchorPane;
    public final Label idl;
    public final Label fnamel;
    public final Label mnamel;
    public final Label lnamel;
  public final Label emaill;
    public final Label phonel;
    public final TextField lnametxtfield;
    public final TextField fnametxtfield;
    public final TextField idtxtfield;
    public final TextField emailtxtfield;
    public final TextField phonetxtfield;
    public final TextField mnametxtfield;
    public final AnchorPane anchorPane0;
    public final Button idbutton;
    public final Button updatebutton;
    public final Button deletebutton;
    public final Button firstbutton;
    public final Button lastbutton;
    public final Button clearbutton;
    public final Button nextbutton;
    public final Button previousbutton;

    public GUIBase() {

        anchorPane = new AnchorPane();
        idl = new Label();
        fnamel = new Label();
        mnamel = new Label();
        lnamel = new Label();
        emaill = new Label();
        phonel = new Label();
        lnametxtfield = new TextField();
        fnametxtfield = new TextField();
        idtxtfield = new TextField();
        emailtxtfield = new TextField();
        phonetxtfield = new TextField();
        mnametxtfield = new TextField();
        anchorPane0 = new AnchorPane();
        idbutton = new Button();
        updatebutton = new Button();
        deletebutton = new Button();
        firstbutton = new Button();
        lastbutton = new Button();
        clearbutton = new Button();
        nextbutton = new Button();
        previousbutton = new Button();

        setDividerPositions(0.8165829145728644);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setOrientation(javafx.geometry.Orientation.VERTICAL);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        anchorPane.setId("previousbtn");
        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(244.0);
        anchorPane.setPrefWidth(598.0);

        idl.setLayoutX(29.0);
        idl.setLayoutY(30.0);
        idl.setText("ID");

        fnamel.setLayoutX(21.0);
        fnamel.setLayoutY(68.0);
        fnamel.setText("First Name");

        mnamel.setLayoutX(21.0);
        mnamel.setLayoutY(103.0);
        mnamel.setText("Mid Name");

        lnamel.setLayoutX(21.0);
        lnamel.setLayoutY(136.0);
        lnamel.setText("Last Name");

        emaill.setLayoutX(21.0);
        emaill.setLayoutY(172.0);
        emaill.setText("Email");

        phonel.setLayoutX(21.0);
        phonel.setLayoutY(209.0);
        phonel.setText("Phone");

        lnametxtfield.setId("txtid");
        lnametxtfield.setLayoutX(91.0);
        lnametxtfield.setLayoutY(26.0);

        fnametxtfield.setId("fnameid");
        fnametxtfield.setLayoutX(91.0);
        fnametxtfield.setLayoutY(56.0);

        idtxtfield.setId("mnameid");
        idtxtfield.setLayoutX(91.0);
        idtxtfield.setLayoutY(99.0);

        emailtxtfield.setId("lnameid");
        emailtxtfield.setLayoutX(91.0);
        emailtxtfield.setLayoutY(132.0);

        phonetxtfield.setId("emailid");
        phonetxtfield.setLayoutX(91.0);
        phonetxtfield.setLayoutY(168.0);

        mnametxtfield.setId("phoneid");
        mnametxtfield.setLayoutX(91.0);
        mnametxtfield.setLayoutY(205.0);

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(100.0);
        anchorPane0.setPrefWidth(160.0);

        idbutton.setId("newid");
        idbutton.setLayoutX(85.0);
        idbutton.setLayoutY(14.0);
        idbutton.setMnemonicParsing(false);
        idbutton.setText("New");

        updatebutton.setId("updateid");
        updatebutton.setLayoutX(156.0);
        updatebutton.setLayoutY(14.0);
        updatebutton.setMnemonicParsing(false);
        updatebutton.setText("Update");

        deletebutton.setId("deleteid");
        deletebutton.setLayoutX(230.0);
        deletebutton.setLayoutY(14.0);
        deletebutton.setMnemonicParsing(false);
        deletebutton.setText("Delete");

        firstbutton.setId("firstid");
        firstbutton.setLayoutX(303.0);
        firstbutton.setLayoutY(14.0);
        firstbutton.setMnemonicParsing(false);
        firstbutton.setText("First");

        lastbutton.setId("lastid");
        lastbutton.setLayoutX(363.0);
        lastbutton.setLayoutY(14.0);
        lastbutton.setMnemonicParsing(false);
        lastbutton.setText("Last");

        clearbutton.setId("clearid");
        clearbutton.setLayoutX(419.0);
        clearbutton.setLayoutY(14.0);
        clearbutton.setMnemonicParsing(false);
        clearbutton.setText("Clear");

        nextbutton.setId("nextbtn");
        nextbutton.setLayoutX(480.0);
        nextbutton.setLayoutY(14.0);
        nextbutton.setMnemonicParsing(false);
        nextbutton.setText("next");

        previousbutton.setId("previousbtn");
        previousbutton.setLayoutX(532.0);
        previousbutton.setLayoutY(14.0);
        previousbutton.setMnemonicParsing(false);
        previousbutton.setText("previous");

        anchorPane.getChildren().add(idl);
        anchorPane.getChildren().add(fnamel);
        anchorPane.getChildren().add(mnamel);
        anchorPane.getChildren().add(lnamel);
        anchorPane.getChildren().add(emaill);
        anchorPane.getChildren().add(phonel);
        anchorPane.getChildren().add(lnametxtfield);
        anchorPane.getChildren().add(fnametxtfield);
        anchorPane.getChildren().add(idtxtfield);
        anchorPane.getChildren().add(emailtxtfield);
        anchorPane.getChildren().add(phonetxtfield);
        anchorPane.getChildren().add(mnametxtfield);
        getItems().add(anchorPane);
        anchorPane0.getChildren().add(idbutton);
        anchorPane0.getChildren().add(updatebutton);
        anchorPane0.getChildren().add(deletebutton);
        anchorPane0.getChildren().add(firstbutton);
        anchorPane0.getChildren().add(lastbutton);
        anchorPane0.getChildren().add(clearbutton);
        anchorPane0.getChildren().add(nextbutton);
        anchorPane0.getChildren().add(previousbutton);
        getItems().add(anchorPane0);

    }
}
