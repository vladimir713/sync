package com.example.sync;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
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

    final FileChooser fileChooser = new FileChooser();
    private Desktop desktop = Desktop.getDesktop();

    Logger LOG = Logger.getLogger(HelloController.class.getName());
    @FXML
    protected void onOpenFileButton() {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            openFile(file);
        }
    }

    private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, "Ошибка ввода-вывода", ex);
        }
    }
}