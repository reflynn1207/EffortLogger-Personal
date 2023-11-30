package PlanningPoker.InitialEstimation;

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

public class InitialEstimationController implements Initializable {

    @FXML
    private Button btnNext;

    @FXML
    private ChoiceBox<String> choiceBox1;

    @FXML
    private ChoiceBox<String> choiceBox2;

    @FXML
    private ChoiceBox<String> choiceBox3;

    private String[] difficulty = {"Easy", "Medium", "Hard"};
    private String[] depend = {"YES" , "NO"};
    private String[] skills = {"Coding" , "Communication", "GUI Design", "Collaboration", "Other"};


    @FXML
    void openHLEstimation(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/PlanningPoker/HLEstimation/Screen4HLEstimationDiscussion.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("High Level Estimation");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceBox1.getItems().addAll(difficulty);
        choiceBox2.getItems().addAll(depend);
        choiceBox3.getItems().addAll(skills);
    }

}
