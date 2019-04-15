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
        SistemaPedidos novoSistemaPedidos = new SistemaPedidos();
        do {
            novoSistemaPedidos.escolherOpcao();
        } while (true);
    }
}
