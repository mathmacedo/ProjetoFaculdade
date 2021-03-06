/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.ArrayList;
import java.util.List;
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
        double raio;
        double lado1;
        double lado2;
        double base;
        double altura;
        List novaLista = new ArrayList();

        System.out.println("Quantas formas deseja criar ?");
        numeroFormas = sc.nextInt();

        for (int i = 0; i < numeroFormas; i++) {
            System.out.println("Digite 1 para Circunferencia, 2 para Retangulo, 3 para Triangulo, 4 para Encerrar.");
            escolha = sc.nextInt();

            if (escolha == 1) {
                do {
                    try {
                        System.out.println("Digite o raio ");
                        raio = sc.nextDouble();
                        Circunferencia novaCircunferencia = new Circunferencia(raio);
                        novaLista.add(novaCircunferencia.area());
                        break;
                    } catch (RuntimeException e) {
                        System.out.println(e);
                    }
                } while (true);
            }

            if (escolha == 2) {
                do {
                    try {
                        System.out.println("Digite o lado1: ");
                        lado1 = sc.nextDouble();
                        System.out.println("Digite o lado2: ");
                        lado2 = sc.nextDouble();
                        Retangulo novoRetangulo = new Retangulo(lado1, lado2);
                        novaLista.add(novoRetangulo.area());
                        break;
                    } catch (RuntimeException e) {
                        System.out.println(e);
                    }
                } while (true);
            }

            if (escolha == 3) {
                do {
                    try {
                        System.out.println("Digite a base: ");
                        base = sc.nextDouble();
                        System.out.println("Digite a altura: ");
                        altura = sc.nextDouble();
                        Triangulo novoTriangulo = new Triangulo(base, altura);
                        novaLista.add(novoTriangulo.area());
                        break;
                    } catch (RuntimeException e) {
                        System.out.println(e);
                    }
                } while (true);
            }

            if (escolha == 4) {
                break;
            }
        }

        for (Object i : novaLista) {
            System.out.println("Valor da área igual = " + i);
        }

    }

}
