/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojava.beans;

import java.io.Serializable;

/**
 *
 * @author macedo
 */
public class Aluno implements Serializable {
	private String nome;
	
	public Aluno() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
