/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.List;

/**
 *
 * @author macedo
 */
public class Pedido {
	private String nomeCliente;
	private List<ItemDePedido> listaItemDePedidos;
	private double valorTotal;
	
	public Pedido() {
		
	}
	
	public Pedido(double valorTotal, String nomeCliente) {
		this.setValorTotal(valorTotal);
        this.setNomeCliente(nomeCliente);
	}
	
    public String setNomeCliente(String nomeCliente) throws RuntimeException {
        if(nomeCliente == null) {
            throw new RuntimeException("Nome não pode ser nulo!");
        }
        return this.nomeCliente;
    }
    
	public String getNomeCliente() {
		return this.nomeCliente;
	}
    
    public double setValorTotal(double valorTotal) throws RuntimeException {
        if(valorTotal < 0) {
            throw new RuntimeException("Valor negativo não permitido!");
        }
        this.valorTotal = valorTotal;
        return this.valorTotal;
    }
    
    public double getValorTotal() {
        return this.valorTotal;
    }
	
	public List<ItemDePedido> getItens() {
		return this.listaItemDePedidos;
	}
    
    public void acrescentaItem(ItemDePedido itemDePedido) throws RuntimeException {
        double valorTotalPedido = itemDePedido.getPreco() * itemDePedido.getQuantidade();
        if (valorTotalPedido > this.valorTotal) {
            throw new RuntimeException("Item de Pedido não incluido. Valor do pedido excedido!");
        } else if (this.valorTotal == 0) {
            throw new RuntimeException("Cliente não tem nenhum crédito.");
        } else {
            this.listaItemDePedidos.add(itemDePedido);
        }
    }
    
    public void retirarItem(String nome) throws RuntimeException {
        for(ItemDePedido i : this.listaItemDePedidos) {
            if (i.getNome() == nome) {
                listaItemDePedidos.remove(i);
            } else {
                throw new RuntimeException("Item não encontrado no pedido!");
            }
        }
    }
    
    public double getTotal() {
        double total = 0;
        for (ItemDePedido i : this.listaItemDePedidos) {
            total = total + i.getPreco();
        }
        return total;
    }
    
    public String toString() {
        String retorno = "Nome do cliente " + this.getNomeCliente() + "\n" + "Total do Pedido " + getTotal() + "\n"; 
        for (ItemDePedido i : this.listaItemDePedidos) {
            retorno += "Item : " + i.getNome() + "\n";
            retorno += "Preço : " + i.getPreco() + "\n \n \n";
        }
        return retorno;
    }
}
