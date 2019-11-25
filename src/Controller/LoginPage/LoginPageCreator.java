package Controller.LoginPage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageCreator {


    public void createLoginPage(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Controller/LoginPage/login_page.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Registration page");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
