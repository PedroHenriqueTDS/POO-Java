package Professor;

public class Main {
    public static void main(String[] args) {
        //criar objeto Professor
        Professor professor1 = new Professor(123456, "João Silva", "Ciência da Computação");

        // Imprimindo as informações do professor
        System.out.println("Informações do Professor:");
        professor1.imprimirInformacoes();

        // alterando a matrícula do professor
        professor1.setMatricula(654321);

        // alterando o departamento do professor
        professor1.setDepartamento("Engenharia de Software");

        // imprimindo as informações atualizadas do professor
        System.out.println("\nInformações atualizadas do Professor:");
        professor1.imprimirInformacoes();
    }
}
