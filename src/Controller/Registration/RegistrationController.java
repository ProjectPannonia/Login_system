package Controller.Registration;

import Alerts.CellsAreEmpty;
import Alerts.UsernameAlreadyInUse;
import Checkers.DuplicateChecker;
import Checkers.Emptycheck;
import Database.Register;
import Database.RetrieveAllUser;
import UserObjects.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class RegistrationController {
    @FXML
    TextField vezeteknev_tb, keresztnev_tb, telepules_tb,
            iranyitoszam_tb,utcanev_tb,kozteruletjelleg_tb,email_tb, loginName_tb,loginPassword_tb;
    @FXML
    Button regisztracio_bt;
    public void utca(ActionEvent e){
        utcanev_tb.setText(utcanev_tb.getText() + kozteruletjelleg_tb.getText());
    }


    public void registration(ActionEvent e)
    {
        Emptycheck emptycheck = new Emptycheck();
        DuplicateChecker duplicateChecker = new DuplicateChecker();
        CellsAreEmpty cellsAreEmpty = new CellsAreEmpty();
        Register register = new Register();
        UsernameAlreadyInUse usernameAlreadyInUse = new UsernameAlreadyInUse();
        RetrieveAllUser retrieveAllUser = new RetrieveAllUser();
        ArrayList<User> usersInDatabase = retrieveAllUser.getAllUser();

        boolean emptyCell;
        boolean notDuplicated;

        if (!vezeteknev_tb.getText().isEmpty() && !keresztnev_tb.getText().isEmpty() &&
                !iranyitoszam_tb.getText().isEmpty() && !telepules_tb.getText().isEmpty() &&
                !utcanev_tb.getText().isEmpty() && !email_tb.getText().isEmpty() &&
                !loginName_tb.getText().isEmpty() && !loginPassword_tb.getText().isEmpty()) {

            String firstName = vezeteknev_tb.getText();
            String lastName = keresztnev_tb.getText();
            Integer zip = Integer.parseInt(iranyitoszam_tb.getText());
            String city = telepules_tb.getText();
            String streetName = utcanev_tb.getText();
            String email = email_tb.getText();
            String loginName = loginName_tb.getText();
            String loginPassword = loginPassword_tb.getText();

            User user = new User(
                    firstName,
                    lastName,
                    zip,
                    city,
                    streetName,
                    email,
                    loginName,
                    loginPassword);

            //emptyCell = emptycheck.isItEmptyString(user);
            notDuplicated = duplicateChecker.duplicateCheck(user);
                if (!notDuplicated){
                    register.SendToDatabase(user);
                }else {
                    usernameAlreadyInUse.SendAlert();
                }

        }else{
            cellsAreEmpty.SendAlert();
        }

        }
}
