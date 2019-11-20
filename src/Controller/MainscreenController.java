package Controller;

import Database.RetrieveTemporaryUser;
import ScreenCreator.SettingsScreenCreator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainscreenController {
    RetrieveTemporaryUser retrieveTemporaryUser = new RetrieveTemporaryUser();
    String actualUser = retrieveTemporaryUser.getTemporaryUser();

    @FXML
    Label logged_in = setLabel(actualUser);
    @FXML
    Button settings_bt;

    public Label setLabel(String user){
        Label label = new Label();
        label.setText(user);
        return label;
    }
    /*public String setLogged_in(String welcomeUser){
        logged_in.setText(welcomeUser);
    }*/


    public void settings(ActionEvent e){
        System.out.println("Megnyomtál!");
        System.out.println(actualUser);
        SettingsScreenCreator settingsScreenCreator = new SettingsScreenCreator();
        settingsScreenCreator.showScreen();
    }

}
