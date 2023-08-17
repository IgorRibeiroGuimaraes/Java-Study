public class Venda {
    private int codigoVenda;
    private Cliente cliente;
    private Produto p1;
    private Produto p2;

    public Venda(int codigoVenda, Cliente cliente, Produto p1, Produto p2) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.p1 = p1;
        this.p2 = p2;
    }

    public double calcTotalVenda(){
        return this.p1.getPrecoUnitario() + this.p2.getPrecoUnitario();
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getP1() {
        return p1;
    }

    public void setP1(Produto p1) {
        this.p1 = p1;
    }

    public Produto getP2() {
        return p2;
    }

    public void setP2(Produto p2) {
        this.p2 = p2;
    }
}
