/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

/**
 *
 * @author macedo
 */
public class VelocidadeMedia {
	public static void main(String[] args) {
		double tempoGasto;
		double distancia;
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Digite o tempo gasto");
		tempoGasto = sc.nextDouble();
		System.out.println ("Digite a distância percorrida");
		distancia = sc.nextDouble();
		
		BigDecimal tempoGastoBd = new BigDecimal(tempoGasto, MathContext.DECIMAL64);
		BigDecimal distanciaBd = new BigDecimal(distancia, MathContext.DECIMAL64);
		
		BigDecimal resultado;
		
		resultado = distanciaBd.divide(tempoGastoBd);
		
		System.out.println("Velocidade média igual á " + resultado.setScale(3));
	}
}
