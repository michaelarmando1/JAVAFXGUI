module com.example.javafxgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafxgui to javafx.fxml;
    exports com.example.javafxgui;
}