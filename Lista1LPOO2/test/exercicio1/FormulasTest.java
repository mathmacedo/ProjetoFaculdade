/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

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
    public void testAreaRetanguloPositivo() {
        double result = Formulas.areaRetangulo(2, 2);
        assertEquals(4, result, 0.0);
    }

    @Test
    public void testAreaRetanguloNegativo() {
        try {
            double result = Formulas.areaRetangulo(-2, 2);
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("Número negativo não permitidos", e.getMessage());
        }
    }

    @Test
    public void testCalculaAreaCircunferenciaPositvo() {
        double result = Formulas.calculaAreaCircunferencia(3);
        assertEquals(28.26, result, 0.0);
    }

    @Test
    public void testCalculaAreaCircunferenciaNegativo() {
        try {
            double result = Formulas.calculaAreaCircunferencia(-3);
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("Número negativos não permitidos", e.getMessage());
        }
    }

    @Test
    public void testCalculaAreaTrianguloPositivo() {
        double result = Formulas.calculaAreaTriangulo(2, 2);
        assertEquals(2, result, 0.0);
    }

    @Test
    public void testCalculaAreaTrianguloNegativo() {
        try {
            double result = Formulas.calculaAreaTriangulo(-2, -2);
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("Número negativos não permitidos", e.getMessage());
        }
    }

}
