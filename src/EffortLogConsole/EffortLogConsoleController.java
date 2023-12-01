package EffortLogConsole;

import java.io.IOException;
import java.util.ResourceBundle;

import Definitions.definitions;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.URL;

// Controller class for the Effort Log Console
public class EffortLogConsoleController implements Initializable {

    // FXML variables for the Effort Log Console
    @FXML
    private Button btnLogEditor;

    @FXML
    private Button btnDefectLogConsole;

    @FXML
    private Button btnStartActivity;

    @FXML
    private Button btnstopActivity;

    @FXML
    private Label clockText;

    @FXML
    private Label labelMode;

    @FXML
    private Button btnPlanPoker;

    @FXML
    private ChoiceBox<String> projectName;

    @FXML
    private ChoiceBox<String> lifeCycle;

    @FXML
    private ChoiceBox<String> category;

    @FXML
    private ChoiceBox<String> plan;

    // Method to handle the open log editor button
    @FXML
    void openLogEditor(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/EffortLogEditor/EffortLoggerEditorScene.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Effort Log Editor");
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle the open defect log console button
    @FXML
    void openDefectLogConsole(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/DefectConsole/DefectConsole.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Defect Log Console");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openPlanPoker(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/PlanningPoker/UserStory/UserStory1.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("User Story");
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle the start activity button
    @FXML
    void startActivity(ActionEvent event) {
        clockText.setStyle("-fx-background-color: green");
        clockText.setText("Clock is Running");
    }

    // Method to handle the stop activity button
    @FXML
    void stopActivity(ActionEvent event) {
        clockText.setStyle("-fx-background-color: red");
        clockText.setText("Clock is Stopped");
    }

    // Method to set the user input
    @FXML

    public void setUserInput(String username) {
        // Use the username to customize the message
        if (username.equals("developer")) {
            labelMode.setText("You are part of the developer community");
        } else if (username.equals("supervisor")) {
            labelMode.setText("You are part of the supervisor community");
        } else if (username.equals("engineer")) {
            labelMode.setText("You are part of the engineer community");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        projectName.getItems().addAll(definitions.projectNames);
        lifeCycle.getItems().addAll(definitions.lifeCycle);
        category.getItems().addAll(definitions.effortCategory);
        plan.getItems().addAll(definitions.plans);
    }

}
