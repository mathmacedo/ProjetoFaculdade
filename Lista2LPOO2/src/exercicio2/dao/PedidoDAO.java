/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.dao;

import exercicio2.model.ItemDePedido;
import exercicio2.model.Pedido;
import exercicio2.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macedo
 */
public class PedidoDAO {
    Connection connection = ConnectionFactory.getConnection();
    PreparedStatement st = null;
    ResultSet rs = null;
    List<Pedido> listaDePedidosPorNome = new ArrayList<Pedido>();
    List<Pedido> listaDePedidos = new ArrayList<Pedido>();
    List<ItemDePedido> listaDeItemDePedidos = new ArrayList<ItemDePedido>();
    Pedido pedido = new Pedido();
    ItemDePedido itemDePedido = new ItemDePedido();
    
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
                System.out.println("Pedido excluido com sucesso !");
            } catch (SQLException e) {
                System.out.println("Erro : " + e.getMessage());
            }
        } else {
            System.out.println("Cliente não existe !");
        }
    }
    
    public List<Pedido> listarPedidosPorNome(String nomeCliente) {
        try {
            st = connection.prepareStatement("SELECT * FROM pedido where nome_cliente = ?");
            st.setString(1, nomeCliente);
            rs = st.executeQuery();
            while(rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setId(rs.getInt("id"));
                pedido.setNomeCliente(rs.getString("nome_cliente"));
                pedido.setValorTotalPermitido(rs.getDouble("valor_total_permitido"));
                this.listaDePedidosPorNome.add(pedido);
            }
            rs.close();
        } catch(SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
        
        return this.listaDePedidosPorNome;
    }
    
    public Pedido pedidoPorNomeCliente(String nomeCliente) {
        try {
            st = connection.prepareStatement("SELECT * FROM pedido where nome_cliente = ?");
            st.setString(1, nomeCliente);
            rs = st.executeQuery();
            if (rs.next()) {
                this.pedido.setId(rs.getInt("id"));
                this.pedido.setNomeCliente(rs.getString("nome_cliente"));
                this.pedido.setValorTotalPermitido(rs.getDouble("valor_total_permitido"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
        
        return this.pedido;
    }
    
    public ItemDePedido itemDePedidoPorNomeItem(String nomeItem, int idPedido) {
        try {
            st = connection.prepareStatement("SELECT * FROM item_de_pedido where nome = ? and id_pedido = ?");
            st.setString(1, nomeItem);
            st.setInt(2, idPedido);
            rs = st.executeQuery();
            if (rs.next()) {
                this.itemDePedido.setId(rs.getInt("id"));
                this.itemDePedido.setNome(rs.getString("nome"));
                this.itemDePedido.setPreco(rs.getDouble("preco"));
                this.itemDePedido.setQuantidade(rs.getInt("quantidade"));
                this.itemDePedido.setIdPedido(rs.getInt("id_pedido"));
            }
            rs.close();
        } catch(SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
        
        return this.itemDePedido;
    }
    
    public void inserirItemDePedido(ItemDePedido itemDePedido, int idPedido) {
        try {
            st = connection.prepareStatement("insert into item_de_pedido (nome, preco, quantidade, id_pedido) values(?, ?, ?, ?)");
            st.setString(1, itemDePedido.getNome());
            st.setDouble(2, itemDePedido.getPreco());
            st.setInt(3, itemDePedido.getQuantidade());
            st.setInt(4, idPedido);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
    
    public void excluirItemDePedido(int idPedido) {
        try {
            st = connection.prepareStatement("DELETE FROM item_de_pedido WHERE id_pedido = ?");
            st.setInt(1, idPedido);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
    
    public List<Pedido> getAllPedidos() {
        try {
            st = connection.prepareStatement("SELECT * FROM pedido");
            rs = st.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setId(rs.getInt("id"));
                pedido.setNomeCliente(rs.getString("nome_cliente"));
                pedido.setValorTotalPermitido(rs.getDouble("valor_total_permitido"));
                this.listaDePedidos.add(pedido);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
        
        return this.listaDePedidos;
    }
    
    public List<ItemDePedido> getAllItemDePedidos() {
        try {
            st = connection.prepareStatement("SELECT * FROM item_de_pedido");
            rs = st.executeQuery();
            while (rs.next()) {
                ItemDePedido itemDePedido = new ItemDePedido();
                itemDePedido.setId(rs.getInt("id"));
                itemDePedido.setNome(rs.getString("nome"));
                itemDePedido.setPreco(rs.getDouble("preco"));
                itemDePedido.setQuantidade(rs.getInt("quantidade"));
                itemDePedido.setIdPedido(rs.getInt("id_pedido"));
                this.listaDeItemDePedidos.add(itemDePedido);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Erro : " + e.getMessage());
        }
        
        return this.listaDeItemDePedidos;
    }
}
