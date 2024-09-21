package atividade04;

public class Calculadora {
    double base;
    double altura;

    public double getArea(double base, double altura) {
        this.base = base;
        this.altura = altura;
        return this.base * this.altura;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("\n " + calculadora.base + " x " + calculadora.altura + " = " + calculadora.getArea(5, 5));

        System.out.println("\n " + calculadora.base + " x " + calculadora.altura + " = " + calculadora.getArea(5, 10));

        System.out.println("\n " + calculadora.base + " x " + calculadora.altura + " = " + calculadora.getArea(2, 3) + "\n");
    }
}
