/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.model;

import javax.management.RuntimeErrorException;

/**
 *
 * @author macedo
 */
public class ItemDePedido {
    private String nome;
    private double preco;
    private int quantidade;
    
    public ItemDePedido() {
        
    }
    
    public ItemDePedido(String nome, double preco, int quantidade) throws RuntimeException {
        if(nome.isEmpty()) {
            throw new RuntimeException("Nome do item não pode ser vazio!");
        } else if(preco < 0) {
            throw new RuntimeException("Preço não pode ser negativo!");
        } else if(quantidade <= 0) {
            throw new RuntimeException("Quantiade não pode ser nula ou negativa!");
        } else {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    }
}
