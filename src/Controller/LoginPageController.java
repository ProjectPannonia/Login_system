package Controller;

import Alerts.EmptyCellAlert;
import Database.RetrieveDataFromDatabase;
import ScreenCreator.CreateMainScreen;
import ScreenCreator.CreateScreen;
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
                CreateScreen createMain = new CreateMainScreen();
                createMain.showScreen();
            }
        }else{
            EmptyCellAlert emptyCellAlert = new EmptyCellAlert();
            emptyCellAlert.SendAlert();
        }

    }
}
