/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import model.Contato;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macedo
 */
public class ContatoDAOTest {
    
    @Test
    public void testAlteraContato() {
        ContatoDAO novoContatoDAO = new ContatoDAO();
        Contato novoContato = new Contato();
        Calendar calendar = new GregorianCalendar(2018, 10, 28);
        novoContato.setDataNascimento(calendar);
        novoContato.setId(6);
        novoContatoDAO.altera(novoContato);
    }
    
    @Test
    public void testAlteraContatoNaoExistente() {
        try {
            ContatoDAO novoContatoDAO = new ContatoDAO();
            Contato novoContato = new Contato();
            Calendar calendar = new GregorianCalendar(2018, 10, 28);
            novoContato.setId(100);
            novoContatoDAO.altera(novoContato);
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("Contato não encontrado", e.getMessage());
        }
    }
 
    @Test
    public void testRemoveContato() {
        ContatoDAO novoContatoDAO = new ContatoDAO();
        Contato novoContato = new Contato();
        novoContato.setId(3);
        novoContatoDAO.remove(novoContato);
    }
    
    @Test
    public void testRemoveContatoNaoExistente() {
        try {
            ContatoDAO novoContatoDAO = new ContatoDAO();
            Contato novoContato = new Contato();
            novoContato.setId(3);
            novoContatoDAO.remove(novoContato);
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("Contato não encontrado", e.getMessage());
        }
    }
    
    @Test
    public void testInsereContato() {
        ContatoDAO novoContatoDAO = new ContatoDAO();
        Contato novoContato = new Contato();
        Calendar calendar = new GregorianCalendar(2018, 10, 28);
        novoContato.setNome("Matheus");
        novoContato.setEmail("teste@teste.com");
        novoContato.setEndereco("teste 123");
        novoContato.setEndereco("teste 123");
        novoContato.setDataNascimento(calendar);
    }
    
    @Test
    public void testInsereContatoErrado() {
        try {
            ContatoDAO novoContatoDAO = new ContatoDAO();
            Contato novoContato = new Contato();
            Calendar calendar = new GregorianCalendar(2018, 10, 28);
            novoContato.setNome("");
            novoContato.setEmail("teste@teste.com");
            novoContato.setEndereco("teste 123");
            novoContato.setEndereco("teste 123");
            novoContato.setDataNascimento(calendar);
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("Nome não pode ser vazio!", e.getMessage());
        }
    }
}
