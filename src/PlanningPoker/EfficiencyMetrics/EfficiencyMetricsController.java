package PlanningPoker.EfficiencyMetrics;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class EfficiencyMetricsController implements Initializable {

    @FXML
    private ChoiceBox<Integer> myChoiceBox;
    
    @FXML
    private Button btnNext;

    private Integer[] metrics = {1,2,3,4,5};

    @FXML
    void openUSUpdate(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/PlanningPoker/USUpdate/Screen6USUpdate.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("User Story Update");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myChoiceBox.getItems().addAll(metrics);
    }

}
