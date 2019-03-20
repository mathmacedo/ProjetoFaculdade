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
        double salarioBruto = 0.0;
        double salarioLiquido = 0.0;
		
		Funcionario novoFuncionario = new Funcionario();
		ReceberDadosDigitados novosDados = new ReceberDadosDigitados();

        valores = novosDados.receberParametros();
        novoFuncionario.setValorHora(valores[0]);
		novoFuncionario.setHorasTrabalhadas(valores[1]);
		novoFuncionario.setValorHora(valores[2]);

        salarioBruto = Formulas.calculoSalarioBruto(novoFuncionario.getValorHora(), novoFuncionario.getHorasTrabalhadas());
        salarioLiquido = Formulas.calculoSalarioLiquido(salarioBruto, novoFuncionario.getPorcentagemInss());

        novosDados.imprimirResultado(novoFuncionario.getValorHora(), novoFuncionario.getHorasTrabalhadas(), salarioBruto, salarioLiquido);

    }
}
