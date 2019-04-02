/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author macedo
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valorTotal;
        String nomeCliente;
        int escolha = 0;
        
        System.out.println("1 - Incluir Pedido \n 2 - Excluir Pedido por Nome do Cliente \n 3 - Listar Pedidos \n 4 -  Incluir Item de Pedido em Pedido \n 5 - Excluir Item de Pedido em Pedido \n 6 - Imprimir a Lista de Pedidos");
        
        try {
            escolha = sc.nextInt();
        } catch(RuntimeException e) {
            System.out.println(e);
        }
        
        if (escolha == 1) {
            do {
                try {
                    System.out.println("Digite o valor total : ");
                    valorTotal = sc.nextDouble();
                    System.out.println("Digite o nome do cliente : ");
                    nomeCliente = sc.nextLine();
                    sc.next();
                    Pedido novoPedido = new Pedido(valorTotal, nomeCliente);
                    break;
                } catch (RuntimeException e) {
                    System.out.println(e);
                }
            } while (true);
        }
        
    }
}
