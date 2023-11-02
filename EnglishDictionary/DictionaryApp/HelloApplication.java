package DictionaryApp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("./view/hello-view.fxml"));
        primaryStage.setTitle("FXML Example");
        primaryStage.setScene(new Scene(root, 748, 542));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}