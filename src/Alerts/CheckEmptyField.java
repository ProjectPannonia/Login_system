package Alerts;

import javafx.scene.control.Alert;

public class CheckEmptyField implements MyAlert{

    @Override
    public void NotRegistered() {
        System.out.println("Nincs ilyen felhasználó!");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("A felhasználónév és/vagy a jelszó helytelen!");
        alert.showAndWait();
    }

    @Override
    public void CellsAreEmpty() {
        System.out.println("Az űrlap mindkét mezője üres!");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("Nem írtad be a felhasználónevet és a jelszót!");
        alert.showAndWait();
    }

    @Override
    public void UserNameAlreadyInUse() {
        System.out.println("Ez a felhasználónév már foglalt, kérlek válassz másikat.");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("A felhasználónév már foglalt!");
        alert.showAndWait();
    }

    @Override
    public void UserNameIsEmpty() {
        System.out.println("Felhasználónév mező üres!");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("Nem írtál be felhasználónevet!");
        alert.showAndWait();
    }

    @Override
    public void PasswordIsEmpty() {
        System.out.println("A jelszó mező üres!");
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Hiba!");
        alert.setContentText("Nem írtad be a jelszavat!");
        alert.showAndWait();
    }
}
