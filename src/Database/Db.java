package Database;

import java.sql.*;

public class Db {
    private final String url = "jdbc:postgresql://localhost:5432/LD";
    private final String user = "postgres";
    private final String password = "Zetka67";

    private ResultSet  resultSet = null;
    Connection connection = null;
    private Statement statement = null;
    private DatabaseMetaData databaseMetaData = null;

    public Connection getConnection(){
        return this.connection;
    }
    public Statement getStatement(){
        return this.statement;
    }

    public Db(){
        try
        {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Bridge created!");
            if (connection != null)
            {
                statement = connection.createStatement();
                System.out.println("Statement created!");
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        try
        {
            databaseMetaData = connection.getMetaData();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

}
