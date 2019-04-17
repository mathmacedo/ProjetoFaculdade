/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.ufpr.tads.web2.beans.Cliente;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macedo
 */
public class ClienteDAO {
    Connection connection = ConnectionFactory.getConnection();
    PreparedStatement st = null;
    ResultSet rs = null;
    List<Cliente> listaDeTodosClientes = new ArrayList<Cliente>();
    
    public List<Cliente> getAllCliente() {
        try {
            st = connection.prepareStatement("SELECT * FROM tb_cliente");
            rs = st.executeQuery();
            while (rs.next()) {
                Cliente novoCliente = new Cliente();
                novoCliente.setId(rs.getInt("id_cliente"));
                novoCliente.setCpf(rs.getString("cpf_cliente"));
                novoCliente.setNome(rs.getString("nome_cliente"));
                novoCliente.setEmail(rs.getString("email_cliente"));
                novoCliente.setData(rs.getDate("data_cliente"));
                novoCliente.setRua(rs.getString("rua_cliente"));
                novoCliente.setNumero(rs.getInt("nr_cliente"));
                novoCliente.setCep(rs.getString("cep_cliente"));
                novoCliente.setCidade(rs.getString("cidade_cliente"));
                novoCliente.setUf(rs.getString("uf_cliente"));
                this.listaDeTodosClientes.add(novoCliente);
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Erro" + e);
        }
        

        return this.listaDeTodosClientes;
    }
    
    public void inserirCliente(Cliente cliente) {
        try {
            st = connection.prepareStatement("insert into tb_cliente (cpf_cliente, nome_cliente, email_cliente, data_cliente, rua_cliente, nr_cliente, cep_cliente, cidade_cliente, uf_cliente) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            st.setString(1, cliente.getCpf());
            st.setString(2, cliente.getNome());
            st.setString(3, cliente.getEmail());
            st.setDate(4, (Date) cliente.getData());
            st.setString(5, cliente.getRua());
            st.setInt(6, cliente.getNumero());
            st.setString(7, cliente.getCep());
            st.setString(8, cliente.getCidade());
            st.setString(9, cliente.getUf());
            st.executeUpdate();
            st.close();
        } catch(SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
    
    public Cliente buscarCliente(int id) {
        Cliente cliente = new Cliente();
        try {
            st = connection.prepareStatement("SELECT * FROM tb_cliente where id_cliente = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            if(rs.next()) {
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setCpf(rs.getString("cpf_cliente"));
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setEmail(rs.getString("email_cliente"));
                cliente.setData(rs.getDate("data_cliente"));
                cliente.setRua(rs.getString("rua_cliente"));
                cliente.setNumero(rs.getInt("nr_cliente"));
                cliente.setCep(rs.getString("cep_cliente"));
                cliente.setCidade(rs.getString("cidade_cliente"));
                cliente.setUf(rs.getString("uf_cliente"));
            } else {
                cliente = null;
            }
            rs.close();
        } catch(SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
        
        return cliente;
    }
    
    public void removerCliente(int id) {
        try {
            st = connection.prepareStatement("DELETE FROM tb_cliente where id_cliente = ?");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
    
    public void alterarCliente(Cliente cliente) {
        try {
            st = connection.prepareStatement("UPDATE tb_cliente SET cpf_cliente = ?, nome_cliente = ?, email_cliente = ?, data_cliente = ?, rua_cliente = ?, nr_cliente = ?, cep_cliente = ?, cidade_cliente = ?, uf_cliente = ? where id_cliente = " + cliente.getId());
            st.setString(1, cliente.getCpf());
            st.setString(2, cliente.getNome());
            st.setString(3, cliente.getEmail());
            st.setDate(4, (Date) cliente.getData());
            st.setString(5, cliente.getRua());
            st.setInt(6, cliente.getNumero());
            st.setString(7, cliente.getCep());
            st.setString(8, cliente.getCidade());
            st.setString(9, cliente.getUf());
            
            st.executeUpdate();
            st.close();
        } catch(SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
}
