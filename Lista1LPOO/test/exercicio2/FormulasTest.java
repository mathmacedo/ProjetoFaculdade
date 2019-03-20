/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macedo
 */
public class FormulasTest {
    @Test
    public void testCalculoSalarioBrutoPositivo() {
        double result = Formulas.calculoSalarioBruto(10, 160);
        assertEquals(1600, result, 0.0);
    }
    
    @Test
    public void testCalculoSalarioBrutoNegativo() {
        try {
            double result = Formulas.calculoSalarioBruto(-100, -50);
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("Números negativos não permitidos", e.getMessage());
        }
    }

    @Test
    public void testCalculoSalarioLiquidoPositivo() {
        double result = Formulas.calculoSalarioLiquido(1600, 9);
        assertEquals(1456, result, 0.0);
    }
    
    @Test
    public void testCalculoSalarioLiquidoNegativo() {
        try {
            double result = Formulas.calculoSalarioLiquido(-1600, -9);
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("Números negativos não permitidos", e.getMessage());
        }
    }
}
