public class Produto {
    private int codigo;
    private String nome;
    private double precoUnitario;
    private String descricao;

    public Produto(int codigo, String nome, double precoUnitario, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
    }

    public void setPrecoUnitario(double precoUnitario){
        if ( precoUnitario > 0){
           this.precoUnitario = precoUnitario;
        }
        else {
            System.out.println("Valor invalido");
        }
    }

    //getter
//    public int getCodigo(){
//        return this.codigo;
//    }
//
//    //setter
//    public void setCodigo(int codigo){
//        this.codigo = codigo;
//    }

    @Override
    public String toString() {
        return "Produto: {" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", precoUnitario=" + precoUnitario +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
