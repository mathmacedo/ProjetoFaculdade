/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.facade;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.dao.ClienteDAO;
import java.util.List;

/**
 *
 * @author macedo
 */
public class ClienteFacede {
	private static ClienteDAO clienteDAO = new ClienteDAO(); 
	
	public static List<Cliente> getAllClientes() {
		List<Cliente> listaDeTodoClientes = clienteDAO.getAllCliente();
		return listaDeTodoClientes;
	}
	
	public static Cliente getCliente(int id) {
		Cliente cliente = clienteDAO.buscarCliente(id);
		return cliente;
	}
	
	public static void removerCliente(int id) {
		clienteDAO.removerCliente(id);
	}
	
	public static void alterarCliente(Cliente cliente) {
		clienteDAO.alterarCliente(cliente);
	}
	
	public static void inserirCliente(Cliente cliente) {
		clienteDAO.inserirCliente(cliente);
	}
}
