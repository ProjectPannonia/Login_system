package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveTemporaryUser {
    Database database = new Database();
    Statement statement = database.getStatement();
    String username = null;
    private String query = "SELECt * FROM \"TemporaryUser\"";
    ResultSet resultSet = null;

    public String getTemporaryUser(){
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


}
