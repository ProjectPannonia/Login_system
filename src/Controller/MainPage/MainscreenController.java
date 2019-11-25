package Controller.MainPage;

import Controller.SettingsPage.SettingsScreenCreator;
import Database.Retrievers.GetData;
import Database.TruncateTemporary.TruncateTemporaryUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainscreenController {
    GetData getData = new GetData();
    String actualUser = getData.getTemporaryUser();

    @FXML
    Label logged_in = setLabel(actualUser);
    @FXML
    Button settings_bt,logOut_bt;

    public Label setLabel(String user){
        Label label = new Label();
        label.setText(user);
        return label;
    }

    public void settings(ActionEvent e){
        System.out.println("Megnyomtál!");
        //System.out.println(actualUser);
        SettingsScreenCreator settingsScreenCreator = new SettingsScreenCreator();
        settingsScreenCreator.showScreen();
        //((Node)(e.getSource())).getScene().getWindow();
    }
    public void logOut(ActionEvent e){
        TruncateTemporaryUser truncateTemporaryUser = new TruncateTemporaryUser();
        truncateTemporaryUser.truncateTemporaryUser();
        System.out.println("Megnyomtad a kijelentkezés gombot!");
    }

}
