package Database;

import UserObjects.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register {
    Database database = new Database();
    PreparedStatement preparedStatement = null;
    Connection connection = database.getConnection();

    public void SendToDatabase(User user) {
        try {
            String sendNewUser = "INSERT INTO \"Users\"" +
                    "(first_name,last_name,zip_code,city,street_name,email,login_name,login_password)" +
                    "values(?,?,?,?,?,?,?,?)";
            //int zip = Integer.parseInt(user.getZipcode())
            preparedStatement = connection.prepareStatement(sendNewUser);
            preparedStatement.setString(1, user.getFirstname());
            preparedStatement.setString(2, user.getLastname());
            preparedStatement.setInt(3, user.getZipcode());
            preparedStatement.setString(4, user.getCity());
            preparedStatement.setString(5, user.getStreetName());
            preparedStatement.setString(6, user.getEmail());
            preparedStatement.setString(7, user.getLoginName());
            preparedStatement.setString(8, user.getLoginPassword());
            preparedStatement.execute();
            System.out.println("Adatküldés sikeres!");
        } catch (SQLException e) {
            System.out.println("Sikertelen adatküldés!");
            e.printStackTrace();
        }
    }
}
