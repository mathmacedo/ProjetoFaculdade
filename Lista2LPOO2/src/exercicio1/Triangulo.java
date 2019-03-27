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
public class Triangulo {
	private double base; 
	private double altura; 
	private double area;
	
	public Triangulo() {
		
	}
	
	public Triangulo(double base, double altura) throws RuntimeException {
		if(base < 0 || altura < 0) {
			throw new RuntimeException("Números negativos não permitidos");
		}
		this.base = base;
		this.altura = altura;
	}
	
	public double setBase(double base) {
		this.base = base;
		return this.base;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double setAltura(double altura) {
		this.altura = altura;
		return this.altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double area() {
		this.area = (this.base * this.altura) / 2;
		return this.area;
	}
}
