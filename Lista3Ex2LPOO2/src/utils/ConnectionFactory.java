package utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author macedo
 */
public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/exercicio3LPOO2", "postgres", "lilibox");
//            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/exercicio3", "postgres", "tofzn031265");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
