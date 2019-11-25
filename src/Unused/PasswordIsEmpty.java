package Unused;

import Alerts.MyAlert;
import javafx.scene.control.Alert;

public class PasswordIsEmpty implements MyAlert {
    @Override
    public void SendAlert() {
        System.out.println("A jelszó mező üres!");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("Nem írtad be a jelszavat!");
        alert.showAndWait();
    }
}
