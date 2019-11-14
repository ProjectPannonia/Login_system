package Controller;

import Alerts.EmptyCellAlert;
import Database.RetrieveDataFromDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.ArrayList;

public class LoginPageController {

    @FXML
    TextField userName_tb, password_tb;
    @FXML
    Button  register_bt,login_bt,login_problem_bt;

    // Event when user press the login button
    public void login(ActionEvent e) {
        ArrayList<User> registeredUsers;

        // Checking the username/password is empty?
        if (!userName_tb.getText().equals(null) && !password_tb.getText().equals(null)){

        // Is the username/password correct?
            boolean isRegistered = Checkers.isItRegistered.isItRegistered(
                    new LoggingUser(userName_tb.getText(),password_tb.getText()));
            if(isRegistered){
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
        }else{
            EmptyCellAlert emptyCellAlert = new EmptyCellAlert();
            emptyCellAlert.SendAlert();
        }

    }
}
