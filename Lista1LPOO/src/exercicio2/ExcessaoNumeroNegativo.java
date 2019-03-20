/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author macedo
 */
public class ExcessaoNumeroNegativo extends Exception{
	public ExcessaoNumeroNegativo() {
        super("Números negativos não permitidos!");
    }
}
