/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contato;
import utils.ConnectionFactory;

/**
 *
 * @author macedo
 */
public class ContatoDAO {
    
    Connection connection = ConnectionFactory.getConnection();
    PreparedStatement st = null;
    ResultSet rs = null;
    
    List<Contato> listaDeContatos = new ArrayList<Contato>();
    Contato contatoEspecifico = new Contato();
    
    public void altera(Contato contato) throws RuntimeException {
        try {
            st = connection.prepareStatement("SELECT * from contato where id = " + contato.getId());
            rs = st.executeQuery();
            if (rs.next()) {
                Contato novoContato = new Contato();
                novoContato.setId(rs.getLong("id"));
                contatoEspecifico = novoContato;
                st.close();
            } else {
                throw new RuntimeException("Contato não encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            st = connection.prepareStatement("UPDATE contato SET id = ?, nome = ?, email = ?, endereco = ?, datanascimento = ? where id = " + contato.getId());
            st.setLong(1, contato.getId());
            st.setString(2, contato.getNome());
            st.setString(3, contato.getEmail());
            st.setString(4, contato.getEndereco());
            st.setDate(5, new Date(contato.getDataNascimento().getTimeInMillis()));
            
            st.executeUpdate();
            st.close();
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public void remove(Contato contato) throws RuntimeException {
        try {
            st = connection.prepareStatement("SELECT * from contato where id = " + contato.getId());
            rs = st.executeQuery();
            if (rs.next()) {
                Contato novoContato = new Contato();
                novoContato.setId(rs.getLong("id"));
                contatoEspecifico = novoContato;
                st.close();
            } else {
                throw new RuntimeException("Contato não encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            st = connection.prepareStatement("DELETE FROM contato WHERE id = ?");
            st.setLong(1, contato.getId());
            st.executeUpdate();
            st.close();
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public List<Contato> lista() {
        try {
            st = connection.prepareStatement("SELECT id, nome, email, endereco, datanascimento FROM contato");
            rs = st.executeQuery();
            while(rs.next()) {
                Contato novoContato = new Contato();
                novoContato.setId(rs.getLong("id"));
                novoContato.setNome(rs.getString("nome"));
                novoContato.setEmail(rs.getString("email"));
                novoContato.setEndereco(rs.getString("endereco"));
                SimpleDateFormat dataformatada = new SimpleDateFormat("yyyy/MM/dd");
                Calendar data = dataformatada.getCalendar();
                data.setTime(rs.getDate("datanascimento"));
                novoContato.setDataNascimento(data);
                listaDeContatos.add(novoContato);
            }
            st.close();
        } catch(SQLException e) {
            System.out.println(e);
        }
        
        for (Contato i : listaDeContatos) {
            System.out.println("ID = " + i.getId());
            System.out.println("Nome = " + i.getNome());
            System.out.println("Email =  " + i.getEmail());
            System.out.println("Endereço =  " + i.getEndereco());
            System.out.println("Data de Nascimento =  " + i.getDataNascimento());
        }
        
        return this.listaDeContatos;
    }
    
    public void insere(Contato contato) {
        try {
            st = connection.prepareStatement("INSERT INTO contato (nome, email, endereco, datanascimento) values (?, ?, ?, ?)");
            st.setString(1, contato.getNome());
            st.setString(2, contato.getEmail());
            st.setString(3, contato.getEndereco());
            st.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
            st.executeUpdate();
            st.close();
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}
