import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("IGOR", 20, "Mago", 50, 55, 40, 200);
        Person p2 = new Person("DAYANE", 23, "Sniper", 80, 55, 30, 150);
        Person p3 = new Person("HENRIQUE", 24, "Oni", 75, 60, 100, 600);

        System.out.println(p1.Info());
        System.out.println(p2.Info());
        System.out.println(p3.Info());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o 1 personagem: ");
        String personagem = scanner.next();

        System.out.println("Selecione o 2 personagem: ");
        String personagem2 = scanner.next();

        if ((personagem.toUpperCase().equals(p1.nome)) && p1.ataque > p2.defesa) {
            System.out.println("Nome: " + p1.nome + " venceu");
        } else if ((personagem.toUpperCase().equals(p2.nome)) && p2.ataque > p1.defesa) {
            System.out.println("Nome: " + p2.nome + " venceu");
        } else if ((personagem2.toUpperCase().equals(p1.nome)) && p1.ataque > p2.defesa) {
            System.out.println("Nome: " + p1.nome + " venceu");
        } else if ((personagem2.toUpperCase().equals(p2.nome)) && p2.ataque > p1.defesa) {
            System.out.println("Nome: " + p2.nome + " venceu");
        } else if ((personagem.toUpperCase().equals(p3.nome)) && p3.ataque > p1.defesa) {
            System.out.println("Nome: " + p3.nome + " venceu");
        } else if ((personagem.toUpperCase().equals(p3.nome)) && p3.ataque > p2.defesa) {
            System.out.println("Nome: " + p3.nome + " Venceu");
        } else if ((personagem2.toUpperCase().equals(p3.nome)) && p3.ataque > p1.defesa) {
            System.out.println("Nome: " + p3.nome + " Venceu");
        } else if ((personagem2.toUpperCase().equals(p3.nome)) && p3.ataque > p2.defesa) {
            System.out.println("Nome: " + p3.nome + " Venceu");
        } else if ((personagem.toUpperCase().equals(p3.nome)) && p3.defesa > p1.ataque) {
            System.out.println("Nome: " + p3.nome + " Venceu");
        } else if ((personagem2.toUpperCase().equals(p3.nome)) && p3.defesa > p1.ataque) {
            System.out.println("Nome: " + p3.nome + " Venceu");
        } else if ((personagem.toUpperCase().equals(p3.nome)) && p3.defesa > p2.ataque) {
            System.out.println("Nome: " + p3.nome + " Venceu");
        } else if ((personagem2.toUpperCase().equals(p3.nome)) && p3.defesa > p2.ataque) {
            System.out.println("Nome: " + p3.nome + " Venceu");
        }
    }


    }
