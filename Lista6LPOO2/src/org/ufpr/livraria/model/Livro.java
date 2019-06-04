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
public class Livro {
	private int id;
	private String titulo; 
	private String assunto;
	private String codigoIsbn; 
	private LocalDate dateDePublicacao;
	
	public Livro() {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public void setCodigoIsbn(String codigoIsbn) {
		this.codigoIsbn = codigoIsbn;
	}

	public void setDateDePublicacao(LocalDate dateDePublicacao) {
		this.dateDePublicacao = dateDePublicacao;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAssunto() {
		return assunto;
	}

	public String getCodigoIsbn() {
		return codigoIsbn;
	}

	public LocalDate getDateDePublicacao() {
		return dateDePublicacao;
	}
	
}
