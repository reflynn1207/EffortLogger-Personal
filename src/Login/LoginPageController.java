package Login;

import java.io.IOException;

import EffortLogConsole.EffortLogConsoleController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginPageController {

    @FXML
    private Button btnLogin;

    @FXML
    private Label errorLabel;

    @FXML
    private TextField userName;
    
    @FXML
    private PasswordField password;

    @FXML
    void userLogin(ActionEvent event) throws IOException{
        String username = userName.getText();
        if (userName.getText().equals("developer") && password.getText().equals("dev1") 
        || userName.getText().equals("supervisor") && password.getText().equals("sup2") 
        || userName.getText().equals("engineer") && password.getText().equals("engi3")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/EffortLogConsole/EffortLogConsole.fxml"));
            Parent root = loader.load();
            EffortLogConsoleController effortLogController = loader.getController();
            effortLogController.setUserInput(username);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Effort Log Console");
            stage.setScene(scene);
            stage.show();
        } else if (userName.getText().isEmpty() && password.getText().isEmpty()) {
            errorLabel.setText("Please enter a username and password");
        } else {
            errorLabel.setText("Invalid username or password");
        }

    }
}
