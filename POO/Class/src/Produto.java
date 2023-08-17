public class Produto {
    public int codProduto;
    public String nome;

    public double precoUnitario;


    public Produto(int codProduto, String nome, double precoUnitario  ) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.precoUnitario = precoUnitario;


    }

    public String info(){
        return "Código: " + this.codProduto + " nome: " + this.nome + " Preco: " + this.precoUnitario;
    }
}

