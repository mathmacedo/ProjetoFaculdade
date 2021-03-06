/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.model;

/**
 *
 * @author macedo
 */
public class ItemDePedido {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private int id_pedido;
	private double valorTotal;
    
    public ItemDePedido() {
        
    }
    
    public ItemDePedido(String nome, double preco, int quantidade) throws RuntimeException {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setNome(String nome) throws RuntimeException {
        if (nome.isEmpty()) {
            throw new RuntimeException("Nome do item não pode ser vazio!");
        } else {
            this.nome = nome;
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setPreco(double preco) throws RuntimeException {
        if(preco < 0) {
            throw new RuntimeException("Preço não pode ser negativo!");
        } else {
            this.preco = preco;
        }
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setQuantidade(int quantidade) throws RuntimeException {
        if(quantidade <= 0) {
            throw new RuntimeException("Quantidade não pode ser nula ou negativa!");
        } else {
            this.quantidade = quantidade;
        }
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setIdPedido(int id) {
        this.id_pedido = id;
    }
    
    public int getIdPedido() {
        return this.id_pedido;
    }
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = this.preco * this.quantidade;
	}
	
	public double getValorTotal() {
		return this.valorTotal;
	}
}
