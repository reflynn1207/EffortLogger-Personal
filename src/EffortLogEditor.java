

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class EffortLogEditor extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage effortLogStage) {


        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("EffortLoggerEditorScene.fxml"));
            Scene scene = new Scene(root);

            effortLogStage.setTitle("Effort Log Editor");
            effortLogStage.setScene(scene);
            effortLogStage.show();
        } catch (IOException e) {
        }
        
    }
    
}