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
public class Retangulo {

    private double lado1;
    private double lado2;
    private double area;
    private double perimetro;

    public Retangulo() {

    }

    public Retangulo(double lado1, double lado2) throws RuntimeException {
        if (lado1 < 0 || lado2 < 0) {
            throw new RuntimeException("Números negativos não permitidos");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double setLado1(double lado1) {
        this.lado1 = lado1;
        return this.lado1;
    }

    public double getLado1() {
        return this.lado1;
    }

    public double setLado2(double lado2) {
        this.lado2 = lado2;
        return this.lado2;
    }

    public double area() {
        this.area = this.lado1 * this.lado2;
        return this.area;
    }

    public double perimetro() {
        this.perimetro = 2 * (this.lado1 + this.lado2);
        return this.perimetro;
    }
}
