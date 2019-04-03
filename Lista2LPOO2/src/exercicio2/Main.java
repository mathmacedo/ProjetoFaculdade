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
        SistemaPedidos novoSistemaPedidos = new SistemaPedidos();
        int escolha;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1- Incluir Pedido");
            System.out.println("2 - Excluir Pedido Por Nome do Cliente");
            System.out.println("3 - Listar Pedidos");
            System.out.println("4 - Incluir Item de Pedido em Pedido");
            System.out.println("5 - Excluir Item de Pedido em Pedido");
            System.out.println("6 - Imprimir a Lista de Pedidos");
            System.out.println("7 - Sair");
            escolha = sc.nextInt();
            
            if(escolha == 1) {
                novoSistemaPedidos.incluirPedido();
            } else if(escolha == 2) {
                novoSistemaPedidos.excluirPedido();
            } else if(escolha == 3) {
               novoSistemaPedidos.listarPedidos();
            } else if(escolha == 4) {
              novoSistemaPedidos.incluirItemDePedido();
            } else if(escolha == 5) {
              novoSistemaPedidos.excluirItemDePedido();
            } else if(escolha == 6) {
              novoSistemaPedidos.imprimirListaDePedidos();
            } else if(escolha == 7) {
                System.out.println("Adeus!");
                break;
            } else {
                System.out.println("Opção invalida!");
            }
        } while(true);
    }
}


