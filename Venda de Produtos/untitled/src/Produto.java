public class Produto extends Venda {
    private String codigoBarras;
    private String descricao;
    private float precoUnit;
    private int quantida;

    public Produto(String docClint, String data, String hora, String codigoBarras, String descricao, float precoUnit, int quantida) {
        super(docClint, data, hora);
        this.codigoBarras = codigoBarras;
        this.descricao = descricao;
        this.precoUnit = precoUnit;
        this.quantida = quantida;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        this.precoUnit = precoUnit;
    }

    public int getQuantida() {
        return quantida;
    }

    public void setQuantida(int quantida) {
        this.quantida = quantida;
    }
}
