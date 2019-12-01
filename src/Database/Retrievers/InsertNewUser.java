package Database.Retrievers;

import Database.Database;
import UserObjects.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertNewUser {

    public void InsertNewUser(User user) {
        try
        {
            SendNewUser(user).execute();
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    private PreparedStatement SendNewUser(User user) throws SQLException {
        Database database = new Database();
        PreparedStatement preparedStatement = null;
        Connection connection = database.getConnection();

            preparedStatement = connection.prepareStatement(sendUserQuery());
            preparedStatement.setString(1, user.getFirstname());
            preparedStatement.setString(2, user.getLastname());
            preparedStatement.setInt(3, user.getZipcode());
            preparedStatement.setString(4, user.getCity());
            preparedStatement.setString(5, user.getStreetName());
            preparedStatement.setString(6, user.getEmail());
            preparedStatement.setString(7, user.getLoginName());
            preparedStatement.setString(8, user.getLoginPassword());
            System.out.println("Adatküldés sikeres!");

        return preparedStatement;
    }
    private String sendUserQuery(){
        return "INSERT INTO \"Users\"" +
                "(first_name,last_name,zip_code,city,street_name,email,login_name,login_password)" +
                "values(?,?,?,?,?,?,?,?)";
    }
}
