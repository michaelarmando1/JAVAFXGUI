package com.example.javafxgui;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Form extends Application implements EventHandler {

    TextField fname, lname, age, course, gender;

    Button submit;

    Label firstname, lastname, age_, course_description, gender_status;


    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        firstname = new Label("FirstName: ");
        lastname = new Label("LastName ");
        age_ = new Label("Age: ");
        course_description = new Label("Course Description");
        gender_status = new Label("Sex: ");

        fname = new TextField();
        lname = new TextField();
        age = new TextField();
        course = new TextField();
        gender = new TextField();

        submit = new Button("Submit");


        grid.add(new Label("Fill the Form"), 1, 1, 2, 1);  // i: Column 1, i1: Row 1, i2: Column Space(2), i3: Row Space (!)
        grid.addRow(2, firstname, fname);
        grid.addRow(3, lastname, lname);
        grid.addRow(4, age_, age);
        grid.addRow(5, course_description, course);
        grid.addRow(6, gender_status, gender);
        grid.add(submit, 1, 7, 2, 1);

       submit = new Button("Button");
       TextField textField = new TextField();
       submit.setOnAction(e -> {
           String GuiForm = textField.getText();

           GuiForm form = new GuiForm(fname.getText(), lname.getText(), age.getText(), course.getText(), gender.getText());

           try {
               saveForm(form);
           } catch (SQLException ex) {
               throw new RuntimeException(ex);
           } catch (ClassNotFoundException ex) {
               throw new RuntimeException(ex);
           }

       });


        Scene sc = new Scene(grid);
        stage.setScene(sc);
        stage.setTitle("Student's Info");

        stage.show();
    }


    public static void saveForm(GuiForm form) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String sqlQuery = "insert into club(club_name,club_manager) values (?,?)";
        String url = "jdbc:mysql://localhost:3306/footballDB?serverTimezone=UTC";
        Connection connection = DriverManager.getConnection(url, "root","Mikeokoh.157");
        PreparedStatement ps = connection.prepareStatement(sqlQuery);
        ps.setString(1, form.getfName());
        ps.setString(2, form.getlName());
        ps.setString(3, form.getAge());
        ps.setString(4, form.getCourse());
        ps.setString(5, form.getGender());
        ps.execute();
    }


    @Override
    public void handle(Event event) {
        if (event.getSource().equals((submit))) {
            System.out.println("Button Clicked");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}


