//Aluno: Igor Ribeiro Guimrães Curso: 3º Semestre de ESW

//1.Ela é u um dos pilares da orientação a objetos, e ele serve para poder restringir/proteger dados sensíveis ou sigilosos como saldo da conta


//2. Os modificadores de acesso é reponsável definir a acessibilidade do atributo ou método da classe sendo ele (public, protect, default e private).

//  Public: Todas as classes do projeto têm acesso.
//  Protect: Apenas classes do mesmo pacote ou  que estendam da classe têm acesso
//  Default: Apenas classe do mesmo pacote têm acesso.
//  Private: Apenas a própria classe tem acesso.
public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente(1,"Isabela");

       Produto p1 = new Produto("Arroz", 35.90, 1);
       Produto p2 = new Produto("Macarão", 10.00, 2);

        Venda venda = new Venda(1, cliente, p1, p2);
        System.out.println(cliente.toString());
                System.out.println("Valor total da compra = "+ venda.calcTotalVenda());
    }
}