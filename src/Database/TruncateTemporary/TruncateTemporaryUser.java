package Database.TruncateTemporary;

import Controller.LoginPage.LoginPageCreator;
import Database.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TruncateTemporaryUser {
    Database database = new Database();
    PreparedStatement preparedStatement = null;
    Connection connection = database.getConnection();

    public void truncateTemporaryUser(){
        String logOutUser = "TRUNCATE \"TemporaryUser\"" ;
        try {
            preparedStatement = connection.prepareStatement(logOutUser);
            System.out.println("Ideiglenes felhasználó törlés elindítva!");
            preparedStatement.execute();
            System.out.println("Ideiglenes felhasználó törölve!");
            LoginPageCreator loginPageCreator = new LoginPageCreator();
            loginPageCreator.createLoginPage();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
