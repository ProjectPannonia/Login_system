package Controller.LoginPage;

import Alerts.*;
import Checkers.Checkers;
import Database.TemporaryUser;
import Controller.MainPage.MainPageCreator;
import UserObjects.LoggingUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginPageController {
    Alerts alerts = new Alerts();
    Checkers checkers = new Checkers();

    @FXML
    TextField userName_tb, password_tb;
    @FXML
    Button register_bt, login_bt, login_problem_bt;


    // Event when user press the login button
    public void login(ActionEvent e) {

        boolean emptyUsername = userName_tb.getText().equals("");
        boolean emptyPassword = password_tb.getText().equals("");

        if (emptyUsername && emptyPassword) {
            alerts.CellsAreEmpty();
        } else if (emptyUsername || emptyPassword) {
            if (emptyUsername) {
                alerts.UserNameIsEmpty();
            } else {
                alerts.PasswordIsEmpty();
            }
        } else {
            String userName = userName_tb.getText();
            String password = password_tb.getText();
            System.out.println(userName + " " + password);
            //LoggingUser user = new LoggingUser(userName, password);

            //boolean registered = checkers.isItRegistered(user);

            if (checkers.isItRegistered(userName,password)) {
                MainPageCreator loggedIn = new MainPageCreator();
                loggedIn.showScreen();
                TemporaryUser temporaryUser = new TemporaryUser();
                temporaryUser.SendTemporaryUser(userName);
                //((Node)(e.getSource())).getScene().getWindow();
            } else {
                alerts.NotRegistered();
            }
        }
    }
}
