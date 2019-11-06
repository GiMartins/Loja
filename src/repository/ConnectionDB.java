package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public Connection getConnection(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/LojaSenac?useTimezone=true&serverTimezone=UTC", "root", "root");

            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }
}
