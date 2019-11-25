package Unused;

import Database.Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {
    Database database = new Database();
    Statement statement = database.getStatement();
    String username = null;
    private String query = "SELECt * FROM \"TemporaryUser\"";
    ResultSet resultSet = null;




}
