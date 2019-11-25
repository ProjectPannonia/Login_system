package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TemporaryUser {
    Database database = new Database();
    PreparedStatement preparedStatement = null;
    Connection connection = database.getConnection();

    public void SendTemporaryUser(String temporaryUserName){
        String sendNewUser = "INSERT INTO \"TemporaryUser\"" +
                "VALUES(?)";
        try {
            preparedStatement = connection.prepareStatement(sendNewUser);
            preparedStatement.setString(1,temporaryUserName);
            preparedStatement.execute();
            System.out.println("Ideiglenes felhasználó bejegyezve!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
