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
public class SistemaPedidos {
    private Pedido novoPedido = null;
    private List<Pedido> listaDePedidos = new ArrayList<>();
    
    public void incluirPedido() {
        String nomeCliente;
        double valorTotal;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite nome");
                nomeCliente = sc.nextLine();
                System.out.println("Digite o valor total : ");
                valorTotal = sc.nextDouble();
                this.novoPedido = new Pedido(nomeCliente, valorTotal);
                this.listaDePedidos.add(this.novoPedido);
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public void incluirItemDePedido() {
        String nomeCliente;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite nome do cliente : ");
                nomeCliente = sc.nextLine();
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public void excluirPedido() {
        String nomeCliente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nome do Cliente : ");
        nomeCliente = sc.nextLine();
        boolean excluido = false;
        for(Pedido i : this.listaDePedidos) {
            if(i.getNomeCliente().equals(nomeCliente)) {
                excluido = true;
                this.listaDePedidos.remove(i);
            }
        }
        if (excluido == true) {
            System.out.println("Pedido Excluido com Sucesso!");
        } else {
            System.out.println("Pedido não Existe!");
        }
    }
    
    public void listarPedidos() {
        for(Pedido i : this.listaDePedidos) {
            System.out.println("Nome do cliente " + i.getNomeCliente());
            System.out.println("Itens : " + i.getListaDeItens());
            System.out.println("Valor total pedido : " + i.getValorTotalPedido());
            System.out.println("Valor total permitido : " + i.getValorTotalPermitido());
        }
    }
    
    public void excluirItemDePedido() {
        String nomeItem;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite nome do item : ");
                nomeItem = sc.nextLine();
                novoPedido.retirarItem(nomeItem);
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public void imprimirListaDePedidos() {
        for(Pedido i : this.listaDePedidos) {
            this.toString();
        }
    }
}
