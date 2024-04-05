package Quadrado;

public class Quadrado {
    // Atributo
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // calcular a área
    public double calcularArea() {
        return lado * lado;
    }

    // calcular o perímetro
    public double calcularPerimetro() {
        return 4 * lado;
    }

    //imprimir os valores do lado, área e perímetro
    public void imprimir() {
        System.out.println("Lado do quadrado: " + lado);
        System.out.println("Área do quadrado: " + calcularArea());
        System.out.println("Perímetro do quadrado: " + calcularPerimetro());
    }
}