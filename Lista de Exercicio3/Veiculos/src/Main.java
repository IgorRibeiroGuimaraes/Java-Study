public class Main {
    public static void main(String[] args) {
    Carro carro1 = new Carro(2000, 20000,"Palio");
    Carro carro2 = new Carro(2004, 15000,"Corsa");
    Carro carro3 = new Carro(2007, 1244722,"GT-R35");

    Moto moto1 = new Moto(2020,1700,"Titan-160");
    Moto moto2 = new Moto(2005,4000,"CG");

        double ipva = carro3.calcIPVA(0.05);
        System.out.println(carro3.modelo + " IPVA: " + ipva);

        boolean verificacao = moto1.verificarAno();
        System.out.println(moto1.modelo + " Verificação: " + verificacao);


    }
}