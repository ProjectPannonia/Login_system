package Database;

import java.sql.*;

public class Database {
    private final String url = "jdbc:postgresql://localhost:5432/LD";
    private final String user = "postgres";
    private final String password = "Zetka67";
    private Statement statement = null;
    private DatabaseMetaData databaseMetaData = null;
    Connection connection = null;

    public Connection getConnection() {
        return this.connection;
    }

    public Statement getStatement() {
        return this.statement;
    }

    public Database() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Bridge created!");
            if (connection != null) {
                statement = connection.createStatement();
                System.out.println("Statement created!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            databaseMetaData = connection.getMetaData();
            System.out.println(databaseMetaData);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
