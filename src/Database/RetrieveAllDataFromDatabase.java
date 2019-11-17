package Database;

import Controller.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RetrieveAllDataFromDatabase
{
    Db database = new Db();
    Statement statement = database.getStatement();
    ArrayList<User> allUser = new ArrayList<>();
    ResultSet resultSet = null;
    private String query = "SELECT * FROM \"Users\"";

    public ArrayList<User> getAllUser(){

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
}
