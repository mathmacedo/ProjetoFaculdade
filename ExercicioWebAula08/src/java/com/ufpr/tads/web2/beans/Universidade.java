/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.beans;

/**
 *
 * @author macedo
 */

import java.io.Serializable;
import java.util.List;

public class Universidade implements Serializable {
	private List<String> cursos;
	
	public Universidade() {
		
	}
	
	public void setCursos(String curso) {
		this.cursos.add(curso);
	}
	
	public String[] getCursos() {
		String[] lista = {"TADS", "TNI", "TQG"};
		return lista; 
	}
}
