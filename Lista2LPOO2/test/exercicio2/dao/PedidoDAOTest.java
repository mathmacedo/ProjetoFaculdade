/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.dao;

import exercicio2.model.ItemDePedido;
import exercicio2.model.Pedido;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macedo
 */
public class PedidoDAOTest {
	@Test
	public void testIncluirPedido() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		Pedido pedido = new Pedido();
		pedido.setNomeCliente("Matheus");
		pedido.setValorTotalPermitido(100.0);
		pedidoDAO.incluirPedido(pedido);
	}
	
	@Test
	public void testInlcuirPedidoErrado() {
		try {
			PedidoDAO pedidoDAO = new PedidoDAO();
			Pedido pedido = new Pedido();
			pedido.setNomeCliente("");
			pedido.setValorTotalPermitido(-1);
			pedidoDAO.incluirPedido(pedido);
			fail("Teste deu Errado!");
		} catch(RuntimeException e) {
			System.out.println("Erro : " + e.getMessage());
		}
	}
	
	@Test
	public void testExcluirPedido() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		String nomeCliente = "Matheus";
		pedidoDAO.excluirPedido(nomeCliente);
	}
	
	@Test
	public void testListarPedidosPorNome() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		String nomeCliente = "Matheus";
		pedidoDAO.listarPedidosPorNome(nomeCliente);
	}
	
	@Test
	public void testPedidoPorNomeCliente() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		String nomeCliente = "Matheus";
		pedidoDAO.pedidoPorNomeCliente(nomeCliente);
	}
	
	@Test
	public void testItemDePedidoPorNomeItem() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		String nomeItem = "Teste";
		int idPedido = 1;
		pedidoDAO.itemDePedidoPorNomeItem(nomeItem, idPedido);
	}
	
	@Test
	public void testInserirItemDePedido() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		ItemDePedido itemDePedido = new ItemDePedido();
		itemDePedido.setIdPedido(1);
		itemDePedido.setNome("Teste");
		itemDePedido.setPreco(10);
		itemDePedido.setQuantidade(1);
		pedidoDAO.inserirItemDePedido(itemDePedido, itemDePedido.getIdPedido());
	}
	
	@Test 
	public void testExcluirItemDePedido() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		int idPedido = 1;
		pedidoDAO.excluirItemDePedido(idPedido);
	}
	
	@Test
	public void testGetAllPedidos() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		pedidoDAO.getAllPedidos();
	}
	
	@Test
	public void testGetAllItemDePedidos() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		pedidoDAO.getAllItemDePedidos();
	}
}
