/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.model;

import exercicio2.dao.PedidoDAO;
import java.util.List;

/**
 *
 * @author macedo
 */
public class Pedido {
    private int id;
    private String nomeCliente;
    private List<ItemDePedido> listaDeItensDePedido;
    private double valorTotalPermitido;
    private PedidoDAO pedidoDAO;
    
    public Pedido() {
        
    }
    
    public Pedido(String nomeCliente, double valorTotalPermitido) {
        this.setNomeCliente(nomeCliente);
        this.setValorTotalPermitido(valorTotalPermitido);
    }
    
    public void setId(int id) {
        this.id = id;
    } 
    
    public int getId() {
        return this.id;
    }
    
    public void setNomeCliente(String nomeCliente) throws RuntimeException {
        if(nomeCliente.isEmpty()) {
            throw new RuntimeException("Nome não pode ser vazio!");
        } else {
            this.nomeCliente = nomeCliente;
        }
    }
    
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    
    public List<ItemDePedido> getItensDePedidos() {
        return this.listaDeItensDePedido;
    }
    
    public void setValorTotalPermitido(double valorTotalPermitido) throws RuntimeException {
        if(valorTotalPermitido < 0) {
            throw new RuntimeException("Valor total permitido não pode ser negativo!");
        } else {
            this.valorTotalPermitido = valorTotalPermitido;
        }
    }
    
    public double getValorTotalPermitido() {
        return this.valorTotalPermitido;
    }
    
    public void incluirPedido(Pedido novoPedido) {
        this.pedidoDAO.incluirPedido(novoPedido);
    }
    
    public void excluirPedido(String nomeCliente) {
        
    }
}
