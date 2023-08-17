package Herenca;

public abstract class Funcionario {
    //Variaveis
    private String nome;
    private String document;

    //Construtor

    public Funcionario(String nome, String document) {
        this.nome = nome;
        this.document = document;
    }

    // Métodos Get and Set
    public String getNome() {
        return nome;
    }

    public abstract int getBonificao();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String toString(){
        return this.nome + " - " + this.document;
    }

}
