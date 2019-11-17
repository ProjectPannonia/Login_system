package Database;

import Controller.LoggingUser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RetrieveUserNameAndPassword {
    Db database = new Db();
    Statement statement = database.getStatement();
    ArrayList<LoggingUser> allUser = new ArrayList<>();
    ResultSet resultSet = null;
    private String query = "SELECT login_name,login_password FROM \"Users\"";

    public ArrayList<LoggingUser> getUserNameAndPassword(){

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
