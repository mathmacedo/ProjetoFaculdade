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
    
    public void setId(long id) throws RuntimeException {
        if(id <= 0) {
            throw new RuntimeException("ID não pode ser negatio e igual a 0!");
        } else {
            this.id = id;
        }
    }
    
    public long getId() {
        return this.id;
    }
    
    public void setNome(String nome) throws RuntimeException {
        if(nome.isEmpty()) {
            throw new RuntimeException("Nome não pode ser vazio!");
        } else {
            this.nome = nome;
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setEmail(String email) throws RuntimeException {
        if(email.isEmpty()) {
            throw new RuntimeException("Email não pode ser vazio!");
        } else {
            this.email = email;
        }
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEndereco(String endereco) throws RuntimeException {
        if(endereco.isEmpty()) {
            throw new RuntimeException("Endereco não pode ser vazio!");
        } else {
            this.endereco = endereco;
        }
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setDataNascimento(Calendar dataNascimento) throws RuntimeException {
        this.dataNascimento = dataNascimento;
    }
    
    public Calendar getDataNascimento() {
        return this.dataNascimento;
    }
}
