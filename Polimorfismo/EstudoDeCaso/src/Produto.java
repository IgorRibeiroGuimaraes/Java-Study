public class Produto implements OperacoesBD {
    private int id;
    private String codBarras;
    private String tipo;

    private String descricao;

    public Produto(int id, String codBarras, String tipo, String descricao) {
        this.id = id;
        this.codBarras = codBarras;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String exportaInsertSQL(){
        String sql = "INSERT INTO produt(id, codBarras, tipo, ";
                sql += "Values {";
                sql += Integer.toString(id)+ ", ";
                sql += "\n'" + codBarras;
                sql += "\n'" + tipo ;
                sql += "}";
        return sql;
    }
}


