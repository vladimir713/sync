package com.example.sync;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class FrontController extends FileListController {
    @FXML
    private Label welcomeText;
    @FXML
    private Stage stage;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Результаты сравнения...");
    }
    @FXML
    protected TextArea path1;
    @FXML
    protected TextArea path2;
    @FXML
    protected Button source1Button;
    @FXML
    protected Button source2Button;
    final private DirectoryChooser directoryChooser = new DirectoryChooser();

    Logger LOG = Logger.getLogger(FrontController.class.getName());
    @FXML
    protected void onOpenFileButton1() throws IOException {
        File file = directoryChooser.showDialog(stage);
        if (file != null) {
            openDir1(file);
            List<String> pathList = outListFiles(file.getAbsolutePath());
            path1.clear();
            pathList.stream().forEach(v -> path1.appendText(v + "\n"));
        }
    }

    @FXML
    protected void onOpenFileButton2() throws IOException {
        File file = directoryChooser.showDialog(stage);
        if (file != null) {
            openDir2(file);
            List<String> pathList = outListFiles(file.getAbsolutePath());
            path2.clear();
            pathList.stream().forEach(v -> path2.appendText(v + "\n"));
        }
    }
    @FXML
    private void openDir1(File file) {
        source1Button.setText(file.getAbsolutePath());
    }
    @FXML
    private void openDir2(File file) {
        source2Button.setText(file.getAbsolutePath());
    }
}