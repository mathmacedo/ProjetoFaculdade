/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author macedo
 */
public class Circunferencia {
	
	private double raio;
	private double area;
	
	public Circunferencia() {
		
	}
	
	public Circunferencia(double raio) throws RuntimeException {
		if (raio < 0 ) {
			throw new RuntimeException("Números negativos não permitidos");
		}
		this.raio = raio;
	}
	
	public double setRaio(double raio) {
		this.raio = raio; 
		return raio;
	}
	
	public double getaio() {
		return this.raio;
	}
	
	public double area() {
		
		return this.area;
	}
	
}
