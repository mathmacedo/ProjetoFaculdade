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
public final class Funcionario {

    private double valorHora;
    private double horasTrabalhadas;
    private double porcentagemInss;
    private double salarioBruto;
    private double salarioLiquido;

    public final Double setValorHora(double valorHora) {
        this.valorHora = valorHora;
        return this.valorHora;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public double setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        return this.horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public double setPorcentagemInss(double porcentagemInss) {
        this.porcentagemInss = porcentagemInss;
        return this.porcentagemInss;
    }

    public double getPorcentagemInss() {
        return this.porcentagemInss;
    }

    public double setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
        return this.salarioBruto;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public double setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
        return this.salarioLiquido;
    }

    public double getSalarioLiquido() {
        return this.salarioLiquido;
    }
}
