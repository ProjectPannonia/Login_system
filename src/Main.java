import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) throws  Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Controller/LoginPage/login_page.fxml"));
        primaryStage.setTitle("Registration page");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        //((Node)(event.getSource())).getScene().getWindow().hide();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
