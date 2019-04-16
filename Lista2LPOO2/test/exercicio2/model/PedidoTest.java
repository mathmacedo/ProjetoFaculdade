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
public class PedidoTest {
	@Test
	public void testSetNome() {
		Pedido novoPedido = new Pedido();
		novoPedido.setNomeCliente("matheus");
	}
	
	@Test
	public void testSetNomeErrado() {
		try {
            Pedido novoPedido = new Pedido();
            novoPedido.setNomeCliente("");
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("Nome não pode ser vazio!", e.getMessage());
        }
	}
	
	@Test
	public void testSetValorTotalPermitido() {
		Pedido novoPedido = new Pedido();
		novoPedido.setValorTotalPermitido(10.0);
	}
	
	@Test
	public void testSetValorTotalPermitidoErrado() {
		try {
			Pedido novoPedido = new Pedido();
			novoPedido.setValorTotalPermitido(-1);
			fail("Teste deu Errado !");
		} catch(RuntimeException e) {
			System.out.println("Valor total permitido não pode ser negativo!" + e.getMessage());
		}
	}
}
