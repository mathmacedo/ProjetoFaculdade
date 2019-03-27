/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author macedo
 */
public class UsaFormas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroFormas;
		int escolha;
		
		System.out.println("Quantas formas deseja criar ?");
		numeroFormas = sc.nextInt();
		
		
		do {
			System.out.println("Digite 1 para Circunferencia, 2 para Retangulo, 3 para Triangulo, 4 para Encerrar.");
			escolha = sc.nextInt();
			break;
		} while(escolha != 1 || escolha != 2 || escolha != 3 ||escolha != 4);
	
}
