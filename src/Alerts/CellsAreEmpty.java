package Alerts;

import javafx.scene.control.Alert;

public class CellsAreEmpty implements MyAlert {
    @Override
    public void SendAlert() {
        System.out.println("Az űrlap mindkét mezője üres!");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("Nem írtad be a felhasználónevet és a jelszót!");
        alert.showAndWait();
    }
}
