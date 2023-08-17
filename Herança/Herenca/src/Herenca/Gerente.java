package Herenca;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, int matricula, int idade, double salario, String departamento) {
        super(nome, matricula, idade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}' + super.toString();
    }

    public double getBonificao(){
        return super.getSalario() * 0.15;
    }

   /* public double calculaTaxa(){
        return 20.50;
    } */
}
