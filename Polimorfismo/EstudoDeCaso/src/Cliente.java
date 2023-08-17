public class Cliente implements OperacoesBD {
    private int id;
    private String documento;
    private String nome;
    private String telefone;

    public Cliente(int id, String documento, String nome, String telefone) {
        this.id = id;
        this.documento = documento;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static String exportarCreateTableSQL(){
        String sql = "Create table cliente (\n";
                sql += " id INTEGER PRIMARY KEY \n";
                sql += "nome VARCHAR(255) \n";
                sql += "telefo VARCHAR(255) \n";
                sql += "); \n";
        return sql;
    }

    @Override
    public String exportaInsertSQL(){
        String sql = "INSERT INTO cliente(id, documento, nome, telefone";
        sql += "Values {";
        sql += Integer.toString(id)+ ", ";
        sql += " ' " + documento + " ' " + " , ";
        sql +=" ' " +  nome + " ' " + ",";
        sql +=" ' " + telefone + " ' ";
        sql += "} \n";
        return sql;
    }

    public String toString(){
        return "Nome: " + this.nome + " , " + "Documento: " +  this.documento + " , " + "Telfone: "  + this.telefone + "\n" + exportarCreateTableSQL() + exportaInsertSQL()  ;
    }
}
