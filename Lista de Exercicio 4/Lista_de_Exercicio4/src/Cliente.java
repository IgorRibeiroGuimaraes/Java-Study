public class Cliente {
    private int codigoCliente;
    private String nome;

    public Cliente(int codigoCliente, String nome) {
        this.codigoCliente = codigoCliente;
        this.nome = nome;
    }

    //Getter
    public int getCodigoCliente(){
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente){
        this.codigoCliente = codigoCliente;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return"codigo Cliente = " + codigoCliente + ", nome= " + nome;

    }
}
