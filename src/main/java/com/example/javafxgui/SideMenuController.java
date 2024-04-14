package com.example.javafxgui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class SideMenuController {

    @FXML

    AnchorPane HomePage;

//    @FXML
//    Button btnMenu;

    @FXML
    BorderPane borderpane;

    @FXML
    protected void changeToHomeBtn() {
            borderpane.setCenter(HomePage);
        }

    @FXML
    protected void cnangetoPage1() throws IOException {
        FXMLLoader page1 = new FXMLLoader(getClass().getResource("page1.fxml"));
        borderpane.setCenter(page1.load());
    }

    @FXML
    protected void cnangetoPage2() throws IOException {
        FXMLLoader page2 = new FXMLLoader(getClass().getResource("Page2.fxml"));
        borderpane.setCenter(page2.load());
    }


}
