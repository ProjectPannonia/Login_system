package Controller;

import Alerts.*;
import Checkers.IsItRegistered;
import Database.TemporaryUser;
import ScreenCreator.MainPageCreator;
import UserObjects.LoggingUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginPageController {

    @FXML
    TextField userName_tb, password_tb;
    @FXML
    Button  register_bt,login_bt,login_problem_bt;

    // Event when user press the login button
    public void login(ActionEvent e) {
        MyAlert myAlert;
        boolean emptyUsername = userName_tb.getText().equals("");
        boolean emptyPassword = password_tb.getText().equals("");

        if(emptyUsername && emptyPassword){
            myAlert = new CellsAreEmpty();
            myAlert.SendAlert();
        }else if(emptyUsername || emptyPassword){
            if (emptyUsername){
                myAlert = new UserNameIsEmpty();
                myAlert.SendAlert();
            }else {
                myAlert = new PasswordIsEmpty();
                myAlert.SendAlert();
            }
        }else{
            IsItRegistered isItRegistered = new IsItRegistered();
            String userName = userName_tb.getText();
            String password = userName_tb.getText();
            LoggingUser user = new LoggingUser(userName,password);

            boolean registered = isItRegistered.isItRegistered(user);

                if(!registered){
                    MainPageCreator loggedIn = new MainPageCreator();
                    loggedIn.showScreen();
                    TemporaryUser temporaryUser = new TemporaryUser();
                    temporaryUser.SendTemporaryUser(userName);
                }else {
                  myAlert = new NotRegistered();
                  myAlert.SendAlert();
                }
            }
        }
    }
