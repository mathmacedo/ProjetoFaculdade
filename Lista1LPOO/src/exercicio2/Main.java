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
public class Main {
	public static void main(String[] args) {
        double[] valores = {};
		
		Funcionario novoFuncionario = new Funcionario();
		ReceberDadosDigitados novosDados = new ReceberDadosDigitados();

        valores = novosDados.receberParametros();
        novoFuncionario.setValorHora(valores[0]);
		novoFuncionario.setHorasTrabalhadas(valores[1]);
		novoFuncionario.setPorcentagemInss(valores[2]);
        novoFuncionario.setSalarioBruto(valores[3]);
        novoFuncionario.setSalarioLiquido(valores[4]);

        novosDados.imprimirResultado(novoFuncionario.getValorHora(), novoFuncionario.getHorasTrabalhadas(), novoFuncionario.getSalarioBruto(), novoFuncionario.getSalarioLiquido());

    }
}
