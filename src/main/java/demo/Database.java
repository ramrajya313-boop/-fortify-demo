package demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Connection getConnection() throws Exception {

        return DriverManager.getConnection(
                Config.DB_URL,
                Config.DB_USER,
                Config.DB_PASSWORD
        );
    }

}