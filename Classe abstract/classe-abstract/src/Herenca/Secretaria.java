package Herenca;

public class Secretaria extends Funcionario{
    public Secretaria(String nome, String document) {
        super(nome, document);
    }

    public int getBonificao(){
        return 12;
    }
}
