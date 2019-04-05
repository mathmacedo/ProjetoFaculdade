/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobancodedadoslpoo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macedo
 */
public class ConexaoBancodeDadosLPOO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost/exercicio?user=postgres&password=tofzn031265");
            System.out.println("Conectado!");
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBancodeDadosLPOO2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
