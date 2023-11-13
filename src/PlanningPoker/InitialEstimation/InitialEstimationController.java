package PlanningPoker.InitialEstimation;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InitialEstimationController {

    @FXML
    private Button btnNext;

    @FXML
    void openHLEstimation(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/PlanningPoker/HLEstimation/Screen4HLEstimationDiscussion.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("High Level Estimation");
        stage.setScene(scene);
        stage.show();
    }

}
