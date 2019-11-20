package Controller.SettingsPage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SettingsScreenCreator {

    public void showScreen() {

        Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("Design/settings_page.fxml"));
            Stage stage = new Stage();
            stage.setTitle("This is the program settings screen!");
            stage.setScene(new Scene(root,600,600));
            stage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
