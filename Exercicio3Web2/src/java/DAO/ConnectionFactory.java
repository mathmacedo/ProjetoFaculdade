/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
//            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/exercicio3web2", "postgres", "lilibox");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/exercicio3", "postgres", "tofzn031265");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
