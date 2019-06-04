/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.livraria.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author macedo
 */
public class LivroTableModel extends AbstractTableModel {
	private String[] colunas=new String[]{"id","titulo", "assunto", "codigoIsbn","dataDePublicacao"};
	private List<Livro> lista=new ArrayList();
	
	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return this.colunas.length;
	}
	
	@Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
        Livro livro = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return livro.getId();
            case 1: return livro.getTitulo();
            case 2: return livro.getAssunto();
            case 3: return livro.getCodigoIsbn();
            case 4: return livro.getDateDePublicacao();
            default : return null;
        }
    }
	
}
