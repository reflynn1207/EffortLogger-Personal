package PlanningPoker.Cards;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CardsController {

    @FXML
    private Button btnNext;

    @FXML
    private Button rtnButton;

    @FXML
    void openInitialEstimation(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/PlanningPoker/InitialEstimation/InitialEstimation3.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Initial Estimation");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void returnHome(ActionEvent event) throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("/EffortLogConsole/EffortLogConsole.fxml"));
         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         Scene scene = new Scene(root);
        stage.setTitle("Effort Log Console");
        stage.setScene(scene);
        stage.show();
    }

}
