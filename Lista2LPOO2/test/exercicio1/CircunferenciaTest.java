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
public class CircunferenciaTest {
	@Test
	public void testCircufenreciaPositivo() {
		Circunferencia novaCircunferencia = new Circunferencia(3);
		assertEquals(3, novaCircunferencia.getaio(), 0.0);
	}
	
	@Test
	public void testCircunferenciaNegativo() {
		try {
			Circunferencia novaCircunferencia = new Circunferencia(-3);
			fail("Teste deu Errado");
		} catch(RuntimeException e) {
			assertEquals("Números negativos não permitidos", e.getMessage());
		}
	}
	
}
