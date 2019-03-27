/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macedo
 */
public class RetanguloTest {
	@Test
	public void testCircufenreciaPositivo() {
		Retangulo novoRetangulo = new Retangulo(3,3);
		assertEquals(9, novoRetangulo.area(), 0.0);
	}
	
	@Test
	public void testCircunferenciaNegativo() {
		try {
			Retangulo novoRetangulo = new Retangulo(-3,-3);
			fail("Teste deu Errado");
		} catch(RuntimeException e) {
			assertEquals("Números negativos não permitidos", e.getMessage());
		}
	}
}
