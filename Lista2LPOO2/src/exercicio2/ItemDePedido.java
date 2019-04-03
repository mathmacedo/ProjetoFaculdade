/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author macedo
 */
public class ItemDePedido {
	private String nome; 
	private double preco;
	private int quantiade; 
	
	public ItemDePedido() {
		
	}
	
	public ItemDePedido(String nome, double preco, int quantidade) {
		this.setNome(nome);
        this.setPreco(preco);
        this.setQuatindade(quantidade);
	}
	
	public void setNome(String nome) throws RuntimeException {
        if(nome == null) {
            throw new RuntimeException("Nome do Item não pode ser vazio.");
        }
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setPreco(double preco) throws RuntimeException {
		if(preco < 0) {
            throw new RuntimeException("Números negativos não permitidos.");
        }
        this.preco = preco;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setQuatindade(int quantidade) throws RuntimeException {
		if(quantidade < 0) {
            throw new RuntimeException("Números negativos não permitidos.");
        }
        this.quantiade = quantidade;
	}
	
	public int getQuantidade() {
		return this.quantiade;
	}
}
