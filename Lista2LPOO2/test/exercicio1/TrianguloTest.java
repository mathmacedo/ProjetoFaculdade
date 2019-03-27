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
public class TrianguloTest {
	@Test
	public void testTrianguloPositivo() {
		Triangulo novoTriangulo = new Triangulo(4,4);
		assertEquals(8, novoTriangulo.area(), 0.0);
	}
	
	@Test
	public void testTrianguloNegativo() {
		try {
			Triangulo novTriangulo = new Triangulo(-3,-3);
			fail("Teste deu Errado");
		} catch(RuntimeException e) {
			assertEquals("Números negativos não permitidos", e.getMessage());
		}
	}
}
