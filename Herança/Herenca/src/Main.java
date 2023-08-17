import Herenca.Funcionario;
import Herenca.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Igor",1,18,20000);
        System.out.println(f1.getNome() + " " + f1.getBonificacao());


        Gerente g1 = new Gerente("Pedro",2,25,2000,"Vendas");

        System.out.println(g1.getNome() + " " + g1.getBonificao());


    }
}