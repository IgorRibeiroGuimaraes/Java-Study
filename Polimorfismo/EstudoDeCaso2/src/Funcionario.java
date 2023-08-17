public abstract class Funcionario {
    private int id;
    private String nome;
    private float salaraio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalaraio() {
        return salaraio;
    }

    public void setSalaraio(float salaraio) {
        this.salaraio = salaraio;
    }

    public Funcionario(int id, String nome, float salaraio) {
        this.id = id;
        this.nome = nome;
        this.salaraio = salaraio;
    }

}
