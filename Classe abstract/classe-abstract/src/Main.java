import Herenca.Funcionario;
import Herenca.Gerente;
import Herenca.Secretaria;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("João", "1234");

        Funcionario f2 = new Secretaria("Maria","2222");

        System.out.println(f1.getBonificao());
        System.out.println(f2.getBonificao());
    }
}