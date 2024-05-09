module com.example.sync {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sync to javafx.fxml;
    exports com.example.sync;
}