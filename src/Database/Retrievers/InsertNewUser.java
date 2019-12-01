package Database.Retrievers;

import Database.Database;
import UserObjects.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertNewUser {
    private Database db = new Database();

    public void InsertNewUser(User user) {
            ExecuteQueryOnUser(user);
    }

    private void ExecuteQueryOnUser(User user){
        try {
            setPreparedStatement(user).execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private PreparedStatement setPreparedStatement(User user){
        PreparedStatement pStatement = null;
        Connection connection = getConnection(db);
        try {
            pStatement = connection.prepareStatement(sendUserQuery());
            pStatement.setString(1, user.getFirstname());
            pStatement.setString(2, user.getLastname());
            pStatement.setInt(3, user.getZipcode());
            pStatement.setString(4, user.getCity());
            pStatement.setString(5, user.getStreetName());
            pStatement.setString(6, user.getEmail());
            pStatement.setString(7, user.getLoginName());
            pStatement.setString(8, user.getLoginPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pStatement;
    }
    private Connection getConnection(Database database){
        return database.getConnection();
    }
    private String sendUserQuery(){
        return "INSERT INTO \"Users\"" +
                "(first_name,last_name,zip_code,city,street_name,email,login_name,login_password)" +
                "values(?,?,?,?,?,?,?,?)";
    }
}
