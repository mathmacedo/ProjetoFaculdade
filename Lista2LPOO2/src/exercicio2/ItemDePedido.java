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
    private int quantidade;

    public ItemDePedido(String nome, double preco, int quantidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
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
        if (preco < 0) {
            throw new RuntimeException("Preço do item não pode ser negativo!");
        } else {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setQuantidade(int quantidade) throws RuntimeException {
        if (quantidade <= 0) {
            throw new RuntimeException("Quantidade não pode ser negativo!");
        } else {
            this.quantidade = quantidade;
        }
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
