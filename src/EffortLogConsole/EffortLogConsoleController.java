package EffortLogConsole;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class EffortLogConsoleController {

    @FXML
    private Button btnLogEditor;

    @FXML
    private Button btnStartActivity;

    @FXML
    private Button btnstopActivity;

    @FXML
    private Label clockText;

    @FXML
    void openLogEditor(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/EffortLogEditor/EffortLoggerEditorScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Effort Log Editor");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void startActivity(ActionEvent event) {
        clockText.setStyle("-fx-background-color: green");
        clockText.setText("Clock is Running");
    }

    @FXML
    void stopActivity(ActionEvent event) {
        clockText.setStyle("-fx-background-color: red");
        clockText.setText("Clock is Stopped");
    }

}
