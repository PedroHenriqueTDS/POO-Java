public class Retangulo {
    // Atributos
    private double comprimento;
    private double largura;

    // Construtor
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // calcular a área
    public double calcularArea() {
        return comprimento * largura;
    }

    //calcular o perímetro
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    //imprimir os valores dos atributos, área e perímetro
    public void imprimir() {
        System.out.println("Comprimento do retângulo: " + comprimento);
        System.out.println("Largura do retângulo: " + largura);
        System.out.println("Área do retângulo: " + calcularArea());
        System.out.println("Perímetro do retângulo: " + calcularPerimetro());
    }
}
