/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import exercicio2.dao.PedidoDAO;
import exercicio2.model.ItemDePedido;
import exercicio2.model.Pedido;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author macedo
 */
public class SistemaPedidos {
    public void escolherOpcao() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Digite 1 - Incluir Pedido");
            System.out.println("Digite 2 - Excluir Pedido por Nome de Cliente");
            System.out.println("Digite 3 - Listar Pedidos por Nome de Cliente");
            System.out.println("Digite 4 - Incluir Item de Pedido por Nome de Cliente");
            System.out.println("Digite 5 - Excluir Item de Pedido por Nome de Cliente");
            System.out.println("Digite 6 - Imprimir Lista de Pedidos");
            System.out.println("Digite 7 - Sair");

            opcao = sc.nextInt();

            if (opcao == 1) {
                this.incluirPedido();
            } else if (opcao == 2) {
                this.excluirPedido();
            } else if (opcao == 3) {
                this.listarPedidosPorNomeCliente();
            } else if (opcao == 4) {
                this.incluirItemDePedidoPorNome();
            } else if (opcao == 5) {
                this.excluirItemDePedido();
            } else if (opcao == 6) {
              this.imprimirListaDePedidos();
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
    }
    
    public void incluirPedido() {
        PedidoDAO pedidoDAO = new PedidoDAO();
        String nomeCliente;
        double valorTotalPermitido;
        
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome do cliente : ");
                nomeCliente = sc.nextLine();
                System.out.println("Digite o valor total permitido : ");
                valorTotalPermitido = sc.nextDouble();
                Pedido novoPedido = new Pedido();
                novoPedido.setNomeCliente(nomeCliente);
                novoPedido.setValorTotalPermitido(valorTotalPermitido);
                pedidoDAO.incluirPedido(novoPedido);
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public void excluirPedido() {
        PedidoDAO pedidoDAO = new PedidoDAO();
        String nomeCliente;
        
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome do cliente : ");
                nomeCliente = sc.nextLine();
                pedidoDAO.excluirPedido(nomeCliente);
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
    }
    
    public void listarPedidosPorNomeCliente() {
        PedidoDAO pedidoDAO = new PedidoDAO();
        String nomeCliente;
        List<Pedido> listaDePedidos = null;
        
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome do cliente : ");
                nomeCliente = sc.nextLine();
                listaDePedidos = pedidoDAO.listarPedidosPorNome(nomeCliente);
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
        
        if(listaDePedidos != null) {
            for(Pedido i : listaDePedidos) {
                System.out.println("ID = " + i.getId());
                System.out.println("Nome Cliente = " + i.getNomeCliente());
                System.out.println("Valor Total Permitido = " + i.getValorTotalPermitido());
            }
        } else {
            System.out.println("Pedido não existe!");
        }
    }
    
    public void incluirItemDePedidoPorNome() {
        PedidoDAO pedidoDAO = new PedidoDAO();
        String nomeCliente;
        Pedido pedido = null;
        String nomeItem;
        double preco;
        int quantidade;
        
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome do cliente : ");
                nomeCliente = sc.nextLine();
                pedido = pedidoDAO.pedidoPorNomeCliente(nomeCliente);
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
        
        if(pedido.getNomeCliente() != null) {
            do {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o nome do item : ");
                    nomeItem = sc.nextLine();
                    System.out.println("Digite o preço do item : ");
                    preco = sc.nextDouble();
                    System.out.println("Digite a quantidade de itens : ");
                    quantidade = sc.nextInt();
                    ItemDePedido itemDePedido = new ItemDePedido();
                    itemDePedido.setNome(nomeItem);
                    itemDePedido.setPreco(preco);
                    itemDePedido.setQuantidade(quantidade);
                    itemDePedido.setIdPedido(pedido.getId());
                    pedidoDAO.inserirItemDePedido(itemDePedido, pedido.getId());
                    break;
                } catch (RuntimeException e) {
                    System.out.println(e);
                }
            } while (true);
        } else {
            System.out.println("Pedido não encontrado!");
        }
    }
    
    public void excluirItemDePedido() {
        PedidoDAO pedidoDAO = new PedidoDAO();
        String nomeCliente;
        Pedido pedido = null;
        ItemDePedido itemDePedido = new ItemDePedido();
        String nomeItem;
        
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome do cliente : ");
                nomeCliente = sc.nextLine();
                pedido = pedidoDAO.pedidoPorNomeCliente(nomeCliente);
                break;
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        } while (true);
        
        if(pedido.getNomeCliente() != null) {
            do {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o nome do item : ");
                    nomeItem = sc.nextLine();
                    itemDePedido = pedidoDAO.itemDePedidoPorNomeItem(nomeItem, pedido.getId());
                    break;
                } catch (RuntimeException e) {
                    System.out.println(e);
                }
            } while (true);
        } else {
            System.out.println("Pedido não existe");
        }
        
        if(itemDePedido.getNome() != null) {
            do {
                try {
                    pedidoDAO.excluirItemDePedido(pedido.getId());
                    break;
                } catch (RuntimeException e) {
                    System.out.println(e);
                }
            } while (true);
            System.out.println("Item excluído com sucesso!");
        } else {
            System.out.println("Item de pedido não existe");
        }
    }
    
    public void imprimirListaDePedidos() {
        PedidoDAO pedidoDAO = new PedidoDAO();
        List<Pedido> listaDePedidos = new ArrayList<Pedido>();
        listaDePedidos = pedidoDAO.getAllPedidos();
        List<ItemDePedido> listaDeItemDePedidos = new ArrayList<ItemDePedido>();
        listaDeItemDePedidos = pedidoDAO.getAllItemDePedidos();
        
        for(Pedido i : listaDePedidos) {
            System.out.println("Nome : " + i.getNomeCliente());
            for(ItemDePedido j : listaDeItemDePedidos) {
                if(j.getIdPedido()== i.getId()) {
                    System.out.println("Nome do Item : " + j.getNome() + " Valor do Item : " + j.getPreco());
                }
            }
        }
    }
}
