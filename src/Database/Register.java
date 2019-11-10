package Database;

import Controller.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register {
    Db db = new Db();
    PreparedStatement preparedStatement = null;
    Connection connection = db.getConnection();

    public void SendToDatabase(User user){
        try {
            String sendNewUser = "INSERT INTO \"Users\"(FirstName,LastName,ZipCode,City,StreetName,Email)" + "values(?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sendNewUser);
            preparedStatement.setString(1,user.getFirstname());
            preparedStatement.setString(2,user.getLastname());
            preparedStatement.setInt(3,user.getZipcode());
            preparedStatement.setString(4,user.getCity());
            preparedStatement.setString(5,user.getStreetName());
            preparedStatement.setString(6,user.getEmail());
            preparedStatement.execute();
            System.out.println("Adatküldés sikeres!");
        } catch (SQLException e) {
            System.out.println("Sikertelen adatküldés!");
            e.printStackTrace();
        }
    }
}
