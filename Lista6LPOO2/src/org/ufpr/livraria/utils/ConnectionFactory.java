/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.livraria.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macedo
 */
public class ConnectionFactory {

    public static Connection getConnection() {
        try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
			}
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/exercicio6LPOO22", "postgres", "tofzn031265");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}