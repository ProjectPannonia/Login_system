package Alerts;

import javafx.scene.control.Alert;

public class EmptyCellAlert implements MyAlert {
    @Override
    public void SendAlert() {
        System.out.println("Az űrlap valamelyik mezője üres!");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("Eggyik cellát üreset hagytad!");
        alert.showAndWait();
    }
}
