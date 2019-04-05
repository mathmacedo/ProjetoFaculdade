/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author macedo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        double ladoa = 0.0;
        double ladob = 0.0;
        double raio = 0.0;
        double base = 0.0;
        double altura = 0.0;
        int escolha = 0;

        System.out.println("Digite 1 para calcular Área do retângulo, Digite 2 para calcular Área da Circunferencia, Digite 3 para calcular Área do Triângulo");
        escolha = sc1.nextInt();

        if (escolha == 1) {
            do {
                try {
                    System.out.println("Digite lado a do triangulo : ");
                    ladoa = sc1.nextDouble();
                    System.out.println("Digite lado b do triangulo : ");
                    ladob = sc1.nextDouble();
                    System.out.println(Formulas.areaRetangulo(ladoa, ladob));
                    break;
                } catch (RuntimeException e) {
                    System.out.println("Digite somentes valores positivos");
                }
            } while (true);
        } else if (escolha == 2) {
            do {
                try {
                    System.out.println("Digite o raio :  ");
                    raio = sc1.nextDouble();
                    System.out.println(Formulas.calculaAreaCircunferencia(raio));
                    break;
                } catch (RuntimeException e) {
                    System.out.println("Digite somentes valores positivos");
                }
            } while (true);
        } else {
            do {
                try {
                    System.out.println("Digite a base : ");
                    base = sc1.nextDouble();
                    System.out.println("Digite a altura : ");
                    altura = sc1.nextDouble();
                    System.out.println(Formulas.calculaAreaTriangulo(base, altura));
                    break;
                } catch (RuntimeException e) {
                    System.out.println("Digite somentes valores positivos");
                }
            } while (true);
        }
    }
}
