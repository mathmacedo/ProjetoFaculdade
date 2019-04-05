/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author macedo
 */
public class Usuario {

    private int id;
    private String nome;
    private String login;
    private String senha;

    public Usuario() {

    }

    public Usuario(String nome, String login, String senha) {
        this.setId(id);
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
    }

    public void setId(int id) throws RuntimeException {
        if (id <= 0) {
            throw new RuntimeException("ID não pode ser menor ou igual a 0!");
        } else {
            this.id = id;
        }
    }

    public int getId() {
        return this.id;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return this.nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String setLogin(String login) {
        this.login = login;
        return this.login;
    }

    public String getLogin() {
        return this.login;
    }

    public String setSenha(String senha) {
        this.senha = senha;
        return this.senha;
    }

    public String getSenha() {
        return this.senha;
    }
}
