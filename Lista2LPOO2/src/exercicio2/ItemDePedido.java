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
	
	public ItemDePedido(String nome, double preco, int quantidade) throws RuntimeException {
		if (nome == null || preco < 0 || quantidade <= 0) {
			throw new RuntimeException("Números negativos não permitidos e descrição não pode ser nula!");
		} else {
			this.nome = nome; 
			this.preco = preco;
			this.quantiade = quantidade;
		}
	}
	
	public String setNome(String nome) {
		this.nome = nome;
		return this.nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double setPreco(double preco) {
		this.preco = preco;
		return this.preco;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public int setQuatindade(int quantidade) {
		this.quantiade = quantidade;
		return this.quantiade;
	}
	
	public int getQuantidade() {
		return this.quantiade;
	}
}
