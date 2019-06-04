/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.livraria.model;

import java.time.LocalDate;


/**
 *
 * @author macedo
 */
public class Autor {
	private int id;
	private String nome;
	private LocalDate dataDeNascimento;
	private String documento;
	private String naturalidade; 
	
	public Autor() {
		
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public String getDocumento() {
		return documento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	
}
