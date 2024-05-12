module com.example.sync {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.example.sync to javafx.fxml;
    exports com.example.sync;
}