/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macedo
 */
public class ItemDePedidoTest {
	@Test
	public void testSetNome() {
		ItemDePedido itemDePedido = new ItemDePedido();
		itemDePedido.setNome("teste");
	}
	
	@Test
	public void testSetNomeErrado() {
		try {
			ItemDePedido itemDePedido = new ItemDePedido();
			itemDePedido.setNome("");
			fail("Teste deu Errado!");
		} catch(RuntimeException e) {
			System.out.println("Nome do item não pode ser vazio!" + e.getMessage());
		}
	}
	
	@Test
	public void testSetPreco() {
		ItemDePedido itemDePedido = new ItemDePedido();
		itemDePedido.setPreco(100.0);
	}
	
	@Test
	public void testSetPrecoErrado() {
		try {
			ItemDePedido itemDePedido = new ItemDePedido();
			itemDePedido.setPreco(-1);
			fail("Teste deu Errado!");
		} catch(RuntimeException e) {
			System.out.println("Preço não pode ser negativo!" + e.getMessage());
		}
	}
	
	@Test
	public void testSetQuantidade() {
		ItemDePedido itemDePedido = new ItemDePedido();
		itemDePedido.setQuantidade(1);
	}
	
	@Test
	public void testSetQuantidadeErrado() {
		try {
			ItemDePedido itemDePedido = new ItemDePedido();
			itemDePedido.setQuantidade(-1);
			fail("Teste deu Errado!");
		} catch(RuntimeException e) {
			System.out.println("Quantidade não pode ser nula ou negativa!" + e.getMessage());
		}
	}
}
