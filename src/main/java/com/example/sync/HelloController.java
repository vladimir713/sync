package com.example.sync;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.io.File;
import java.util.logging.Logger;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Stage stage;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected TextField path;
    final FileChooser fileChooser = new FileChooser();
//    private Desktop desktop = Desktop.getDesktop();

    Logger LOG = Logger.getLogger(HelloController.class.getName());
    @FXML
    protected void onOpenFileButton() {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            openFile(file);
        }
    }

    private void openFile(File file) {
        path.setText(file.getAbsolutePath());
//            desktop.open(file);
    }
}