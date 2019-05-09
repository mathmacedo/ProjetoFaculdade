/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author macedo
 */
public class UsaBicicleta {
	 public static void main(String[] args) {
		
		int decremento = 3;
		
		Bicicleta bici = new Bicicleta() {
			public void aplicarFreios(int decremento) {
				this.velocidade = this.velocidade - 2 * decremento;
			}
		};
		bici.printStates();
	}
}
