package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginPageController {
    @FXML
    TextField userName_tb, password_tb;
    @FXML
    Button  register_bt,login_bt,login_problem_bt;

    public void login(javafx.event.ActionEvent actionEvent) {
        if (userName_tb.getText() != null && password_tb.getText() != null){
            String userName = userName_tb.getText();
            String password = password_tb.getText();
            
        }

    }
}
