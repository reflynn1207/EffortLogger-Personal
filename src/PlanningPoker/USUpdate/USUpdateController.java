package PlanningPoker.USUpdate;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class USUpdateController {

    @FXML
    private Button btnNext;

    @FXML
    private Button svButton;

    @FXML
    private Label nsLabel;  

    @FXML
    void openSaveResults(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/PlanningPoker/SaveResults/Screen7Exit.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Save Results");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void SaveResults(ActionEvent event) throws IOException{
        nsLabel.setText("SAVED !");
        nsLabel.setStyle("-fx-text-fill: green;");
    }

}
