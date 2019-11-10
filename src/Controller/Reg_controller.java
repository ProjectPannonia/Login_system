package Controller;

import Database.Register;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Reg_controller {
    @FXML
    TextField vezeteknev_tb, keresztnev_tb, telepules_tb,
            iranyitoszam_tb,utcanev_tb,kozteruletjelleg_tb,email_tb;
    @FXML
    Button regisztracio_bt;
    public void utca(ActionEvent e){
        utcanev_tb.setText(utcanev_tb.getText() + kozteruletjelleg_tb.getText());
    }

    public User newUser(){
        String firstName = vezeteknev_tb.getText();
        String lastName = keresztnev_tb.getText();
        String city = telepules_tb.getText();
        int zipCode = Integer.parseInt(iranyitoszam_tb.getText());
        String streetName = utcanev_tb.getText();
        String email = email_tb.getText();
        return new User(firstName,lastName,city,streetName,email,zipCode);
    }

    public void registration(ActionEvent e){
        String firstName = vezeteknev_tb.getText();
        String lastName = keresztnev_tb.getText();
        String city = telepules_tb.getText();
        int zipCode = Integer.parseInt(iranyitoszam_tb.getText());
        String streetName = utcanev_tb.getText();
        String email = email_tb.getText();
        User user = new User(firstName,lastName,city,streetName,email,zipCode);
        Register register = new Register();
        register.SendToDatabase(user);
    }
}
