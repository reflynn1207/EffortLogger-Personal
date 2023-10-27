import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage effortLogStage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/EffortLogConsole/EffortLogConsole.fxml"));
            Scene scene = new Scene(root);

            effortLogStage.setTitle("Effort Log Console");
            effortLogStage.setScene(scene);
            effortLogStage.show();
        } catch (IOException e) {
        }
        
    }    
}