package Database.Retrievers;

import Database.Database;
import UserObjects.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SendToDatabase {
    Database database = new Database();
    PreparedStatement preparedStatement = null;
    Connection connection = database.getConnection();


    public void Send(String temporaryUserName) {
        String sendNewUser = "INSERT INTO \"TemporaryUser\"" + "VALUES(?)";
        try {
            SendTemporary(temporaryUserName,sendNewUser).execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private PreparedStatement SendTemporary(String temporaryUserName,String query){
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,temporaryUserName);
            System.out.println("Ideiglenes felhasználó bejegyezve!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }


}
