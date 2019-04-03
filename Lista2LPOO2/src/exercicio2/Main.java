/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author macedo
 */
public class Main {
	
	private static List<Pedido> novaListaPedido = new ArrayList<>();
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
		List<Pedido> novaListaPedido = new ArrayList<>();
        int escolha = 0;
		Pedido novoPedido = null;
        
        System.out.println("1 - Incluir Pedido \n 2 - Excluir Pedido por Nome do Cliente \n 3 - Listar Pedidos \n 4 -  Incluir Item de Pedido em Pedido \n 5 - Excluir Item de Pedido em Pedido \n 6 - Imprimir a Lista de Pedidos");
        
        try {
            escolha = sc.nextInt();
        } catch(RuntimeException e) {
            System.out.println(e);
        }
        
        if (escolha == 1) {
			do {
				try {
					double valorTotalPermitido;
					String nomeCliente;
					System.out.println("Digite o valor total : ");
					valorTotalPermitido = sc.nextDouble();
					System.out.println("Digite o nome do cliente : ");
					nomeCliente = sc.nextLine();
					sc.next();
					novoPedido = new Pedido(nomeCliente, valorTotalPermitido);
					novaListaPedido.add(novoPedido);
					break;
				} catch(RuntimeException e) {
					System.out.println(e);
				}
			} while(true);
		} else if (escolha == 2) {
			do {
				try {
					String nomeCliente; 
					System.out.println("Digite o nome do cliente");
					nomeCliente = sc.nextLine();
					sc.next();
					for(Pedido i : novaListaPedido) {
						if (i.getNomeCliente()== nomeCliente) {
							novaListaPedido.remove(i);
						} else {
							System.out.println("Pedido não existe.");
						}
					}
					break;
				} catch(RuntimeException e) {
					System.out.println(e);
				}
			} while(true);
		} else if (escolha == 3) {
			do {
				try {
					String nomeCliente;
					System.out.println("Digite o nome do cliente!");
					nomeCliente = sc.nextLine();
					sc.next();
					for(Pedido i : novaListaPedido) {
						if (i.getNomeCliente()== nomeCliente) {
							System.out.println();
						} else {
							System.out.println("Pedido não existe.");
						}
					}
				} catch(RuntimeException e) {
					System.out.println(e);
				}
			} while(true);
		}
        
    }
}
