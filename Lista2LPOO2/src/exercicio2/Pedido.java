/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macedo
 */
public class Pedido {
    private String nomeCliente;
    private List<ItemDePedido> listaDeItens = new ArrayList<>();
    private double valorTotalPermitido;
    private ItemDePedido novoItemDePedido = null;
    private double valorTotalPedido;
    
    public Pedido(String nomeCliente, double valorTotalPermitido) {
        this.setNomeCliente(nomeCliente);
        this.setValorTotalPermitido(valorTotalPermitido);
    }
    
    public void setNomeCliente(String nomeCliente) throws RuntimeException {
        if(nomeCliente.isEmpty()) {
            throw new RuntimeException("Nome do cliente não pode ser vazio!");
        } else {
            this.nomeCliente = nomeCliente;
        }
    }
    
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    
    public void setListaDeItens(ItemDePedido itemDePedido) throws RuntimeException {
        if(this.valorTotalPedido == this.valorTotalPermitido) {
            throw new RuntimeException("Item de Pedido não incluido!");
        } else if(this.valorTotalPermitido == 0) {
            throw new RuntimeException("Cliente não tem nenhum crédito!");
        } else {
            this.verificarSeItemJaExisteNoPedido(itemDePedido);
            this.listaDeItens.add(itemDePedido);
            this.setValorTotalPedido();
        } 
        this.listaDeItens.add(itemDePedido);
    }
    
    public List<ItemDePedido> getListaDeItens() {
        return this.listaDeItens;
    }
    
    public void setValorTotalPermitido(double valorTotalPermitido) throws RuntimeException {
        if(valorTotalPermitido < 0) {
            throw new RuntimeException("Valor Total Permitido não pode ser negativo!");
        } else {
            this.valorTotalPermitido = valorTotalPermitido;        
        }
    }
    
    public double getValorTotalPermitido() {
        return this.valorTotalPermitido;
    }
    
    public void novoItemDePedido(String nome, double preco, int quantidade) {
        this.novoItemDePedido = new ItemDePedido(nome, preco, quantidade);
        this.setListaDeItens(novoItemDePedido);
        this.setValorTotalPedido();
    }
    
    public void setValorTotalPedido() {
        for(ItemDePedido i : this.getListaDeItens()) {
           this.valorTotalPedido = this.valorTotalPedido + (i.getPreco() * i.getQuantidade());
        }
    }
    
    public double getValorTotalPedido() {
        return this.valorTotalPedido; 
    }
    
    public void verificarSeItemJaExisteNoPedido(ItemDePedido itemDePedido) {
        for(ItemDePedido i : this.getListaDeItens()) {
            if(i.getNome().equals(itemDePedido.getNome())) {
                i.setQuantidade(i.getQuantidade() + itemDePedido.getQuantidade());
            }
        }
        this.setValorTotalPedido();
    }
    
    public void retirarItem(String nomeItem) {
        for (ItemDePedido i : this.getListaDeItens()) {
            if (i.getNome().equals(nomeItem)) {
                this.listaDeItens.remove(i);
                this.setValorTotalPedido();
            }
        }
    }
    
    public String toString() {
        String texto;
        texto = "Nome do Cliente : " + this.getNomeCliente() + "\n";
        for(ItemDePedido i : this.getListaDeItens()) {
            texto += "Nome : " + i.getNome() + " Preço : " + i.getPreco() + "\n";
        }
        return texto;
    }
}
