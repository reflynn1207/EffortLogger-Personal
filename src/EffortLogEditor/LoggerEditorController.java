package EffortLogEditor;

import java.net.URL;
import java.util.ResourceBundle;

import Definitions.definitions;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class LoggerEditorController implements Initializable{

    @FXML
    private Button clearEffortLog;

    @FXML
    private ChoiceBox<String> projectList;

    @FXML
    private ChoiceBox<String> logEntry;

    @FXML
    private ChoiceBox<String> effortCategoryDropDown;

    @FXML
    private ChoiceBox<String> lifeCycleDropDown;

    @FXML
    private ChoiceBox<String> planDropDown;

    @FXML
    void btnClearEffortLog(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/EffortLogEditor/Delete/DeleteEffortLog.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();

            stage.setTitle("Delete Entire Effort Log Requested");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            System.out.println("Can't load new window");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        projectList.getItems().addAll(definitions.projectNames);
        logEntry.getItems().addAll(definitions.test);
        effortCategoryDropDown.getItems().addAll(definitions.effortCategory);
        lifeCycleDropDown.getItems().addAll(definitions.lifeCycle);
        planDropDown.getItems().addAll(definitions.plans);
    }

}
