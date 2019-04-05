/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author macedo
 */
public class Contato {

    private long id;
    private String nome;
    private String email;
    private String endereco;
    private Calendar dataNascimento;

    public Contato() {

    }

    public long getId() {
        return this.id;
    }

    public void setNome(String nome) throws RuntimeException {
        if (nome == null) {
            throw new RuntimeException("Nome não pode ser nulo!");
        }
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) throws RuntimeException {
        if (email == null) {
            throw new RuntimeException("Email não pode ser vazio!");
        }
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEndereco(String endereco) throws RuntimeException {
        if (endereco == null) {
            throw new RuntimeException("Endereço não pode ser vazio!");
        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setDataNascimento(Calendar dataNascimento) throws RuntimeException {
        if (dataNascimento == null) {
            throw new RuntimeException("Data de Nascimento não pode ser vazia!");
        }
        this.dataNascimento = dataNascimento;
    }

    public Calendar getDataNascimento() {
        return this.dataNascimento;
    }
}
