package com.example.javafxgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader parentContainer = new FXMLLoader(getClass().getResource("SideMenu.fxml"));
        Scene scene = new Scene();
        stage.setScene(scene);
        stage.show();
    }
}
