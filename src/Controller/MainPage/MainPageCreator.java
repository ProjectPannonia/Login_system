package Controller.MainPage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageCreator {


    public void showScreen() {

        Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("Design/mainscreen.fxml"));
            Stage stage = new Stage();
            stage.setTitle("This is the program main screen!");
            stage.setScene(new Scene(root,600,600));
            stage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
