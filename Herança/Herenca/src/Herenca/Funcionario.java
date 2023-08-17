package Herenca;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int matricula, int idade, double salario) {
        super(nome, matricula, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}' + super.toString();
    }

    public double getBonificacao(){
        return this.salario * 0.10;
    }
}
