import UtilCarro.Carro;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro(4,"Gol","Cinza");
        Carro c2 = new Carro(1,"Moto","Preto");



        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}