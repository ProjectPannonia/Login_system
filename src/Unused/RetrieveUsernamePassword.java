package Unused;

import Database.Database;
import UserObjects.LoggingUser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RetrieveUsernamePassword {
    Database database = new Database();
    Statement statement = database.getStatement();
    ArrayList<LoggingUser> allUser = new ArrayList<>();
    ResultSet resultSet = null;
    private String query = "SELECT login_name,login_password FROM \"Users\"";


}
