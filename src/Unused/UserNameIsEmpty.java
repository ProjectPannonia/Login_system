package Unused;

import Alerts.MyAlert;
import javafx.scene.control.Alert;

public class UserNameIsEmpty implements MyAlert {
    @Override
    public void SendAlert() {
            System.out.println("Felhasználónév mező üres!");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba!");
            alert.setContentText("Nem írtál be felhasználónevet!");
            alert.showAndWait();
        }
}
