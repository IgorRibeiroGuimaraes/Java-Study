
public class Aluno {
    private String nome;
    private float Nota;

    public Aluno(String nome, float nota) {
        this.nome = nome;
        Nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return Nota;
    }

    public void setNota(float nota) {
        Nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", Nota=" + Nota +
                '}';
    }
}
