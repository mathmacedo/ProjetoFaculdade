/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author macedo
 */
public class ReceberDadosDigitados {
	public double valorHora; 
	public double horasTrabalhadas;
	public double porcentagemInss;
	
	public double[]  receberParametros() {
        Scanner sc1 = new Scanner(System.in);
		do {
			try {
				System.out.println("Digite o valor da hora : ");
				this.valorHora = sc1.nextDouble();
			} catch(RuntimeException e) {
				System.out.println(e);
				System.out.println("Tipo errado, digite novamente : ");
				sc1.nextLine();
			} 
		} while(true);


        try {
            System.out.println("Digite a quatidade de horas trabalhadas no mês : ");
            this.horasTrabalhadas = sc1.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println(e);
            System.out.println("Número negativo não permitido, digite novamente : ");
            sc1.nextLine();
            this.horasTrabalhadas = sc1.nextDouble();
        }

        try {
            System.out.println("Digite a porcentagem do INSS : ");
            this.porcentagemInss = sc1.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println(e);
            System.out.println("Número negativo não permitido, digite novamente : ");
            sc1.nextLine();
            this.porcentagemInss = sc1.nextDouble();
        }

        double[] valores = {this.valorHora, this.horasTrabalhadas, this.porcentagemInss};
        return valores;
    }
	
	public static void imprimirResultado(double valorHora, double horasTrabalhadas, double salarioBruto, double salarioLiquido) {
        System.out.println("Extrato do salário");
        System.out.println("Valor Hora: R$ " + valorHora);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas + " horas");
        System.out.println("Sálario Bruto: R$ " + salarioBruto);
        System.out.println("Sálario Liquido: R$ " +  salarioLiquido);
    }
}
