public class Circulo {
    //Atributo
    private double raio;
    private final double PI = 3.14;

    //Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método calcular
    public double calcularArea() {
        return PI * raio * raio;
    }

    // cal perímetro
    public double calcularPeri() {
        return 2 * PI * raio;
    }

    //imprimir os valores do raio, área e perímetro
    public void imprimir() {
        System.out.println("Raio do círculo: " + raio);
        System.out.println("Área do círculo: " + calcularArea());
        System.out.println("Perímetro do círculo: " + calcularPeri());
    }
}
