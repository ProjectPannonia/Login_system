package Controller.SettingsPage;

import Database.RetrieveAllUser;
import UserObjects.User;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class SettingsScreenController {
    @FXML
    TextField first_name,last_name,zip_code,city,street,email,user_name,password;
    RetrieveAllUser retrieveAllUser = new RetrieveAllUser();
    ArrayList<User> users = retrieveAllUser.getAllUser();

}
