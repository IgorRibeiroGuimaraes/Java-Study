package Model;

    public class Funcionario {
    private String nome;
    private String documento;
    private String cargo;

        public Funcionario(String nome, String documento, String cargo) {
            this.nome = nome;
            this.documento = documento;
            this.cargo = cargo;
        }

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getBonificao(){
            if (this.cargo.equals("Gerente")){
                return 8;
            } else if (this.cargo.equals("Secretaria")) {
                return 12;
            }
            return 0;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
