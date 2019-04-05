/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macedo
 */
public class Usuario {

    private String nome;
    private String login;
    private String senha;

    public Usuario() {

    }

    public Usuario(String nome, String login, String senha) {
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
    }

    private String setNome(String nome) {
        this.nome = nome;
        return this.nome;
    }

    public String getNome() {
        return this.nome;
    }

    private String setLogin(String login) {
        this.login = login;
        return this.login;
    }

    public String getLogin() {
        return this.login;
    }

    private String setSenha(String senha) {
        this.senha = senha;
        return this.senha;
    }

    public String getSenha() {
        return this.senha;
    }
}
