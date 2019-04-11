/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.dao;

import exercicio2.model.Pedido;
import exercicio2.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author macedo
 */
public class PedidoDAO {
    Connection connection = ConnectionFactory.getConnection();
    PreparedStatement st = null;
    ResultSet rs = null;
    
    public void incluirPedido(Pedido pedido) {
        try {
            st = connection.prepareStatement("insert into pedido (nome_cliente, valor_total_permitido) values(?, ?)");
            st.setString(1, pedido.getNomeCliente());
            st.setDouble(2, pedido.getValorTotalPermitido());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
    
    public void excluirPedido(String nomeCliente) {
        Pedido pedido = new Pedido();
        try {
            st = connection.prepareStatement("SELECT * FROM pedido where nome_cliente = ?");
            st.setString(1, nomeCliente);
            rs = st.executeQuery();
            if (rs.next()) {
                pedido.setId(rs.getInt("id"));
                pedido.setNomeCliente(rs.getString("nome_cliente"));
                pedido.setValorTotalPermitido(rs.getDouble("valor_total_permitido"));
            } else {
                pedido = null;
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
        
        if(pedido != null) {
            try {
                st = connection.prepareStatement("DELETE FROM pedido WHERE id = ?");
                st.setLong(1, pedido.getId());
                st.executeUpdate();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro : " + e.getMessage());
            }
        }
    }
}
