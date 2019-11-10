package Alerts;

import javafx.scene.control.Alert;

public class UsernameAlreadyInUse implements MyAlert {

    @Override
    public void SendAlert() {
        System.out.println("Ez a felhasználónév már foglalt, kérlek válassz másikat.");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("A felhasználónév már foglalt!");
        alert.showAndWait();
    }
}
