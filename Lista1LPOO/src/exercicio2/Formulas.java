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
public class Formulas {
	
    public static double calculoSalarioBruto(double valorHora, double horasTrabalhadas) throws RuntimeException {
		if (valorHora < 0 || horasTrabalhadas < 0) {
			throw new RuntimeException("Número negativo não permitidos");
		}
        return horasTrabalhadas * valorHora;
    }

    public static double calculoSalarioLiquido(double salarioBruto, double porcentagemInss) throws RuntimeException {
		if (salarioBruto < 0 || porcentagemInss < 0) {
			throw new RuntimeException("Número negativo não permitidos");
		}
		
        double descontoInss = salarioBruto * (porcentagemInss * 1 /100);
        double descontoIr = 0.0;
        double salarioLiquido = 0.0;
        if (salarioBruto - descontoInss <= 1903.98) {
            salarioLiquido = salarioBruto - descontoInss;
        } else if (salarioBruto - descontoInss >= 1903.99 && salarioBruto - descontoInss <= 2826.65) {
            descontoIr = (salarioBruto - descontoInss) * 0.075;
            salarioLiquido = salarioBruto - descontoInss - descontoIr;
        } else if (salarioBruto - descontoInss >= 2826.66 && salarioBruto - descontoInss <= 3751.05) {
            descontoIr = (salarioBruto - descontoInss) * 0.15;
            salarioLiquido = salarioBruto - descontoInss - descontoIr;
        } else if (salarioBruto - descontoInss >= 3751.06 && salarioBruto - descontoInss <= 4664.68) {
            descontoIr = (salarioBruto - descontoInss) * 0.225;
            salarioLiquido = salarioBruto - descontoInss - descontoIr;
        } else {
            descontoIr = (salarioBruto - descontoInss) * 0.275;
            salarioLiquido = salarioBruto - descontoInss - descontoIr;
        }

        return salarioLiquido;
    }
}
