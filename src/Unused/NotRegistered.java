package Unused;

import Alerts.MyAlert;
import javafx.scene.control.Alert;

public class NotRegistered implements MyAlert {
    @Override
    public void SendAlert() {
        System.out.println("Nincs ilyen felhasználó!");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("A felhasználónév és/vagy a jelszó helytelen!");
        alert.showAndWait();
    }
}
