/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macedo
 */
public class ContatoTest {
    
    @Test
    public void testSetId() {
        Contato novoContato = new Contato();
        novoContato.setId(1);
    }
    
    @Test
    public void testSetIdNegativo() {
        try {
            Contato novoContato = new Contato();
            novoContato.setId(-1);
            fail("Teste deu Errado");
        } catch (RuntimeException e) {
            assertEquals("ID não pode ser negatio e igual a 0!", e.getMessage());
        }
    }
    
    @Test
    public void testSetNome() {
        Contato novoContato = new Contato();
        novoContato.setNome("matheus");
    }
    
    @Test
    public void testSetNomeVazio() {
        try {
            Contato novoContato = new Contato();
            novoContato.setNome("");
            fail("Teste deu errado");
        } catch(RuntimeException e) {
            assertEquals("Nome não pode ser vazio!", e.getMessage());
        }
    }
    
    @Test
    public void testSetEmail() {
        Contato novoContato = new Contato();
        novoContato.setEmail("matheus@google.com");
    }
    
    @Test
    public void testSetEmailVazio() {
        try {
            Contato novoContato = new Contato();
            novoContato.setEmail("");
            fail("Teste deu errado!");
        } catch(RuntimeException e) {
            assertEquals("Email não pode ser vazio!", e.getMessage());
        }
    }
    
    @Test 
    public void testSetEndereco() {
        Contato novoContato = new Contato();
        novoContato.setEndereco("João Havro 2155");
    }
    
    @Test 
    public void testSetEnderecoVazio() {
        try {
            Contato novContato = new Contato();
            novContato.setEndereco("");
            fail("Teste deu errado!");
        } catch(RuntimeException e) {
            assertEquals("Endereco não pode ser vazio!", e.getMessage());
        }
    }
}
