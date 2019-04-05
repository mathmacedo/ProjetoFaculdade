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
    public double salarioBruto;
    public double salarioLiquido;

    public double[] receberParametros() {
        Scanner sc1 = new Scanner(System.in);
        do {
            try {
                System.out.println("Digite o valor da hora : ");
                this.valorHora = sc1.nextDouble();
                System.out.println("Digite a quatidade de horas trabalhadas no mês : ");
                this.horasTrabalhadas = sc1.nextDouble();
                System.out.println("Digite a porcentagem do INSS : ");
                this.porcentagemInss = sc1.nextDouble();
                this.salarioBruto = Formulas.calculoSalarioBruto(this.valorHora, this.horasTrabalhadas);
                this.salarioLiquido = Formulas.calculoSalarioLiquido(this.salarioBruto, this.porcentagemInss);
                System.out.println(Formulas.calculoSalarioBruto(this.valorHora, this.horasTrabalhadas));
                System.out.println(Formulas.calculoSalarioLiquido(this.salarioBruto, this.porcentagemInss));
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
                System.out.println("Tipo errado, digite novamente : ");
                sc1.nextLine();
            }
        } while (true);

        double[] valores = {this.valorHora, this.horasTrabalhadas, this.porcentagemInss, this.salarioBruto, this.salarioLiquido};
        return valores;
    }

    public void imprimirResultado(double valorHora, double horasTrabalhadas, double salarioBruto, double salarioLiquido) {
        System.out.println("Extrato do salário");
        System.out.println("Valor Hora: R$ " + valorHora);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas + " horas");
        System.out.println("Sálario Bruto: R$ " + salarioBruto);
        System.out.println("Sálario Liquido: R$ " + salarioLiquido);
    }
}
