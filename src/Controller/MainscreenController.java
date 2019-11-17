package Controller;

import ScreenCreator.SettingsScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainscreenController {
    @FXML
    Label logged_in;
    @FXML
    Button settings_bt;

    public void settings(ActionEvent e){
        System.out.println("Megnyomtál!");
        SettingsScreen settingsScreen = new SettingsScreen();
        settingsScreen.showScreen();
    }

}
