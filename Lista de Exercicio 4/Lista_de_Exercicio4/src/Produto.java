public class Produto {
    private String nome;
    private double precoUnitario;
    private int codigoProduto;

    public Produto(String nome, double precoUnitario, int codigoProduto) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.codigoProduto = codigoProduto;
    }

    //Getter

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    //Setter


    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
