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
public class Formulas {

    public static double areaRetangulo(double lado1, double lado2) throws RuntimeException {
        if (lado1 < 0 || lado2 < 0) {
            throw new RuntimeException("Número negativo não permitidos");
        }
        return lado1 * lado2;
    }

    public static double calculaAreaCircunferencia(double raio) {
        if (raio < 0) {
            throw new RuntimeException("Número negativos não permitidos");
        }
        return (raio * raio) * 3.14;
    }

    public static double calculaAreaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new RuntimeException("Número negativos não permitidos");
        }
        return (base * altura) / 2;
    }
}
