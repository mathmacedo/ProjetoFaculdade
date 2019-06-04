/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.livraria.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.ufpr.livraria.utils.ConnectionFactory;

/**
 *
 * @author macedo
 */
public class AutorDAO {
	Connection connection = ConnectionFactory.getConnection();
    PreparedStatement st = null;
    ResultSet rs = null;
}
