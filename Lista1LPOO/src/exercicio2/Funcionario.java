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
public final class Funcionario {
	private double valorHora;
	private double horasTrabalhadas;
	private double porcentagemInss;
	
	public final Double setValorHora(Double valorHora) {
		this.valorHora = valorHora;
		return this.valorHora;
	}
	
	public Double getValorHora() {
		return this.valorHora;
	}
	
	public Double setHorasTrabalhadas(Double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
		return this.horasTrabalhadas;
	}
	
	public Double getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	
	public Double setPorcentagemInss(Double porcentagemInss) {
		this.porcentagemInss = porcentagemInss;
		return this.porcentagemInss;
	}
	
	public Double getPorcentagemInss() {
		return this.porcentagemInss;
	}
}
