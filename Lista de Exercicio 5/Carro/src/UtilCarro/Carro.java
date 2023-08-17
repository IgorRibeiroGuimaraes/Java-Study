package UtilCarro;

public class Carro {
    private final int qtdeLugares;

    private String nome;

    private static String cor;

    public Carro(int qtdeLugares, String nome, String cor) {
        this.qtdeLugares = qtdeLugares;
        this.nome = nome;
        this.cor = cor;
    }

    public int getQtdeLugares() {
        return qtdeLugares;
    }

    public String getNome() {
        return nome;
    }

    public static String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return
                " Quantidade de Lugares = " + qtdeLugares +
                " nome = " + nome + " Cor = " + cor
                ;
    }
}
