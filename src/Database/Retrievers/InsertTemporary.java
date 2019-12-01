package Database.Retrievers;

import Database.Database;
import UserObjects.LoggingUser;
import UserObjects.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertTemporary
{
    Database database = new Database();
    Statement statement = database.getStatement();
    ArrayList<User> allUser = new ArrayList<>();
    ResultSet resultSet = null;
    private String query = null;

    public ArrayList<User> getAllUser(){
        query = "SELECT * FROM \"Users\"";
        try
        {
            resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                User actualUser = new User(
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("zip_code"),
                        resultSet.getString("city"),
                        resultSet.getString("street_name"),
                        resultSet.getString("email"),
                        resultSet.getString("login_name"),
                        resultSet.getString("login_password")
                );
                allUser.add(actualUser);
            }
        } catch (SQLException e)
        {
            System.out.println("Problem when retrieving data from the table!");
            e.printStackTrace();
        }
        return allUser;
    }

    public String getTemporaryUser(){
        query = "SELECt * FROM \"TemporaryUser\"";
        String username = null;
        try {
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                username = resultSet.getString("LoggedUser");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return username;
    }
    public ArrayList<LoggingUser> getUserNameAndPassword(){
        String query = "SELECT login_name,login_password FROM \"Users\"";
        ArrayList<LoggingUser> allUser = new ArrayList<>();
        try
        {
            resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                LoggingUser actualUser = new LoggingUser(

                        resultSet.getString("login_name"),
                        resultSet.getString("login_password")
                );
                allUser.add(actualUser);
            }
        } catch (SQLException e)
        {
            System.out.println("Problem when retrieving data from the table!");
            e.printStackTrace();
        }
        return allUser;
    }
}
