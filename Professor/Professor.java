package Professor;

public class Professor {
    // Atributos
    private int matricula;
    private String nome;
    private String departamento;

    // Construtor
    public Professor(int matricula, String nome, String departamento) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }

    // gets e sets
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //imprimir o conteúdo dos atributos
    public void imprimirInformacoes() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
    }
}
